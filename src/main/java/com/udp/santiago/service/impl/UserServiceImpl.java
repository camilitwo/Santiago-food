package com.udp.santiago.service.impl;

import com.udp.santiago.dto.GenericResponse;
import com.udp.santiago.dto.UsuarioDTO;
import com.udp.santiago.exception.ProblemCustomException;
import com.udp.santiago.model.Usuario;
import com.udp.santiago.repository.UsuarioRepository;
import com.udp.santiago.service.UserService;
import com.udp.santiago.util.ConstantsUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsuarioRepository usuarioRepository;
    @Override
    public GenericResponse register(UsuarioDTO usuarioDTO) {
        usuarioRepository.findByUsuario(usuarioDTO.getUsuario()).ifPresent(u -> {
            throw new ProblemCustomException(ConstantsUtils.USER_EXIST_CODE, "El usuario ya existe", HttpStatus.BAD_REQUEST);
        });

        Usuario user = usuarioRepository.save(usuarioDTO.toEntity());
        return new GenericResponse("Usuario registrado correctamente", user, Boolean.TRUE);
    }

    @Override
    public GenericResponse login(UsuarioDTO usuarioDTO) {
        Usuario user = usuarioRepository.findByUsuarioAndPassword(usuarioDTO.getUsuario(), usuarioDTO.getPassword());
        if(user != null){
            return new GenericResponse("Usuario logeado correctamente", user, Boolean.TRUE);
        }else{
            return new GenericResponse("Usuario o contraseña incorrectos", null, Boolean.FALSE);
        }
    }
}
