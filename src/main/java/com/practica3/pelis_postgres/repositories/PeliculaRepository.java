package com.practica3.pelis_postgres.repositories;

import com.practica3.pelis_postgres.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    List<Pelicula> findByTiutulo(String titulo);
}
