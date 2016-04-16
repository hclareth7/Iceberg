/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ZonaDAO;
import com.puertobahia.iceberg.entity.Zona;
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
public class ZonaDAOImpl implements ZonaDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Zona> getAllZona() {
        Criteria crit = getSession().createCriteria(Zona.class);
        return crit.list();
    }

    @Override
    public Zona getById(Long id) {
        return (Zona) getSession()
                .createCriteria(Zona.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
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

}
