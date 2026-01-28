package com.practica3.pelis_postgres.repositories;

import com.practica3.pelis_postgres.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActorRepository extends JpaRepository<Actor, Long> {
}
