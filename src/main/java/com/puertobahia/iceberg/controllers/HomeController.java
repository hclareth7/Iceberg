/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puertobahia.iceberg.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Full Stack JavaScrip
 */

@Controller
@RequestMapping("/home")
public class HomeController {



    @Autowired
    //ToDoService service;

    @RequestMapping(value={"/test"}, method = RequestMethod.GET)
    public @ResponseBody String test() {
        return "Hola Mundo!";
    }
    /**
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<ToDo> getAll() {
        return service.getAllToDos();
    }

    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody ToDo getById(Long id) {
        return service.getToDoById(id);
    }
    **/
}

