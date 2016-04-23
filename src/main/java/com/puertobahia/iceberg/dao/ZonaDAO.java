/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Zona;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ZonaDAO {
    public List<Zona> getAllZona();

    public Zona getById(Long id);

    public void saveOrUpdate(Zona zona);

    public void delete(Long id);
    
}
