/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Zona;
import com.puertobahia.iceberg.service.ZonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author William
 */
@RestController
@RequestMapping("/zona")
public class ZonaController {
    
    @Autowired
    ZonaService zonaService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public List<Zona> getAllZona() {
        return zonaService.getAllZona();
        //return "HOLA";
    }
    
   
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public Zona getZonaById(@PathVariable Long id) {
        
        Zona zona = zonaService.getById(id);
        if (zona!=null) {
            // whatever
            return zona;
        }
        else {
            throw new ResourceNotFoundException(); 
        }
        
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Zona createZona(@RequestBody Zona zona) {
        zonaService.save(zona);
        return zona;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Zona updateZona(@RequestBody Zona zona) {
        zonaService.update(zona);
        return zona;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE, consumes = "application/json")
    public Zona DeleteZona(@PathVariable Long id) {
        Zona zona=new Zona();
        zonaService.delete(id);
        return zona;
    }
    
    
    
}
