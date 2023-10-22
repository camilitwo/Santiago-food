package com.udp.santiago.repository;

import com.udp.santiago.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuarioAndPassword(String usuario, String password);

    Optional<Object> findByUsuario(String usuario);
}
