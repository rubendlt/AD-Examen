package com.practica3.pelis_postgres.service;
import com.practica3.pelis_postgres.model.Pelicula;
import com.practica3.pelis_postgres.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    private final PeliculaRepository peliculaRepository;

    @Autowired
    public PeliculaService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public List<Pelicula> findAll() {
        return peliculaRepository.findAll();
    }

    public Optional<Pelicula> findById(Long id) {
        return peliculaRepository.findById(id);
    }

    public Pelicula save(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public boolean existsById(Long id) {
        return peliculaRepository.existsById(id);
    }

    public void deleteById(Long id) {
        peliculaRepository.deleteById(id);
    }
}

