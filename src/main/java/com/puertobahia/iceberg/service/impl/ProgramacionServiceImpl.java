/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ProgramacionDAO;
import com.puertobahia.iceberg.entity.Programacion;
import com.puertobahia.iceberg.service.ProgramacionService;
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
public class ProgramacionServiceImpl implements ProgramacionService{
    
    @Autowired
    ProgramacionDAO programacionDAO;

    @Override
    public List<Programacion> getAllProgramacion() {
        return programacionDAO.getAllProgramacion();
    }

    @Override
    public Programacion getById(Long id) {
        return programacionDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Programacion programacion) {
        programacionDAO.saveOrUpdate(programacion);
    }

    @Override
    public void delete(Long id) {
        programacionDAO.delete(id);
    }
}
