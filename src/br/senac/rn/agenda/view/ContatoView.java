package br.senac.rn.agenda.view;

import br.senac.rn.agenda.model.Contato;

import java.util.Scanner;

public class ContatoView {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Long escolha = 1L;

        do {
            ContatoView.getMenu();
            escolha = entrada.nextLong();
        } while (escolha != 0);

    }

    private static void getMenu() {
        String menu = "";
        menu += "==============================\n";
        menu += "1 - Cadastrar Contato         \n";
        menu += "2 - Listar Todos os Contatos  \n";
        menu += "3 - Buscar Contato            \n";
        menu += "==============================\n";
        menu += "Opção: ";
        System.out.print(menu);
    }
}
