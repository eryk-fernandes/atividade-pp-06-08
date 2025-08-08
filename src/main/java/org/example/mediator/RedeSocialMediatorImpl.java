package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class RedeSocialMediatorImpl implements RedeSocialMediator {

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviaMensagem(String mensagem, Usuario remetente, Usuario destinatario) {
        if (usuarios.contains(remetente)) {
            if (usuarios.contains(destinatario)) {
                receberMensagem(mensagem, remetente, destinatario);
            }
            else {
                System.out.println("Usuário destinatário " + destinatario.getNome() + " não está na sua lista de contatos.");
            }
        }
        else {
            System.out.println("Usuário remetente " + remetente.getNome() + " não é um usuário.");
        }
    }

    @Override
    public void receberMensagem(String mensagem, Usuario remetente, Usuario destinatario) {
        System.out.println(destinatario.getNome() + " recebeu de " + remetente.getNome() + ": " + mensagem);
    }
}
