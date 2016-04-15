/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ActividadDAO;
import com.puertobahia.iceberg.entity.Actividad;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
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
public class ActividadDAOImpl implements ActividadDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Actividad> getAllActividad() {
        Criteria crit = getSession().createCriteria(Actividad.class);
        return crit.list();
    }

    @Override
    public Actividad getById(Long id) {
        return (Actividad) getSession()
                .createCriteria(Actividad.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Actividad actividad) {
        getSession().saveOrUpdate(actividad);
    }

    @Override
    public void delete(Long id) {
        Actividad actividad = new Actividad();
        actividad.setId(id);
        getSession().delete(actividad);
    }
}
