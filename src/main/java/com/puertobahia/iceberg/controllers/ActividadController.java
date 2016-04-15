/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Actividad;
import com.puertobahia.iceberg.service.ActividadService;
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
        Actividad a = actividadService.getById(id);
        return a;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Actividad createActividad(@RequestBody Actividad actividad) {
        actividadService.saveOrUpdate(actividad);
        return actividad;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Actividad updateActividad(@RequestBody Actividad actividad) {
        actividadService.saveOrUpdate(actividad);
        return actividad;
    }
    
    
    
}
