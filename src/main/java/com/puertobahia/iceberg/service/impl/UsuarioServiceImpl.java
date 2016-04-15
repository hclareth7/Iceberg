/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.service.impl;

import com.puertobahia.iceberg.dao.UsuarioDAO;
import com.puertobahia.iceberg.entity.Usuario;
import com.puertobahia.iceberg.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Full Stack JavaScrip
 */
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioDAO.getAllUsuario();
    }

    @Override
    public Usuario getById(Long id) {
        return usuarioDAO.getById(id);
    }

    @Override
    public void saveOrUpdate(Usuario usuario) {
        usuarioDAO.saveOrUpdate(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioDAO.delete(id);
    }
}
