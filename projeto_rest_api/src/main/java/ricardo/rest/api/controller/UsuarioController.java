package ricardo.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardo.rest.api.model.UsuarioModel;
import ricardo.rest.api.repository.UsuarioRepository;


// CLASSE CONTROLLER

@RestController // A anotação @RestController permite definir um controller para a aplicação com características REST
public class UsuarioController {  // Classe responsável por fazer as consultas e salvar dados no Banco de Dados

    @Autowired // A anotação @Autowired delega ao Spring Boot a inicialização do objeto e cria o repositorio
    private UsuarioRepository repository; // nome do repositório



// MÉTODO GET (read)

    @GetMapping (path = "/api/usuario/{codigo}") // A anotação @GetMapping serve para consultas no banco de dados
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) { /* o método 'consultar' irá receber um parâmetro
        (variável) que será o código, mas também precisamos atrelar este parâmetro ao campo informado no @GetMapping {codigo} */

        return repository.findById(codigo) // cria uma consulta ao banco de dados buscando pelo método findById no campo 'código'
                .map(record -> ResponseEntity.ok().body(record)) // usar o método 'map' para retornar a consulta no corpo da requisição com o registro encontrado
                .orElse(ResponseEntity.notFound().build()); // do contrário apresentar notFound fazendo o build

    }



// MÉTODO POST (update)

    @PostMapping (path = "/api/usuario/salvar") // A anotação @PostMapping serve para salvar dados no banco de dados
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) { // criando o método salvar dizendo que no corpo da requisição será apresentado o registro do usuário

        return repository.save(usuario); // retornar com os dados do usuário que foi salvo no repositório

    }
}
