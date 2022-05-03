package com.feignapplication.projeto.modulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

    @Autowired
    private final UsuarioClient usuarioClient;

    public Initializer(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    @Override
    public void run(String... args) {

        try{
            Usuario usuario = this.usuarioClient.buscaPeloEmail("felix_gilioli@hotmail.com");
            System.out.println(usuario);
        }catch (Exception e){
            System.err.println("Nao consegui processar a requisicao!");
        }

    }
}