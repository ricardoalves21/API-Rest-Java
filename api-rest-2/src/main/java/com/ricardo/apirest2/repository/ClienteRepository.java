package com.ricardo.apirest2.repository;

import com.ricardo.apirest2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    /* Com esta anotação @Repository estamos dizendo para o Spring que esta classe é um repositório, ou seja, que ela é
    responsável por interagir com o banco de dados. */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    /* Esta classe é uma interface que herda os métodos da classe JpaRepository fazendo conexão com a classe Cliente
    (tabela do BD) através da propriedade id que possui o tipo Long. */
}