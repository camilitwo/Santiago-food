package com.udp.santiago.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class HealthCheckController {
        @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
        public String healthcheck(){
            return "Prueba algo";
        }
}
