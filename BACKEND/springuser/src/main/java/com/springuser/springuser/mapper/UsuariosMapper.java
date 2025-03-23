package com.springuser.springuser.mapper;

import com.springuser.springuser.dto.UsuariosDTO;
import com.springuser.springuser.entity.Usuarios;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuariosMapper {
    public static UsuariosDTO toDto(Usuarios user) {
        if(user == null) {
            return null;
        }

        UsuariosDTO dto = new UsuariosDTO();
        dto.setId(user.getId());
        dto.setUsuario(user.getUsuario());
        dto.setSenha(user.getSenha());
        dto.setEmail(user.getEmail());
        dto.setLinkUrl(user.getLinkUrl());
        dto.setEnumTipo(user.getEnumTipo());

        return dto;
    }

    public static Usuarios toEntity(UsuariosDTO dto) {
        if(dto == null) {
            return null;
        }

        Usuarios entity = new Usuarios();
        entity.setId(dto.getId());
        entity.setUsuario(dto.getUsuario());
        entity.setSenha(dto.getSenha());
        entity.setEmail(dto.getEmail());
        entity.setLinkUrl(dto.getLinkUrl());
        entity.setEnumTipo(dto.getEnumTipo());

        return entity;
    }
}
