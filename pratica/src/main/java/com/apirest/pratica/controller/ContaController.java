package com.apirest.pratica.controller;

import com.apirest.pratica.dto.ContaInputDTO;
import com.apirest.pratica.dto.ContaOutputDTO;
import com.apirest.pratica.models.Conta;
import com.apirest.pratica.service.ContaService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/contas")
public class ContaController {

    private final ContaService contaService;
    private final ModelMapper mapper;

    @GetMapping
    public List<ContaOutputDTO> listarContas() {
        var conta = this.contaService.listarContas();

        return conta.stream()
                .map(c -> this.mapper.map(c, ContaOutputDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ContaOutputDTO listarContaPeloId(@PathVariable(value = "id") long id) {
        var conta = this.contaService.listarContaPeloId(id);

        return this.mapper.map(conta, ContaOutputDTO.class);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContaOutputDTO salvaConta(@Valid @RequestBody ContaInputDTO input) {
        var conta = this.mapper.map(input, Conta.class);

        conta = this.contaService.salvaConta(conta);

        return this.mapper.map(conta, ContaOutputDTO.class);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletaConta(@PathVariable(value = "id") long id) {
        this.contaService.deletaConta(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ContaOutputDTO atualizaConta(@Valid @RequestBody ContaInputDTO input) {
        var conta = this.mapper.map(input, Conta.class);

        conta = this.contaService.atualizaConta(conta);

        return this.mapper.map(conta, ContaOutputDTO.class);
    }
}