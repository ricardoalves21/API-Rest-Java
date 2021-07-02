package com.ricardo.apirest2.controller;

import com.ricardo.apirest2.model.Cliente;
import com.ricardo.apirest2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
    /* Estamos anotando que esta classe será um controlador rest onde serão desenvolvidos endpoints rest, ou seja, que
    receberá as requisições e respostas. */

@RequestMapping("/clientes")
    // Esta anotação irá mapear os endpoints que receberão as requisições no caminho especificado '/clientes'.

public class ClienteController {
    // Classe que possui os métodos de requisição e resposta.

    @Autowired
    // Instanciará um objeto de cliente da classe ClienteRepository que extend da classe JpaRepository.
    private ClienteRepository clienteRepository;

    @GetMapping
    // Usamos o verbo @GetMapping para apontar o método get para o método listar().
    public List<Cliente> listar() {  // Método que listará os clientes.
        return clienteRepository.findAll(); // Retornar a busca com todos os dados listados.
    }

    @PostMapping
    // Usamos o verbo @PostMapping para inserir dados em nosso banco de dados.
    @ResponseStatus(HttpStatus.CREATED)
    // Esta anotação @ResponseStatus diz para ao invés de retornar a resposta padrão, que seja retornado a resposta do CREATED (201)
    public Cliente adicionar(@RequestBody Cliente cliente){
        // O @RequestBody faz com que o corpo da requisição seja convertido pra objeto Java do tipo Cliente.
        return clienteRepository.save(cliente);  // Retornar com o cliente salvo no banco.
    }

}