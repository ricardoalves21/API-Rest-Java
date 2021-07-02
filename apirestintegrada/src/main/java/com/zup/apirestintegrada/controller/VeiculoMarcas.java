package com.zup.apirestintegrada.controller;

import com.zup.apirestintegrada.DTO.FipeServiceMarca;
import com.zup.apirestintegrada.client.FipeMarcas;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("marcas")
public class VeiculoMarcas {

    private FipeMarcas fipeMarcas;

    @GetMapping
    public List<FipeServiceMarca> getAllFipe() {
        return fipeMarcas.getAllFipe();
    }
}
