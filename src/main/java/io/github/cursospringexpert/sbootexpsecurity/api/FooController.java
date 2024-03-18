package io.github.cursospringexpert.sbootexpsecurity.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoute(){
        return ResponseEntity.ok("Rota pública ok!");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoute(Authentication authentication){
        return ResponseEntity.ok("Rota privada ok! Usuário conectado: "
                + authentication.getName()
                + " Autorizações: " +authentication.getAuthorities()
                + " Senhas: " +  authentication.getCredentials()
                + " Detalhes da autenticação: " + authentication.getDetails()
                + " Dados do usuário: " + authentication.getPrincipal());
    }
}
