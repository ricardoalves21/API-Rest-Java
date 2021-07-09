package com.ricardo.socialbank.service;

import com.ricardo.socialbank.models.Conta;
import com.ricardo.socialbank.repository.ContaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Rest Conta Banco")
@CrossOrigin(origins = "*")
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    @GetMapping("/conta")
    @ApiOperation(value = "Retorna uma lista de contas")
    public List<Conta> listaContas() {
        return contaRepository.findAll();
    }

    @GetMapping("/conta/{id}")
    @ApiOperation(value = "Retorna uma conta única")
    public Optional<Conta> listaContaUnica(@PathVariable(value = "id") Long id) {
        return contaRepository.findById(id);
    }

    @PostMapping("/conta")
    @ApiOperation(value = "Este método salva uma conta")
    public Conta salvaConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }

    @DeleteMapping("/conta")
    @ApiOperation(value = "Este método deleta uma conta")
    public void deletaConta(@RequestBody Conta conta) {
        contaRepository.delete(conta);
    }

    @PutMapping("/conta")
    @ApiOperation(value = "Este método atualiza um produto")
    public Conta atualizaConta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }
}
