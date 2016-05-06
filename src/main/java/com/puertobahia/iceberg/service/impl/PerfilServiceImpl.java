/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.PerfilDAO;
import com.puertobahia.iceberg.entity.Perfil;
import com.puertobahia.iceberg.service.PerfilService;
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
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    PerfilDAO perfilDAO;

    @Override
    public List<Perfil> getAllPerfil() {
        return perfilDAO.getAllPerfil();
    }

    @Override
    public Perfil getById(Long id) {
        return perfilDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Perfil perfil) {
        perfilDAO.saveOrUpdate(perfil);
    }

    @Override
    public void delete(Long id) {
        perfilDAO.delete(id);
    }

    @Override
    public void save(Perfil perfil) {
        perfilDAO.save(perfil);
    }

    @Override
    public void update(Perfil perfil) {
        perfilDAO.update(perfil);
        
    }
}
