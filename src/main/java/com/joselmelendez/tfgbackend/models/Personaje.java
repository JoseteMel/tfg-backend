package com.joselmelendez.tfgbackend.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="personajes")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "lugar_nacimiento", length = 50)
    private String lugarNacimiento;

    @Column(name = "altura", length = 10)
    private Integer altura;

    @Column(name = "complexion", length = 20)
    private String complexion;

    @Column(name = "longitud_pelo")
    private String longitudPelo;

    @Column(name = "color_pelo", length = 100)
    private String colorPelo;

    @Column(name = "raza", length = 50)
    private String raza;

    @Column(name = "descripcion", columnDefinition = "VARCHAR")
    private String descripcion;

    @Column(name = "otros", columnDefinition = "VARCHAR")
    private String otros;

    // Constructor vacío para JPA
    public Personaje() {
    }

    // Constructor para crear un nuevo personaje
    public Personaje(String nombre, String apellidos, Date fechaNacimiento, String lugarNacimiento, Integer altura,
                     String complexion, String longitudPelo, String colorPelo, String raza, String descripcion,
                     String otros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.altura = altura;
        this.complexion = complexion;
        this.longitudPelo = longitudPelo;
        this.colorPelo = colorPelo;
        this.raza = raza;
        this.descripcion = descripcion;
        this.otros = otros;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getLongitudPelo() {
        return longitudPelo;
    }

    public void setLongitudPelo(String longitudPelo) {
        this.longitudPelo = longitudPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
}
