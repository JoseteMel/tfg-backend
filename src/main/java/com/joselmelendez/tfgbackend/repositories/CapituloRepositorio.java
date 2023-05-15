package com.joselmelendez.tfgbackend.repositories;

import com.joselmelendez.tfgbackend.models.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapituloRepositorio extends JpaRepository<Capitulo, Long> {

    Capitulo save(Capitulo capitulo);
}
