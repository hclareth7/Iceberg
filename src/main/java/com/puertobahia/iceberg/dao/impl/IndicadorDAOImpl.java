/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.IndicadorDAO;
import com.puertobahia.iceberg.entity.Indicador;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Full Stack JavaScrip
 */
@Repository
public class IndicadorDAOImpl implements IndicadorDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Indicador> getAllIndicador() {
        Criteria crit = getSession().createCriteria(Indicador.class);
        return crit.list();
    }

    @Override
    public Indicador getById(Long id) {
        return (Indicador) getSession()
                .createCriteria(Indicador.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Indicador indicador) {
        getSession().saveOrUpdate(indicador);
    }

    @Override
    public void delete(Long id) {
        Indicador indicador = new Indicador();
        indicador.setId(id);
        getSession().delete(indicador);
    }

    @Override
    public void save(Indicador indicador) {
        getSession().save(indicador);
    }

    @Override
    public void update(Indicador indicador) {
        getSession().update(indicador);
    }

}
