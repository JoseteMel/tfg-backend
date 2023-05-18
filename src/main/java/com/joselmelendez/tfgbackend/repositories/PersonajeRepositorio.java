package com.joselmelendez.tfgbackend.repositories;

import com.joselmelendez.tfgbackend.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepositorio extends JpaRepository<Personaje, Long> {

    Personaje save(Personaje personaje);
}
