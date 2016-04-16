/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ObjetivoHasIndicadorDAO;
import com.puertobahia.iceberg.entity.ObjetivoHasIndicador;
import com.puertobahia.iceberg.service.ObjetivoHasIndicadorService;
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
public class ObjetivoHasIndicadorServiceImpl implements ObjetivoHasIndicadorService{
    
    @Autowired
    ObjetivoHasIndicadorDAO objetivoHasIndicadorDAODAO;

    @Override
    public List<ObjetivoHasIndicador> getAllObjetivoHasIndicador() {
        return objetivoHasIndicadorDAODAO.getAllObjetivoHasIndicador();
    }

    @Override
    public ObjetivoHasIndicador getById(Long id) {
        return objetivoHasIndicadorDAODAO.getById(id);
    }

    @Override
    public void saveOrUpdate(ObjetivoHasIndicador objetivoHasIndicador) {
        objetivoHasIndicadorDAODAO.saveOrUpdate(objetivoHasIndicador);
    }

    @Override
    public void delete(Long id) {
        objetivoHasIndicadorDAODAO.delete(id);
    }
}
