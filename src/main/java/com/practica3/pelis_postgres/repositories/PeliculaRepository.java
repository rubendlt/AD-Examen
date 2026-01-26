package com.practica3.pelis_postgres.repositories;

import com.practica3.pelis_postgres.entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    List<Pelicula> findByTiutulo(String titulo);
}
