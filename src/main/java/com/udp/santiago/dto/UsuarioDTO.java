package com.udp.santiago.dto;

import com.udp.santiago.model.Usuario;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UsuarioDTO {
    private String nombre;
    private String usuario;
    private String email;
    private String password;
    private int tipo;

    public Usuario toEntity() {
        Usuario usuario = new Usuario();
        usuario.setNombre(this.nombre);
        usuario.setUsuario(this.usuario);
        usuario.setEmail(this.email);
        usuario.setPassword(this.password);
        usuario.setTipo(this.tipo);
        return usuario;
    }
}
