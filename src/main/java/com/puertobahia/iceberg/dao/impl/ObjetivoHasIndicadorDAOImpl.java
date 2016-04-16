/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.ObjetivoHasIndicadorDAO;
import com.puertobahia.iceberg.entity.ObjetivoHasIndicador;
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
public class ObjetivoHasIndicadorDAOImpl implements ObjetivoHasIndicadorDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<ObjetivoHasIndicador> getAllObjetivoHasIndicador() {
        Criteria crit = getSession().createCriteria(ObjetivoHasIndicador.class);
        return crit.list();
    }

    @Override
    public ObjetivoHasIndicador getById(Long id) {
        return (ObjetivoHasIndicador) getSession()
                .createCriteria(ObjetivoHasIndicador.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(ObjetivoHasIndicador objetivoHasIndicador) {
         getSession().saveOrUpdate(objetivoHasIndicador);
    }

    @Override
    public void delete(Long id) {
        ObjetivoHasIndicador objetivoHasIndicador = new ObjetivoHasIndicador();
        objetivoHasIndicador.setId(id);
        getSession().delete(objetivoHasIndicador);
    }

}
