/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.ZonaDAO;
import com.puertobahia.iceberg.entity.Zona;
import com.puertobahia.iceberg.service.ZonaService;
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
public class ZonaServiceImpl implements ZonaService {

    @Autowired
    ZonaDAO zonaDAO;

    @Override
    public List<Zona> getAllZona() {
        return zonaDAO.getAllZona();
    }

    @Override
    public Zona getById(Long id) {
        return zonaDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Zona zona) {
        zonaDAO.saveOrUpdate(zona);
    }

    @Override
    public void delete(Long id) {
        zonaDAO.delete(id);
    }

    @Override
    public void save(Zona zona) {
        zonaDAO.save(zona);
    }

    @Override
    public void update(Zona zona) {
        zonaDAO.update(zona);
    }

    
}
