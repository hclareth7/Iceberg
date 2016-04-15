/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Objetivo;
import com.puertobahia.iceberg.service.ObjetivoService;
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
@RequestMapping("/objetivo")
public class ObjetivoController {
    
    @Autowired
    ObjetivoService objetivoService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Objetivo> getAllObjetivo() {
        return objetivoService.getAllObjetivo();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Objetivo getObjetivoById(@PathVariable Long id) {
        Objetivo objetivo = objetivoService.getById(id);
        return objetivo;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Objetivo createObjetivo(@RequestBody Objetivo objetivo) {
        objetivoService.saveOrUpdate(objetivo);
        return objetivo;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Objetivo updateObjetivo(@RequestBody Objetivo objetivo) {
        objetivoService.saveOrUpdate(objetivo);
        return objetivo;
    }
    
    
    
}
