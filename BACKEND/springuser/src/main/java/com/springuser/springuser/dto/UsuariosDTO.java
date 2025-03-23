package com.springuser.springuser.dto;

import com.springuser.springuser.infra.dto.BaseDto;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO extends BaseDto {
    private Long id;
    private String usuario;
    private String senha;
    private String email;
    private String linkUrl;
    private Integer enumTipo;
}
