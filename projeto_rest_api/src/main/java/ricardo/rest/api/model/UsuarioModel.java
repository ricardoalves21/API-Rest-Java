package ricardo.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "usuario") // Anotação para tornar esta classe uma entidade (tabela) do banco de dados
public class UsuarioModel { // Esta classe é a representação do usuário no banco de dados

// CRIAR OS ATRIBUTOS

    @Id // anotação para tornar este atributo um campo do tipo 'id' no banco de dados
    public Integer codigo;

    @Column(nullable = false, length = 50) // anotação para tornar este atributo um campo que aceitará null e possui o tamanho 50
    public String nome;

    @Column(nullable = false, length = 50) // anotação para tornar este atributo um campo que aceitará null e possui o tamanho 50
    public String login;

    @Column(nullable = false, length = 50) // anotação para tornar este atributo um campo que aceitará null e possui o tamanho 50
    public String senha;


// CRIAR GETTERS E SETTERS

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}