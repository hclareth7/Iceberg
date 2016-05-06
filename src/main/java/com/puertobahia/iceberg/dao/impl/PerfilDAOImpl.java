/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.PerfilDAO;
import com.puertobahia.iceberg.entity.Perfil;
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
public class PerfilDAOImpl implements PerfilDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Perfil> getAllPerfil() {
        Criteria crit = getSession().createCriteria(Perfil.class);
         
        return crit.list();
    }

    @Override
    public Perfil getById(Long id) {
        return (Perfil) getSession()
                .createCriteria(Perfil.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Perfil perfil) {
        getSession().saveOrUpdate(perfil);
    }

    @Override
    public void delete(Long id) {
        Perfil perfil = new Perfil();
        perfil.setId(id);
        getSession().delete(perfil);
    }

    @Override
    public void save(Perfil perfil) {
        getSession().save(perfil);
    }

    @Override
    public void update(Perfil perfil) {
        getSession().update(perfil);
    }

}
