/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;


import com.puertobahia.iceberg.entity.Asistencia;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface AsistenciaDAO {
    public List<Asistencia> getAllAsistencia();
    public Asistencia getById(Long id);
    public void saveOrUpdate(Asistencia asistencia);
    public void delete(Long id);
    
}
