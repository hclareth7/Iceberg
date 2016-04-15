/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Empleado;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface EmpleadoDAO {
    public List<Empleado> getAllEmpleado();
    public Empleado getById(Long id);
    public void saveOrUpdate(Empleado empleado);
    public void delete(Long id);
    
    
}
