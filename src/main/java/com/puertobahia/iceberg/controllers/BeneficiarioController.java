/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;


import com.puertobahia.iceberg.entity.Beneficiario;
import com.puertobahia.iceberg.service.BeneficiarioService;
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
@RequestMapping("/beneficiario")
public class BeneficiarioController {
    
    @Autowired
    BeneficiarioService beneficiarioService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Beneficiario> getAllBeneficiario() {
        return beneficiarioService.getAllBeneficiario();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Beneficiario getBeneficiarioById(@PathVariable Long id) {
        Beneficiario beneficiario = beneficiarioService.getById(id);
        return beneficiario;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Beneficiario createBeneficiario(@RequestBody Beneficiario beneficiario) {
        beneficiarioService.saveOrUpdate(beneficiario);
        return beneficiario;
    }
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Beneficiario updateBeneficiario(@RequestBody Beneficiario beneficiario) {
        beneficiarioService.saveOrUpdate(beneficiario);
        return beneficiario;
    }
    
    
    
}
