package org.example.chain;

public class AprovacaoAutorizacao extends Validador{
    @Override
    public void processa(Usuario usuario) {
        if(!usuario.isAutorizado()) {
            System.out.println("Usuário não autorizado.");
        } else if (getProximoValidador() != null) {
            System.out.println("Usuário autorizado.");
            getProximoValidador().processa(usuario);
        }
    }
}
