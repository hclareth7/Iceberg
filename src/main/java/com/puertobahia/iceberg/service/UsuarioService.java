/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service;

import com.puertobahia.iceberg.entity.Usuario;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface UsuarioService {

    public List<Usuario> getAllUsuario();

    public Usuario getById(Long id);

    public void saveOrUpdate(Usuario usuario);

    public void delete(Long id);
}
