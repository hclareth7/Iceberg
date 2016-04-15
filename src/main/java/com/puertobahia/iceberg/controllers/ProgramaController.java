/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Programa;
import com.puertobahia.iceberg.service.ProgramaService;
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
        return programa;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Programa createPrograma(@RequestBody Programa programa) {
        programaService.saveOrUpdate(programa);
        return programa;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Programa updatePrograma(@RequestBody Programa programa) {
        programaService.saveOrUpdate(programa);
        return programa;
    }
    
    
    
}
