package io.github.cursospringexpert.sbootexpsecurity.domain.repository;

import io.github.cursospringexpert.sbootexpsecurity.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
