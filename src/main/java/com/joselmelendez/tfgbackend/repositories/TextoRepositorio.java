package com.joselmelendez.tfgbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joselmelendez.tfgbackend.models.Texto;

public interface TextoRepositorio extends JpaRepository<Texto, Long> {

    Texto save(Texto texto);
}
