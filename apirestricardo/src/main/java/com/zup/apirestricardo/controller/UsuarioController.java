package com.zup.apirestricardo.controller;

import com.zup.apirestricardo.model.Usuario;
import com.zup.apirestricardo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public List<Usuario> listaUsuarios(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{codigo}")
    public Usuario consultarUsuario(@PathVariable(value = "codigo") long codigo){
        return usuarioRepository.findById(codigo);
    }

    @PostMapping("/usuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/usuario")
    public void deletaUsuario(@RequestBody Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    @PutMapping("/usuario")
    public Usuario atualizaUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
