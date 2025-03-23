package com.springuser.springuser.controller;

import com.springuser.springuser.dto.UsuariosDTO;
import com.springuser.springuser.entity.Usuarios;
import com.springuser.springuser.service.UsuariosService;
import com.springuser.springuser.service.UsuariosServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuariosService usuariosService;

    @PostMapping(value = "register")
    public ResponseEntity<UsuariosDTO> salvar(@RequestBody UsuariosDTO usuario) throws Exception {
        final UsuariosDTO salvo = usuariosService.salvar(usuario);
        return ResponseEntity.ok(salvo);
    }
}
