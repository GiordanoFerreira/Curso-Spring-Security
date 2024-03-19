package io.github.cursospringexpert.sbootexpsecurity.domain.repository;

import io.github.cursospringexpert.sbootexpsecurity.domain.entity.UsuarioGrupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioGrupoRepository extends JpaRepository<UsuarioGrupo, UUID> {
}
