package br.senac.rn.agenda.model;

// MVC ( Model, View e Controller).
// Modelo: definir como as coisas são, defini os conceitos das coisas, ( aluno, bola, lâmpada e etc...).
// View: São todos aqueles códigos que vai ter interação com o usuário, são as telas. (HTML,CSS e JAVA SCRIPT).
// Controller: é o pacote onde vai ter as regras de negócio, quem determina é o cliente como vai ser.
// Reprository ou DAO: É a base da pesistência de dados, onde o banco de dados vai buscar a informação. CRUD ( Inserir, Buscar, Editar e Excluir).

// DAO ( Data, Access e Object)
// CRUD ( Create(Inserir), Read(Buscar), Update(Editar) e Delete(Excluir)).


public class Contato {

    private Long id;
    private String nome;
    private String fone;

    /*==========================================Construtor======================================================*/
    public Contato() {
    }

    public Contato(Long id, String nome, String fone) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }

    /*=============================================Construtor====================================================*/

    /*============================================get e set=====================================================*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

}
