package com.zup.apirestintegrada.client;

import com.zup.apirestintegrada.DTO.FipeServiceModelo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fipemodelos", url = "https://parallelum.com.br/fipe/api/v1/carros")
public interface FipeModelos {

    @GetMapping("/marcas/{modelo}/modelos")
    FipeServiceModelo consultaModelo(@PathVariable("modelo") int modelo);
}
