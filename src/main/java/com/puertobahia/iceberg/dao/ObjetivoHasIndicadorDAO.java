/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.ObjetivoHasIndicador;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ObjetivoHasIndicadorDAO {

    public List<ObjetivoHasIndicador> getAllObjetivoHasIndicador();

    public ObjetivoHasIndicador getById(Long id);

    public void save(ObjetivoHasIndicador objetivoHasIndicador);
    public void update(ObjetivoHasIndicador objetivoHasIndicador);
    public void saveOrUpdate(ObjetivoHasIndicador objetivoHasIndicador);

    public void delete(Long id);
}
