package com.practica3.pelis_postgres.controller;

import com.practica3.pelis_postgres.entities.Pelicula;
import com.practica3.pelis_postgres.repositories.PeliculaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class RestPeliculas {
    private final PeliculaRepository peliculaRepository;

    public RestPeliculas(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @GetMapping
    public List<Pelicula> getPeliculas() {
       return peliculaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> getPeliculaById(@PathVariable Long id) {
        return peliculaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pelicula> gardarPelicula(@RequestBody Pelicula pelicula) {
        if (pelicula.getActores() != null) {
            pelicula.getActores().forEach(actor -> actor.setPelicula(pelicula));
        }
        Pelicula gardada = peliculaRepository.save(pelicula);
        return ResponseEntity.ok(gardada);
    }
}
