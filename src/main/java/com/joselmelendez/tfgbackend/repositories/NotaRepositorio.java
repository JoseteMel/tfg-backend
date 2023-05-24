package com.joselmelendez.tfgbackend.repositories;

import com.joselmelendez.tfgbackend.models.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepositorio extends JpaRepository<Nota, Long> {

    Nota save(Nota nota);
}
