package com.utn.parcialDs.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base {
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}