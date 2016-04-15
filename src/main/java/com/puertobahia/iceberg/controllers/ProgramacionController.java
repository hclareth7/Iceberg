/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Programacion;
import com.puertobahia.iceberg.service.ProgramacionService;
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
@RequestMapping("/programacion")
public class ProgramacionController {
    
    @Autowired
    ProgramacionService programacionService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Programacion> getAllProgramacion() {
        return programacionService.getAllProgramacion();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Programacion getProgramacionById(@PathVariable Long id) {
        Programacion programacion = programacionService.getById(id);
        return programacion;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Programacion createProgramacion(@RequestBody Programacion programacion) {
        programacionService.saveOrUpdate(programacion);
        return programacion;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Programacion updateProgramacion(@RequestBody Programacion programacion) {
        programacionService.saveOrUpdate(programacion);
        return programacion;
    }
    
    
    
}
