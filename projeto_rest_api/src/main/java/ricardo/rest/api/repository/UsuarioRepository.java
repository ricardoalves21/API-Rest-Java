package ricardo.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import ricardo.rest.api.model.UsuarioModel;


public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> { // Esta Classe possui métodos pré-programados com as principais funcionalidades

    /* A interface CrudRepository fornece métodos para operações CRUD, permitindo criar, ler, atualizar e excluir registros sem precisar definir seus próprios métodos. */

    /* Aqui estamos extendendo a classe à classe 'CrudRepository' e identificando a classe que possui o
    modelo de dados (UsuarioModel) e também o tipo (Integer) do 'id' dessa classe */

}
