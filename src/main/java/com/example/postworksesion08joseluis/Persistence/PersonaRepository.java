package com.example.postworksesion08joseluis.Persistence;

import com.example.postworksesion08joseluis.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
