/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Asistencia;
import com.puertobahia.iceberg.service.AsistenciaService;
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
@RequestMapping("/asistencia")
public class AsistenciaController {
    
    @Autowired
    AsistenciaService asistenciaService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Asistencia> getAllAsistencia() {
        return asistenciaService.getAllAsistencia();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Asistencia getAsistenciaById(@PathVariable Long id) {
        Asistencia asistencia = asistenciaService.getById(id);
        return asistencia;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Asistencia createAsistencia(@RequestBody Asistencia asistencia) {
        asistenciaService.saveOrUpdate(asistencia);
        return asistencia;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Asistencia updateAsistencia(@RequestBody Asistencia asistencia) {
        asistenciaService.saveOrUpdate(asistencia);
        return asistencia;
    }
    
    
    
}