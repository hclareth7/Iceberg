/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.ObjetivoHasIndicador;
import com.puertobahia.iceberg.service.ObjetivoHasIndicadorService;
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
        return objetivoHasIndicador;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody ObjetivoHasIndicador createObjetivoHasIndicador(@RequestBody ObjetivoHasIndicador objetivoHasIndicador) {
        objetivoHasIndicadorService.saveOrUpdate(objetivoHasIndicador);
        return objetivoHasIndicador;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody ObjetivoHasIndicador updateObjetivoHasIndicador(@RequestBody ObjetivoHasIndicador objetivoHasIndicador) {
        objetivoHasIndicadorService.saveOrUpdate(objetivoHasIndicador);
        return objetivoHasIndicador;
    }
    
    
    
}
