package com.apirest.pratica.resources;

import com.apirest.pratica.models.Conta;
import com.apirest.pratica.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class ContaResource {

    @Autowired
    ContaRepository contaRepository;

    @GetMapping("/contas")
    public List<Conta> listarContas() {
        return contaRepository.findAll();
    }

    @GetMapping("/conta/{id}")
    public Conta listarContaUnica(@PathVariable(value = "id") long id) {
        return contaRepository.findById(id);
    }

    @PostMapping("conta")
    public Conta salvaConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }

    @DeleteMapping("/conta")
    public void deletaConta(@RequestBody Conta conta) {
        contaRepository.delete(conta);
    }

    @PutMapping("/conta")
    public Conta atualizaConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }
}
