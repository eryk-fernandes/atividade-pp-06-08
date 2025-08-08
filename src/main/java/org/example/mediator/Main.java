package org.example.mediator;

public class Main {
    public static void main(String[] args) {

        Usuario maria = new Usuario("Maria");
        Usuario joao = new Usuario("João");
        Usuario carlos = new Usuario("Carlos");

        RedeSocialMediatorImpl redeSocial = new RedeSocialMediatorImpl();

        redeSocial.adicionarUsuario(maria);
        redeSocial.adicionarUsuario(joao);
        redeSocial.adicionarUsuario(carlos);

        redeSocial.enviaMensagem("Olá, João", maria, joao);
        redeSocial.enviaMensagem("Oi, Carlos!", joao, carlos);
        redeSocial.enviaMensagem("Bom dia, Maria!", carlos, maria);
    }
}