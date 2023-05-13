package com.joselmelendez.tfgbackend.models;

import javax.persistence.*;

@Entity
@Table(name="textos")
public class Texto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="titulo", length = 50)
    private String titulo;

    @Column(name="texto", columnDefinition = "TEXT")
    private String texto;

    // Constructor vacío para JPA
    public Texto() {
    }

    // Constructor para crear un nuevo texto
    public Texto(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
