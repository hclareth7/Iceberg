/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ObjetivoDAO;
import com.puertobahia.iceberg.entity.Objetivo;
import com.puertobahia.iceberg.service.ObjetivoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Full Stack JavaScrip
 */
public class ObjetivoServiceImpl implements ObjetivoService{
    
    @Autowired
    ObjetivoDAO objetivoDAO;

    @Override
    public List<Objetivo> getAllObjetivo() {
        return objetivoDAO.getAllObjetivo();
    }

    @Override
    public Objetivo getById(Long id) {
        return objetivoDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Objetivo objetivo) {
        objetivoDAO.saveOrUpdate(objetivo);
    }

    @Override
    public void delete(Long id) {
        objetivoDAO.delete(id);
    }
}
