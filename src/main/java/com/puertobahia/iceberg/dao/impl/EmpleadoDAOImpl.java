/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao.impl;

import com.puertobahia.iceberg.dao.EmpleadoDAO;
import com.puertobahia.iceberg.entity.Empleado;
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
public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Empleado> getAllEmpleado() {
        Criteria crit = getSession().createCriteria(Empleado.class);
        return crit.list();
    }

    @Override
    public Empleado getById(Long id) {
        return (Empleado) getSession()
                .createCriteria(Empleado.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void saveOrUpdate(Empleado empleado) {
        getSession().saveOrUpdate(empleado);
    }

    @Override
    public void delete(Long id) {
        Empleado empleado = new Empleado();
        empleado.setId(id);
        getSession().delete(empleado);
    }

}
