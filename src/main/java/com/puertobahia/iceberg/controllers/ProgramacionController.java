/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Programacion;
import com.puertobahia.iceberg.service.ProgramacionService;
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
        if(programacion != null){
            return programacion;
        }
        else{
            throw new ResourceNotFoundException();
        }

    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Programacion createProgramacion(@RequestBody Programacion programacion) {
        programacionService.save(programacion);
        return programacion;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Programacion updateProgramacion(@RequestBody Programacion programacion) {
        programacionService.update(programacion);
        return programacion;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Programacion> deleteProgramacion(@PathVariable("id") Long id) {

        programacionService.delete(id);
        return new ResponseEntity<Programacion>(HttpStatus.NO_CONTENT);
    }
    
}
