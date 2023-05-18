package com.joselmelendez.tfgbackend.services;

import com.joselmelendez.tfgbackend.models.Personaje;
import com.joselmelendez.tfgbackend.repositories.PersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServicio {

    @Autowired
    private PersonajeRepositorio personajeRepositorio;

    public String getNombre() {
        List<Personaje> personajes = personajeRepositorio.findAll();
        if (!personajes.isEmpty()) {
            Personaje personaje = personajes.get(0);
            return personaje.getNombre();
        }
        return "";
    }

    public void guardarPersonaje(String nombre, String apellidos, String fechaNacimiento, String lugarNacimiento,
                                 String altura, String complexion, String longitudPelo, String colorPelo, String raza, String sexo,
                                 String personalidad, String ocupacion, String religion, String descripcion, String otros) {
        Personaje personaje = new Personaje(nombre, apellidos, fechaNacimiento, lugarNacimiento, altura, complexion,
                longitudPelo, colorPelo, raza, sexo, personalidad, ocupacion, religion, descripcion, otros);
        personajeRepositorio.save(personaje);
    }
}
