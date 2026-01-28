package com.practica3.pelis_postgres.controller;

import com.practica3.pelis_postgres.entities.Actor;
import com.practica3.pelis_postgres.repositories.ActorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actores")
public class RestActores {
    private final ActorRepository actorRepository;

    public RestActores(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping
    public List<Actor> getActores() {
        return actorRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarActor(@PathVariable Long id) {
        if (actorRepository.existsById(id)) {
            actorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
