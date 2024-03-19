package io.github.cursospringexpert.sbootexpsecurity.api;

import io.github.cursospringexpert.sbootexpsecurity.domain.dto.CadastroUsuarioDTO;
import io.github.cursospringexpert.sbootexpsecurity.domain.entity.Usuario;
import io.github.cursospringexpert.sbootexpsecurity.domain.repository.UsuarioRepository;
import io.github.cursospringexpert.sbootexpsecurity.domain.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Usuario> salvar(@RequestBody CadastroUsuarioDTO dto){
        Usuario usuarioSalvo = usuarioService.salvar(dto.getUsuario(), dto.getPermissoes());
        return ResponseEntity.ok(usuarioSalvo);
    }
}
