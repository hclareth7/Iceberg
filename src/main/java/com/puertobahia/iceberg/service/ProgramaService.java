/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;


import com.puertobahia.iceberg.entity.Programa;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ProgramaService {
    public List<Programa> getAllPrograma();

    public Programa getById(Long id);

    public void save(Programa programa);
    public void update(Programa programa);
    public void saveOrUpdate(Programa programa);

    public void delete(Long id);
}
