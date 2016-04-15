/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;


import com.puertobahia.iceberg.entity.Programacion;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ProgramacionService {

    public List<Programacion> getAllProgramacion();

    public Programacion getById(Long id);

    public void saveOrUpdate(Programacion programacion);

    public void delete(Long id);
}
