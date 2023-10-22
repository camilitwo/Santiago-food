package com.udp.santiago.service;

import com.udp.santiago.dto.GenericResponse;
import com.udp.santiago.dto.UsuarioDTO;

public interface UserService {
    GenericResponse register(UsuarioDTO usuarioDTO);

    GenericResponse login(UsuarioDTO usuarioDTO);
}
