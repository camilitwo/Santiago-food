package com.udp.santiago.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class PlanificacionController {

    @RequestMapping(value = "/planificacion-usuario/{user}", method = RequestMethod.GET)
    public String getPlanificacionUsuario(@PathVariable String user){
        return "planificacion-usuario, user: " + user;
    }
}
