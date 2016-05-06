/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.BeneficiarioDAO;
import com.puertobahia.iceberg.dao.ConsejoComunitarioDAO;
import com.puertobahia.iceberg.entity.ConsejoComunitario;
import com.puertobahia.iceberg.service.ConsejoComunitarioService;
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
public class ConsejoComunitarioServiceImpl implements ConsejoComunitarioService{

    
    @Autowired
    ConsejoComunitarioDAO consejoComunitarioDAO;

    @Override
    public List<ConsejoComunitario> getAllConsejoComunitario() {
       return consejoComunitarioDAO.getAllConsejoComunitario();
    }

    @Override
    public ConsejoComunitario getById(Long id) {
        return consejoComunitarioDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(ConsejoComunitario consejoComunitario) {
         consejoComunitarioDAO.saveOrUpdate(consejoComunitario);
    }

    @Override
    public void delete(Long id) {
        consejoComunitarioDAO.delete(id);
    }

    @Override
    public void save(ConsejoComunitario consejoComunitario) {
        consejoComunitarioDAO.save(consejoComunitario);
    }

    @Override
    public void update(ConsejoComunitario consejoComunitario) {
        consejoComunitarioDAO.update(consejoComunitario);
    }
    
}
