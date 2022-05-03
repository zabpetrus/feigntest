package com.feignapplication.projeto.modulo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cepService", url = "https://api.postmon.com.br/")
public interface CepService {

    @RequestMapping("/v1/cep/{cep}")
    CepResponse getCep(@PathVariable("cep") String cep);
}

//https://api.postmon.com.br/v1/cep/*cep_a_consultar*