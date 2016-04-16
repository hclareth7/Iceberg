/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ObjetivoDAO;
import com.puertobahia.iceberg.entity.Indicador;
import com.puertobahia.iceberg.entity.Objetivo;
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
public class ObjetivoDAOImpl implements ObjetivoDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Objetivo> getAllObjetivo() {
        Criteria crit = getSession().createCriteria(Objetivo.class);
        return crit.list();
    }

    @Override
    public Objetivo getById(Long id) {
        return (Objetivo) getSession()
                .createCriteria(Objetivo.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Objetivo objetivo) {
        getSession().saveOrUpdate(objetivo);
    }

    @Override
    public void delete(Long id) {
        Objetivo objetivo = new Objetivo();
        objetivo.setId(id);
        getSession().delete(objetivo);
    }

}
