package com.joselmelendez.tfgbackend.controllers;

import com.joselmelendez.tfgbackend.models.Texto;
import com.joselmelendez.tfgbackend.repositories.TextoRepositorio;
import com.joselmelendez.tfgbackend.services.TextoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TextoControlador {
    @Autowired
    private TextoRepositorio textoRepositorio;

    @Autowired
    private TextoServicio TextoServicio;

    @PostMapping("/text")
    public Texto guardarTexto(@RequestBody Texto texto) {
        return textoRepositorio.save(texto);
    }

    @GetMapping("/text")
    public List<Texto> getTextos() {
        // Busca todos los textos en la base de datos
        List<Texto> textos = textoRepositorio.findAll();

        // Devuelve la lista de textos encontrados
        return textos;
    }

    @GetMapping("/text/{id}")
    public Texto cargarTexto(@PathVariable Long id) {
        return textoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Texto no encontrado con id " + id));
    }

    @PutMapping("/text/{id}")
    public Texto actualizarTexto(@PathVariable Long id, @RequestBody Texto textoActualizado) {
        // Busca el texto existente por ID en la base de datos
        Texto textoExistente = textoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el texto con ID " + id));

        // Actualiza el contenido del texto con el nuevo contenido proporcionado
        textoExistente.setTexto(textoActualizado.getTexto());

        // Guarda los cambios en la base de datos
        return textoRepositorio.save(textoExistente);
    }


}