package com.springuser.springuser.service;

import com.springuser.springuser.mapper.UsuariosMapper;
import com.springuser.springuser.repository.UsuarioRepository;
import com.springuser.springuser.entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import com.springuser.springuser.dto.UsuariosDTO;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuariosServiceImpl(final UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuariosDTO salvar(UsuariosDTO dto) throws Exception{
        Usuarios usuario = new Usuarios();
        try {
            usuario = usuarioRepository.save(UsuariosMapper.toEntity(dto));
            UsuariosDTO newDTO = UsuariosMapper.toDto(usuario);
            return newDTO;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dto;
    }
}
