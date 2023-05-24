package com.joselmelendez.tfgbackend.controllers;

import com.joselmelendez.tfgbackend.models.Nota;
import com.joselmelendez.tfgbackend.repositories.NotaRepositorio;
import com.joselmelendez.tfgbackend.services.NotaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class NotaControlador {
    @Autowired
    private NotaRepositorio notaRepositorio;

    @Autowired
    private NotaServicio capituloServicio;

    @PostMapping("/nota")
    public Nota guardarNota(@RequestBody Nota nota) {
        return notaRepositorio.save(nota);
    }

    @GetMapping("/nota/{id}")
    public Nota cargarNota(@PathVariable Long id) {
        return notaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota no encontrada con id " + id));
    }

    @PutMapping("/nota/{id}")
    public Nota actualizarNota(@PathVariable Long id, @RequestBody Nota notaActualizada) {
        // Busca la nota existente por ID en la base de datos
        Nota notaExistente = notaRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró la nota con ID " + id));

        // Actualiza el contenido del texto con el nuevo contenido proporcionado
        notaExistente.setTexto(notaActualizada.getTexto());

        // Guarda los cambios en la base de datos
        return notaRepositorio.save(notaExistente);
    }
}
