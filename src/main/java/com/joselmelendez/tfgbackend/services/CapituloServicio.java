package com.joselmelendez.tfgbackend.services;

import com.joselmelendez.tfgbackend.models.Capitulo;
import com.joselmelendez.tfgbackend.repositories.CapituloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapituloServicio {

    @Autowired
    private CapituloRepositorio capituloRepositorio;

    public String getTexto() {
        List<Capitulo> capitulos = capituloRepositorio.findAll();
        if (!capitulos.isEmpty()) {
            Capitulo capitulo = capitulos.get(0);
            return capitulo.getTexto();
        }
        return "";
    }

    public void guardarCapitulo(String titulo, String contenido) {
        Capitulo capitulo = new Capitulo(titulo, contenido);
        capituloRepositorio.save(capitulo);
    }
}
