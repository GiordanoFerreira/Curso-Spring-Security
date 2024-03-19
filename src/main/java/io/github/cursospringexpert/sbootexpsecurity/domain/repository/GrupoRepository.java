package io.github.cursospringexpert.sbootexpsecurity.domain.repository;

import io.github.cursospringexpert.sbootexpsecurity.domain.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
    Optional<Grupo> findByNome(String nome);
}
