package com.udp.santiago.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/recetas")
public class RecetaController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getReceta(){
        return "receta";
    }

}
