package com.practica3.pelis_postgres.service;

import com.practica3.pelis_postgres.model.Actor;
import com.practica3.pelis_postgres.repositories.ActorRepository;

import java.util.List;
import java.util.Optional;

public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    public Optional<Actor> findById(Long id) {
        return actorRepository.findById(id);
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    public boolean existsById(Long id) {
        return actorRepository.existsById(id);
    }

    public void deleteById(Long id) {
        actorRepository.deleteById(id);
    }
}
