/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ActividadDAO;
import com.puertobahia.iceberg.entity.Actividad;
import com.puertobahia.iceberg.service.ActividadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Full Stack JavaScrip
 */

@Service
@Transactional
public class ActividadServiceImpl implements ActividadService{
    
    @Autowired
    ActividadDAO actividadDAO;

    @Override
    public List<Actividad> getAllActividad() {
        return actividadDAO.getAllActividad();
    }

    @Override
    public Actividad getById(Long id) {
        return actividadDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Actividad actividad) {
        actividadDAO.saveOrUpdate(actividad);
    }

    @Override
    public void delete(Long id) {
        actividadDAO.delete(id);
    }

    @Override
    public void save(Actividad actividad) {
        actividadDAO.save(actividad);
    }

    @Override
    public void update(Actividad actividad) {
        actividadDAO.update(actividad);
    }
}
