/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Programacion;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ProgramacionDAO {

    public List<Programacion> getAllProgramacion();

    public Programacion getById(Long id);
    
    public void save(Programacion programacion);
    public void update(Programacion programacion);
    public void saveOrUpdate(Programacion programacion);

    public void delete(Long id);
}
