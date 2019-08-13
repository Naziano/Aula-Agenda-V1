package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

import java.security.cert.CRLException;
import java.util.List;

public class TestaPrograma {

    public static void main(String[] args) {

        ContatoRepository bancoDeDados = new ContatoRepository();

        Contato jota = new Contato(1L, "Jota Lopes", "9999-8888");

        bancoDeDados.salva(jota);

        Contato felipe = new Contato(2L, "Felipe Pontes", "9985-5587");

        Contato michele = new Contato(3L, "Michele Silva", "9655-8855");

        bancoDeDados.salva(michele);

        bancoDeDados.salva(felipe);

        List<Contato> contatos = bancoDeDados.buscaTodos();

        for (Contato contato : contatos) {
            System.out.println(contato.getNome());
        }

    }

}
