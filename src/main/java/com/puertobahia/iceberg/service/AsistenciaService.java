/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;

import com.puertobahia.iceberg.entity.Asistencia;
import java.util.List;

/**
 *
 * @author CX612PF
 */
public interface AsistenciaService {
    public List<Asistencia> getAllAsistencia();
    public Asistencia getById(Long id);
    public void save(Asistencia asistencia);
    public void update(Asistencia asistencia);
    public void saveOrUpdate(Asistencia asistencia);
    public void delete(Long id);
}
