/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Programa;
import com.puertobahia.iceberg.service.ProgramaService;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author William
 */
@RestController
@RequestMapping("/programa")
public class ProgramaController {
    
    @Autowired
    ProgramaService programaService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Programa> getAllPrograma() {
        return programaService.getAllPrograma();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Programa getProgramaById(@PathVariable Long id) {
        Programa programa = programaService.getById(id);
        if (programa!=null) {
            // whatever
            return programa;
        }
        else {
            throw new ResourceNotFoundException(); 
        }
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public String createPrograma(@RequestBody Programa programa) {
        programaService.save(programa);
        return "DFDFDS";
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Programa updatePrograma(@RequestBody Programa programa) {
        programaService.update(programa);
        return programa;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Programa> deletePrograma(@PathVariable("id") Long id) {

        programaService.delete(id);
        return new ResponseEntity<Programa>(HttpStatus.NO_CONTENT);
    }
    
    
    
}
