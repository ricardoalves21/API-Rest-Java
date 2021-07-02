package com.zup.apirestricardo.repository;

import com.zup.apirestricardo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

    Usuario findById(long codigo);

}
