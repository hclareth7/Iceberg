/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.ObjetivoHasIndicador;
import com.puertobahia.iceberg.service.ObjetivoHasIndicadorService;
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
@RequestMapping("/objetivoHasIndicador")
public class ObjetivoHasIndicadorController {
    
    @Autowired
    ObjetivoHasIndicadorService objetivoHasIndicadorService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<ObjetivoHasIndicador> getAllObjetivoHasIndicador() {
        return objetivoHasIndicadorService.getAllObjetivoHasIndicador();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody ObjetivoHasIndicador getObjetivoHasIndicadorById(@PathVariable Long id) {
        ObjetivoHasIndicador objetivoHasIndicador = objetivoHasIndicadorService.getById(id);
        if (objetivoHasIndicador!=null) {
            // whatever
            return objetivoHasIndicador;
        }
        else {
            throw new ResourceNotFoundException(); 
        }
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public ObjetivoHasIndicador createObjetivoHasIndicador(@RequestBody ObjetivoHasIndicador objetivoHasIndicador) {
        objetivoHasIndicadorService.save(objetivoHasIndicador);
        return objetivoHasIndicador;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public ObjetivoHasIndicador updateObjetivoHasIndicador(@RequestBody ObjetivoHasIndicador objetivoHasIndicador) {
        objetivoHasIndicadorService.update(objetivoHasIndicador);
        return objetivoHasIndicador;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<ObjetivoHasIndicador> deleteObjetivoHasIndicador(@PathVariable("id") Long id) {

        objetivoHasIndicadorService.delete(id);
        return new ResponseEntity<ObjetivoHasIndicador>(HttpStatus.NO_CONTENT);
    }
    
    
}
