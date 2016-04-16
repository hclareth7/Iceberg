/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.BeneficiarioDAO;
import com.puertobahia.iceberg.entity.Beneficiario;
import com.puertobahia.iceberg.service.BeneficiarioService;
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
public class BeneficiarioServiceImpl implements BeneficiarioService{
    
    @Autowired
    BeneficiarioDAO beneficiarioDAO;

    @Override
    public List<Beneficiario> getAllBeneficiario() {
        return beneficiarioDAO.getAllBeneficiario();
    }

    @Override
    public Beneficiario getById(Long id) {
        return beneficiarioDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Beneficiario beneficiario) {
        beneficiarioDAO.saveOrUpdate(beneficiario);
    }

    @Override
    public void delete(Long id) {
        beneficiarioDAO.delete(id);
    }
}
