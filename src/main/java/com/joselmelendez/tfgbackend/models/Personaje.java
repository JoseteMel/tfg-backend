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

    @Column(name = "fecha_nacimiento", length = 50)
    private String fechaNacimiento;

    @Column(name = "lugar_nacimiento", length = 50)
    private String lugarNacimiento;

    @Column(name = "altura", length = 10)
    private String altura;

    @Column(name = "complexion", length = 20)
    private String complexion;

    @Column(name = "longitud_pelo", length = 20)
    private String longitudPelo;

    @Column(name = "color_pelo", length = 20)
    private String colorPelo;

    @Column(name = "raza", length = 50)
    private String raza;

    @Column(name = "sexo", length = 50)
    private String sexo;

    @Column(name = "personalidad", length = 100)
    private String personalidad;

    @Column(name = "ocupacion", length = 100)
    private String ocupacion;

    @Column(name = "religion", length = 100)
    private String religion;

    @Column(name = "descripcion", columnDefinition = "VARCHAR")
    private String descripcion;

    @Column(name = "otros", columnDefinition = "VARCHAR")
    private String otros;

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
    public Personaje() {
    }

    // Constructor para crear un nuevo personaje
    public Personaje(String nombre, String apellidos, String fechaNacimiento, String lugarNacimiento,
                     String altura, String complexion, String longitudPelo, String colorPelo, String raza, String sexo,
                     String personalidad, String ocupacion, String religion, String descripcion, String otros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.altura = altura;
        this.complexion = complexion;
        this.longitudPelo = longitudPelo;
        this.colorPelo = colorPelo;
        this.raza = raza;
        this.sexo = sexo;
        this.personalidad = personalidad;
        this.ocupacion = ocupacion;
        this.religion = religion;
        this.descripcion = descripcion;
        this.otros = otros;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
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
