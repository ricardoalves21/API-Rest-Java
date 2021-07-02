package com.zup.apirestintegrada.controller;

import com.zup.apirestintegrada.DTO.FipeServiceModelo;
import com.zup.apirestintegrada.client.FipeModelos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("modelos")
public class VeiculoModelos {

    private final FipeModelos fipeModelos;

    @GetMapping("/marcas/{modelo}/modelos")
    public ResponseEntity<FipeServiceModelo> consultaModelo(@PathVariable("modelo") int modelo) {
        FipeServiceModelo fipeServiceModelo = fipeModelos.consultaModelo(modelo);
        return ResponseEntity.ok(fipeServiceModelo);
    }
}
