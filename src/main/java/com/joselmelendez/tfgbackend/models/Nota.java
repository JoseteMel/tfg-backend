package com.joselmelendez.tfgbackend.models;

import javax.persistence.*;

@Entity
@Table(name="notas")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "texto", columnDefinition = "TEXT")
    private String texto;

    // Constructor vacío para JPA
    public  Nota() {
    }

    // Constructor para crear una nueva nota
    public Nota(String texto) {
        this.texto = texto;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

