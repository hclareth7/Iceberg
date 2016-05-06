/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ConsejoComunitarioDAO;
import com.puertobahia.iceberg.entity.Beneficiario;
import com.puertobahia.iceberg.entity.ConsejoComunitario;
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

public class ConsejoComunitarioDAOImpl implements ConsejoComunitarioDAO{
@Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<ConsejoComunitario> getAllConsejoComunitario() {
        Criteria crit = getSession().createCriteria(ConsejoComunitario.class);
        return crit.list();
    }

    @Override
    public ConsejoComunitario getById(Long id) {
        return (ConsejoComunitario) getSession()
                .createCriteria(Beneficiario.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(ConsejoComunitario consejoComunitario) {
        getSession().saveOrUpdate(consejoComunitario);
    }

    @Override
    public void delete(Long id) {
        ConsejoComunitario consejoComunitario = new ConsejoComunitario();
        consejoComunitario.setId(id);
        getSession().delete(consejoComunitario);
    }

    @Override
    public void save(ConsejoComunitario consejoComunitario) {
        getSession().save(consejoComunitario);
    }

    @Override
    public void update(ConsejoComunitario consejoComunitario) {
        getSession().update(consejoComunitario);
    }

}
