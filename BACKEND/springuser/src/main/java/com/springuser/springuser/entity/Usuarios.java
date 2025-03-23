package com.springuser.springuser.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Table(name = "usuarios")
@Entity(name = "usuarios")
@Getter
@Setter
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "link_url", nullable = true)
    private String linkUrl;

    @Column(name = "enum_tipo", nullable = false)
    private Integer enumTipo;

}


