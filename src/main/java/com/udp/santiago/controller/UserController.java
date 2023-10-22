package com.udp.santiago.controller;

import com.udp.santiago.dto.GenericResponse;
import com.udp.santiago.dto.UsuarioDTO;
import com.udp.santiago.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get login user y password
    @RequestMapping( value="/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse login(@RequestBody UsuarioDTO usuarioDTO){
        return userService.login(usuarioDTO);
    }

    @RequestMapping( value="/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse register(
            @RequestBody UsuarioDTO usuarioDTO
            ){
        return  userService.register(usuarioDTO);
    }
}
