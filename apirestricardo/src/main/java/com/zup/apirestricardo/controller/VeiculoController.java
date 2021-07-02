package com.zup.apirestricardo.controller;

import com.zup.apirestricardo.model.Veiculo;
import com.zup.apirestricardo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;

    @GetMapping("/veiculo")
    public List<Veiculo> listaVeiculo(){
        return veiculoRepository.findAll();
    }

    @GetMapping("/veiculo/{codigo}")
    public Veiculo consultarVeiculo(@PathVariable(value = "codigo") long codigo){
        return veiculoRepository.findById(codigo);
    }

    @PostMapping("/veiculo")
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/veiculo")
    public void deletaVeiculo(@RequestBody Veiculo veiculo){
        veiculoRepository.delete(veiculo);
    }

    @PutMapping("/veiculo")
    public Veiculo atualizaVeiculo(@RequestBody Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
}
