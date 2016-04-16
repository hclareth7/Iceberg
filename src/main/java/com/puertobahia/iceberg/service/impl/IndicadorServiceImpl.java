/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.IndicadorDAO;
import com.puertobahia.iceberg.entity.Indicador;
import com.puertobahia.iceberg.service.IndicadorService;
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
public class IndicadorServiceImpl implements IndicadorService{
    
    @Autowired
    IndicadorDAO indicadorDAO;

    @Override
    public List<Indicador> getAllIndicador() {
        return indicadorDAO.getAllIndicador();
    }

    @Override
    public Indicador getById(Long id) {
        return indicadorDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Indicador indicador) {
        indicadorDAO.saveOrUpdate(indicador);
    }

    @Override
    public void delete(Long id) {
        indicadorDAO.delete(id);
    }
}
