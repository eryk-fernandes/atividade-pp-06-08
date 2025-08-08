package org.example.mediator;

public interface RedeSocialMediator {

    void adicionarUsuario(Usuario usuario);

    void enviaMensagem(String mensagem, Usuario remetente, Usuario destinatario);

    void receberMensagem(String mensagem, Usuario remetente, Usuario destinatario);
}
