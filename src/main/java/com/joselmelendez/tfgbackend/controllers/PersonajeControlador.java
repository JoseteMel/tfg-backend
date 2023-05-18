package com.joselmelendez.tfgbackend.controllers;

import com.joselmelendez.tfgbackend.models.Personaje;
import com.joselmelendez.tfgbackend.repositories.PersonajeRepositorio;
import com.joselmelendez.tfgbackend.services.PersonajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PersonajeControlador {
    @Autowired
    private PersonajeRepositorio personajeRepositorio;

    @Autowired
    private PersonajeServicio personajeServicio;

    @PostMapping("/personaje")
    public Personaje guardarPersonaje(@RequestBody Personaje personaje) {
        return personajeRepositorio.save(personaje);
    }

    @GetMapping("/personajes")
    public List<Personaje> getPersonajes() {
        // Busca todos los personajes en la base de datos
        List<Personaje> personajes = personajeRepositorio.findAll();

        // Devuelve la lista de personajes encontrados
        return personajes;
    }

    @GetMapping("/personaje/{id}")
    public Personaje cargarPersonaje(@PathVariable Long id) {
        return personajeRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado con id " + id));
    }

    @PutMapping("/personaje/{id}")
    public Personaje actualizarPersonaje(@PathVariable Long id, @RequestBody Personaje personajeActualizado) {
        // Busca el personaje existente por ID en la base de datos
        Personaje personajeExistente = personajeRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el personaje con ID " + id));

        // Actualiza los datos del personaje
        personajeExistente.setNombre(personajeActualizado.getNombre());
        personajeExistente.setApellidos(personajeActualizado.getApellidos());
        personajeExistente.setFechaNacimiento(personajeActualizado.getFechaNacimiento());
        personajeExistente.setLugarNacimiento(personajeActualizado.getLugarNacimiento());
        personajeExistente.setAltura(personajeActualizado.getAltura());
        personajeExistente.setComplexion(personajeActualizado.getComplexion());
        personajeExistente.setLongitudPelo(personajeActualizado.getLongitudPelo());
        personajeExistente.setColorPelo(personajeActualizado.getColorPelo());
        personajeExistente.setRaza(personajeActualizado.getRaza());
        personajeExistente.setSexo(personajeActualizado.getSexo());
        personajeExistente.setPersonalidad(personajeActualizado.getPersonalidad());
        personajeExistente.setOcupacion(personajeActualizado.getOcupacion());
        personajeExistente.setReligion(personajeActualizado.getReligion());
        personajeExistente.setDescripcion(personajeActualizado.getDescripcion());
        personajeExistente.setOtros(personajeActualizado.getOtros());
        personajeExistente.setFechaModificacion(personajeExistente.getFechaModificacion());

        // Guarda los cambios en la base de datos
        return personajeRepositorio.save(personajeExistente);
    }

    @DeleteMapping("/personaje/{id}")
    public void eliminarPersonaje(@PathVariable Long id) {
        // Busca el personaje existente por ID en la base de datos
        Personaje personajeExistente = personajeRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el personaje con ID " + id));

        // Elimina el personaje de la base de datos
        personajeRepositorio.delete(personajeExistente);
    }
}
