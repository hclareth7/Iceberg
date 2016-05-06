/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.dao;

import com.puertobahia.iceberg.entity.ConsejoComunitario;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ConsejoComunitarioDAO {
    public List<ConsejoComunitario> getAllConsejoComunitario();
    public ConsejoComunitario getById(Long id);
    public void save(ConsejoComunitario consejoComunitario);
    public void update(ConsejoComunitario consejoComunitario);
    public void saveOrUpdate(ConsejoComunitario consejoComunitario);
    public void delete(Long id);
}
