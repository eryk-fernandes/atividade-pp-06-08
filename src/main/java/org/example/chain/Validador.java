package org.example.chain;



public class Validador {

    public void processa(String usuario, boolean autenticado, boolean autorizado, boolean dadosValidos) {

        if (!autenticado) {
            System.out.println("Usuário não autenticado.");
            return;
        }

        if (!autorizado) {
            System.out.println("Usuário sem permissão.");
            return;
        }

        if (!dadosValidos) {
            System.out.println("Dados inválidos.");
            return;
        }

        System.out.println("Requisição processada com sucesso!");
    }

}
