/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.Objetivo;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ObjetivoDAO {
    public List<Objetivo> getAllObjetivo();

    public Objetivo getById(Long id);

    public void saveOrUpdate(Objetivo objetivo);

    public void delete(Long id);
}
