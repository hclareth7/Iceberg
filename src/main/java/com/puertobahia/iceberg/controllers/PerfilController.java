/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Perfil;
import com.puertobahia.iceberg.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        if (perfil!=null) {
            // whatever
            return perfil;
        }
        else {
            throw new ResourceNotFoundException(); 
        }

    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody Perfil createPerfil(@RequestBody Perfil perfil) {
        perfilService.save(perfil);
        return perfil;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public @ResponseBody Perfil updatePerfil(@RequestBody Perfil perfil) {
        perfilService.update(perfil);
        return perfil;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Perfil> deletePerfil(@PathVariable("id") Long id) {

        perfilService.delete(id);
        return new ResponseEntity<Perfil>(HttpStatus.NO_CONTENT);
    }
    
}
