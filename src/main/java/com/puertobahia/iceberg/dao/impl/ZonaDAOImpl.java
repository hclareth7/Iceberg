/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ZonaDAO;
import com.puertobahia.iceberg.entity.ConsejoComunitario;
import com.puertobahia.iceberg.entity.Zona;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Full Stack JavaScrip
 */
@Repository
public class ZonaDAOImpl implements ZonaDAO {

    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    ConsejoComunitarioDAOImpl consejo;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Zona> getAllZona() {
        Criteria crit = getSession().createCriteria(Zona.class);

        //crit.add(Restrictions.eq("consejos_comunitario.estado", 0));
        return crit.list();
    }

    @Override
    public Zona getById(Long id) {
        Criteria crit = getSession().createCriteria(Zona.class);
        crit.add(Restrictions.idEq(id));
        crit.setFetchMode("usuario", FetchMode.JOIN);
        crit.setFetchMode("usuario.empleado", FetchMode.JOIN);
        crit.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        crit.setFetchMode("consejos_comunitario", FetchMode.JOIN);
        crit.createAlias("consejos_comunitario", "consejo", JoinType.LEFT_OUTER_JOIN);
        crit.add(Restrictions.or(
                Restrictions.and(Restrictions.eq("consejo.estado", 0)), Restrictions.isNull("consejo.estado")));
        return (Zona) crit.uniqueResult();
        /*Criteria crit = getSession().createCriteria(Zona.class);
         crit.add(Restrictions.idEq(id));
         crit.setFetchMode("usuario", FetchMode.JOIN);
         crit.setFetchMode("usuario.empleado", FetchMode.JOIN);
         crit.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
         Zona zona = (Zona) crit.uniqueResult();
         Criteria crit2 = getSession().createCriteria(ConsejoComunitario.class);
         zona.setConsejos_comunitario(crit2.add(Restrictions.and(Restrictions.idEq(zona.getId()),Restrictions.eq("estado", 0))).list());
         return zona;*/
    }

    @Override
    public void saveOrUpdate(Zona zona) {
        getSession().saveOrUpdate(zona);
    }

    @Override
    public void delete(Long id) {
        Zona zona = new Zona();
        zona.setId(id);
        getSession().delete(zona);
    }

    @Override
    public void save(Zona zona) {
        getSession().save(zona);
    }

}
