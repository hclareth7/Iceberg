/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Actividad;
import com.puertobahia.iceberg.service.ActividadService;
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
@RequestMapping("/actividad")
public class ActividadController {
    
    @Autowired
    ActividadService actividadService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Actividad> getAllActividad() {
        return actividadService.getAllActividad();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Actividad getActividadById(@PathVariable Long id) {
        Actividad actividad = actividadService.getById(id);
        if (actividad!=null) {
            // whatever
            return actividad;
        }
        else {
            throw new ResourceNotFoundException(); 
        }
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody Actividad createActividad(@RequestBody Actividad actividad) {
        actividadService.save(actividad);
        return actividad;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public @ResponseBody Actividad updateActividad(@RequestBody Actividad actividad) {
        actividadService.update(actividad);
        return actividad;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Actividad> deleteActividad(@PathVariable("id") Long id) {

        actividadService.delete(id);
        return new ResponseEntity<Actividad>(HttpStatus.NO_CONTENT);
    }
    
}
