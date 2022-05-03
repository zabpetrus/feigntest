package com.feignapplication.projeto.modulo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8085/usuario/", name = "usuario")
public interface UsuarioClient {

    @GetMapping("email/{email}")
    Usuario buscaPeloEmail(@PathVariable("email") String email);


    @GetMapping("/email")
    List<String> listadeEmails();


    @GetMapping("/usuario")
    List<Usuario> listadeUsuarios();


    @GetMapping("/usuario/{id}")
    Usuario buscaPorUsuario(@PathVariable("id") String id);


}