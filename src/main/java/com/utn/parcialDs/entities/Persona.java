package com.utn.parcialDs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Persona extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private String dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "autor_persona",
            joinColumns = @JoinColumn (name = "persona_id"),
            inverseJoinColumns = @JoinColumn (name = "libro_id")
    )

    private List<Libro> libros = new ArrayList<Libro>();


}
