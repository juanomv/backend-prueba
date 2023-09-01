package com.prueba_juan.model;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "UserName",length = 50 , columnDefinition = "CHAR" ,unique = true)
    private String userName;
    @Column(name = "Password",length = 50, columnDefinition = "CHAR" )
    private String password;
    @Column(name = "Mail",length = 120, columnDefinition = "CHAR",unique = true)
    private String mail;
    @Column(name = "SessionActive",length = 1, columnDefinition = "CHAR")
    private String sessionActive;
    @Column(name = "Persona_idPersona2")
    private Integer persona_idPersona2;
    @Column(name = "Status",length = 1, columnDefinition = "CHAR")
    private Integer status;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "rol_usuarios",
            joinColumns = @JoinColumn(name = "usuarios_idUsuaios"),
            inverseJoinColumns = @JoinColumn(name = "Rol_idRol"))
    private Set<Rol> roles;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Persona_idPersona2")
    private List<Persona> personas;
}
