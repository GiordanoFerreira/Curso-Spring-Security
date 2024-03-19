package io.github.cursospringexpert.sbootexpsecurity.api;

import io.github.cursospringexpert.sbootexpsecurity.domain.entity.Grupo;
import io.github.cursospringexpert.sbootexpsecurity.domain.repository.GrupoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
@RequiredArgsConstructor
public class GrupoController {

    private final GrupoRepository grupoRepository;

    @PostMapping
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Grupo> salvar(@RequestBody Grupo grupo){
        grupoRepository.save(grupo);
        return ResponseEntity.ok(grupo);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Grupo>> listar(){
        return ResponseEntity.ok(grupoRepository.findAll());
    }
}
