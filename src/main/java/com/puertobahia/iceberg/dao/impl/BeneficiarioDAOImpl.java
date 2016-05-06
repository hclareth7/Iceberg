/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.BeneficiarioDAO;
import com.puertobahia.iceberg.entity.Beneficiario;
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
public class BeneficiarioDAOImpl implements BeneficiarioDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Beneficiario> getAllBeneficiario() {
        Criteria crit = getSession().createCriteria(Beneficiario.class);
        return crit.list();
    }

    @Override
    public Beneficiario getById(Long id) {
        return (Beneficiario) getSession()
                .createCriteria(Beneficiario.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Beneficiario beneficiario) {
        getSession().saveOrUpdate(beneficiario);
    }

    @Override
    public void delete(Long id) {
        Beneficiario beneficiario = new Beneficiario();
        beneficiario.setId(id);
        getSession().delete(beneficiario);
    }

    @Override
    public void save(Beneficiario beneficiario) {
        getSession().save(beneficiario);
    }

    @Override
    public void update(Beneficiario beneficiario) {
        getSession().update(beneficiario);
    }

}
