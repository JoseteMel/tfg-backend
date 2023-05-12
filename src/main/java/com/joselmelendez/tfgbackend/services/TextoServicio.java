package com.joselmelendez.tfgbackend.services;

import com.joselmelendez.tfgbackend.models.Texto;
import com.joselmelendez.tfgbackend.repositories.TextoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextoServicio {

    @Autowired
    private TextoRepositorio textoRepositorio;

    public String getTexto() {
        List<Texto> textos = textoRepositorio.findAll();
        if (!textos.isEmpty()) {
            Texto texto = textos.get(0);
            return texto.getTexto();
        }
        return "";
    }

    public void guardarTexto(String contenido) {
        Texto texto = new Texto(contenido);
        textoRepositorio.save(texto);
    }
}
