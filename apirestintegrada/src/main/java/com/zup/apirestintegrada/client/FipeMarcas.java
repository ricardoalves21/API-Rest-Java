package com.zup.apirestintegrada.client;

import com.zup.apirestintegrada.DTO.FipeServiceMarca;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "fipe", url = "https://parallelum.com.br/fipe/api/v1/carros")
public interface FipeMarcas {

    @GetMapping(value = "/marcas")
    List<FipeServiceMarca> getAllFipe();
}


