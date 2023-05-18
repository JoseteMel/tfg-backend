package com.joselmelendez.tfgbackend.controllers;

import com.joselmelendez.tfgbackend.models.Capitulo;
import com.joselmelendez.tfgbackend.repositories.CapituloRepositorio;
import com.joselmelendez.tfgbackend.services.CapituloServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CapituloControlador {
    @Autowired
    private CapituloRepositorio capituloRepositorio;

    @Autowired
    private CapituloServicio capituloServicio;

    @PostMapping("/capitulo")
    public Capitulo guardarCapitulo(@RequestBody Capitulo capitulo) {
        return capituloRepositorio.save(capitulo);
    }

    @GetMapping("/capitulos")
    public List<Capitulo> getCapitulos() {
        // Busca todos los capítulos en la base de datos
        List<Capitulo> capitulos = capituloRepositorio.findAll();

        // Devuelve la lista de capítulos encontrados
        return capitulos;
    }

    @GetMapping("/capitulo/{id}")
    public Capitulo cargarCapitulo(@PathVariable Long id) {
        return capituloRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Capitulo no encontrado con id " + id));
    }

    @PutMapping("/capitulo/{id}")
    public Capitulo actualizarCapitulo(@PathVariable Long id, @RequestBody Capitulo capituloActualizado) {
        // Busca el capítulo existente por ID en la base de datos
        Capitulo capituloExistente = capituloRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el capítulo con ID " + id));

        // Actualiza el título y el contenido del texto con el nuevo contenido proporcionado
        capituloExistente.setTitulo(capituloActualizado.getTitulo());
        capituloExistente.setTexto(capituloActualizado.getTexto());
        capituloExistente.setFechaModificacion(capituloActualizado.getFechaModificacion());

        // Guarda los cambios en la base de datos
        return capituloRepositorio.save(capituloExistente);
    }

    @DeleteMapping("/capitulo/{id}")
    public void eliminarCapitulo(@PathVariable Long id) {
        // Busca el capítulo existente por ID en la base de datos
        Capitulo capituloExistente = capituloRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el capítulo con ID " + id));

        // Elimina el capítulo de la base de datos
        capituloRepositorio.delete(capituloExistente);
    }
}
