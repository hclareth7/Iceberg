/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ProgramacionDAO;
import com.puertobahia.iceberg.entity.Programacion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Full Stack JavaScrip
 */
public class ProgramacionDAOImpl implements ProgramacionDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Programacion> getAllProgramacion() {
        Criteria crit = getSession().createCriteria(Programacion.class);
        return crit.list();
    }

    @Override
    public Programacion getById(Long id) {
        return (Programacion) getSession()
                .createCriteria(Programacion.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Programacion programacion) {
        getSession().saveOrUpdate(programacion);
    }

    @Override
    public void delete(Long id) {
        Programacion programacion = new Programacion();
        programacion.setId(id);
        getSession().delete(programacion);
    }

}
