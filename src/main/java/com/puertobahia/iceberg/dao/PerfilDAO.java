/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Perfil;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface PerfilDAO {

    public List<Perfil> getAllPerfil();

    public Perfil getById(Long id);
    
    public void save(Perfil perfil);
    public void update(Perfil perfil);
    public void saveOrUpdate(Perfil perfil);

    public void delete(Long id);
}
