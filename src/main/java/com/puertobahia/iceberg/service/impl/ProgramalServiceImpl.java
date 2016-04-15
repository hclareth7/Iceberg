/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ProgramaDAO;
import com.puertobahia.iceberg.entity.Programa;
import com.puertobahia.iceberg.service.ProgramaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Full Stack JavaScrip
 */
public class ProgramalServiceImpl implements ProgramaService{
    
    @Autowired
    ProgramaDAO programaDAO;

    @Override
    public List<Programa> getAllPrograma() {
        return programaDAO.getAllPrograma();
    }

    @Override
    public Programa getById(Long id) {
        return programaDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Programa programa) {
        programaDAO.saveOrUpdate(programa);
    }

    @Override
    public void delete(Long id) {
        programaDAO.delete(id);
    }
}
