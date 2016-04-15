/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;

import com.puertobahia.iceberg.entity.Indicador;
import java.util.List;

/**
 *
 * @author CX612PF
 */
public interface IndicadorService {
    public List<Indicador> getAllIndicador();

    public Indicador getById(Long id);

    public void saveOrUpdate(Indicador indicador);

    public void delete(Long id);
}
