/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;


import com.puertobahia.iceberg.entity.Actividad;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ActividadService {
    
    public List<Actividad> getAllActividad();
    public Actividad getById(Long id);
    public void saveOrUpdate(Actividad actividad);
    public void delete(Long id);
    
    
}
