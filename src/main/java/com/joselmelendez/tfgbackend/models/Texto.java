package com.joselmelendez.tfgbackend.models;

import javax.persistence.*;
import java.util.Date;

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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_modificacion")
    private Date fechaModificacion;

    // Actualiza la fecha de última modificación antes de guardar
    @PrePersist
    protected void onCreate() {
        fechaCreacion = new Date();
        fechaModificacion = new Date();
    }

    // Constructor vacío para JPA
    public Texto() {
    }

    // Constructor para crear un nuevo texto
    public Texto(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.fechaCreacion = new Date();
        this.fechaModificacion = new Date();
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
