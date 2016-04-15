/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Beneficiario;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface BeneficiarioDAO {
    public List<Beneficiario> getAllBeneficiario();
    public Beneficiario getById(Long id);
    public void saveOrUpdate(Beneficiario beneficiario);
    public void delete(Long id);
}
