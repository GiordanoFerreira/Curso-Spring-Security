package io.github.cursospringexpert.sbootexpsecurity.domain.dto;

import io.github.cursospringexpert.sbootexpsecurity.domain.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class CadastroUsuarioDTO {
    private Usuario usuario;
    private List<String> permissoes;
}
