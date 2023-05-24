package com.joselmelendez.tfgbackend.services;

import com.joselmelendez.tfgbackend.models.Nota;
import com.joselmelendez.tfgbackend.repositories.NotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServicio {

    @Autowired
    private NotaRepositorio notaRepositorio;

    public String getTexto() {
        List<Nota> notas = notaRepositorio.findAll();
        if (!notas.isEmpty()) {
            Nota nota = notas.get(0);
            return nota.getTexto();
        }
        return "";
    }

    public void guardarCapitulo(String texto) {
        Nota nota = new Nota(texto);
        notaRepositorio.save(nota);
    }
}
