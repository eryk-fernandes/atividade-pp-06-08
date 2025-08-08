package org.example.chain;

public class AprovacaoDadosValidos extends Validador{
    @Override
    public void processa(Usuario usuario) {
        if(!usuario.isDadosvalidos()) {
            System.out.println("Usuário sem dados válidos.");
        } else {
            System.out.println("Usuário com dados válidos. Bem-vindo!");
        }
    }
}
