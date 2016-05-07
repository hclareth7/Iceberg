/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.config.security.ResourceNotFoundException;
import com.puertobahia.iceberg.entity.Empleado;
import com.puertobahia.iceberg.service.EmpleadoService;
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
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    EmpleadoService empleadoService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Empleado> getAllEmpleado() {
        return empleadoService.getAllEmpleado();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Empleado getEmpleadoById(@PathVariable Long id) {
        Empleado empleado = empleadoService.getById(id);
        if (empleado!=null) {
            // whatever
            return empleado;
        }
        else {
            throw new ResourceNotFoundException(); 
        }
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        empleadoService.save(empleado);
        return empleado;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Empleado updateEmpleado(@RequestBody Empleado empleado) {
        empleadoService.update(empleado);
        return empleado;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Empleado> deleteEmpleado(@PathVariable("id") Long id) {

        empleadoService.delete(id);
        return new ResponseEntity<Empleado>(HttpStatus.NO_CONTENT);
    }
    
}
