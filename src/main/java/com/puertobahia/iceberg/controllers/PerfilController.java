/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Perfil;
import com.puertobahia.iceberg.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author William
 */
@Controller
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    PerfilService perfilService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Perfil> getAllPerfil() {
        return perfilService.getAllPerfil();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Perfil getPerfilById(@PathVariable Long id) {
        Perfil perfil = perfilService.getById(id);
        return perfil;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Perfil createPerfil(@RequestBody Perfil perfil) {
        perfilService.saveOrUpdate(perfil);
        return perfil;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Perfil updatePerfil(@RequestBody Perfil perfil) {
        perfilService.saveOrUpdate(perfil);
        return perfil;
    }
    
    
    
}
