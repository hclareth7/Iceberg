/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ProgramaDAO;
import com.puertobahia.iceberg.entity.Programa;
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
public class ProgramaDAOImpl implements ProgramaDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Programa> getAllPrograma() {
        Criteria crit = getSession().createCriteria(Programa.class);
        return crit.list();
    }

    @Override
    public Programa getById(Long id) {
        return (Programa) getSession()
                .createCriteria(Programa.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Programa programa) {
        getSession().saveOrUpdate(programa);
    }

    @Override
    public void delete(Long id) {
        Programa programa = new Programa();
        programa.setId(id);
        getSession().delete(programa);
    }

}
