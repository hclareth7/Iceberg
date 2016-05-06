/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.AsistenciaDAO;
import com.puertobahia.iceberg.entity.Asistencia;
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
public class AsistenciaDAOImpl implements AsistenciaDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Asistencia> getAllAsistencia() {
        Criteria crit = getSession().createCriteria(Asistencia.class);
        return crit.list();
    }

    @Override
    public Asistencia getById(Long id) {
        return (Asistencia) getSession()
                .createCriteria(Asistencia.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Asistencia asistencia) {
        getSession().saveOrUpdate(asistencia);
    }

    @Override
    public void delete(Long id) {
        Asistencia asistencia = new Asistencia();
        asistencia.setId(id);
        getSession().delete(asistencia);
    }

    @Override
    public void save(Asistencia asistencia) {
        getSession().save(asistencia);
    }

    @Override
    public void update(Asistencia asistencia) {
        getSession().update(asistencia);
    }

}
