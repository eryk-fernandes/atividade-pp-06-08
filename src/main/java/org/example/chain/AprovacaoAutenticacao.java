package org.example.chain;

public class AprovacaoAutenticacao extends Validador{
    @Override
    public void processa(Usuario usuario) {
        if(!usuario.isAutenticado()) {
            System.out.println("Usuário não autenticado.");
        } else if (getProximoValidador() != null) {
            System.out.println("Usuário autenticado.");
            getProximoValidador().processa(usuario);
        }
    }
}
