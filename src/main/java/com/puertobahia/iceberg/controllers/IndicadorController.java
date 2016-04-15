/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Indicador;
import com.puertobahia.iceberg.service.IndicadorService;
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
@RequestMapping("/indicador")
public class IndicadorController {
    
    @Autowired
    IndicadorService indicadorService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Indicador> getAllIndicador() {
        return indicadorService.getAllIndicador();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Indicador getIndicadorById(@PathVariable Long id) {
        Indicador indicador = indicadorService.getById(id);
        return indicador;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Indicador createIndicador(@RequestBody Indicador indicador) {
        indicadorService.saveOrUpdate(indicador);
        return indicador;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Indicador updateIndicador(@RequestBody Indicador indicador) {
        indicadorService.saveOrUpdate(indicador);
        return indicador;
    }
    
    
    
}
