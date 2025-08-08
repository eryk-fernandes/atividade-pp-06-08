package org.example.state;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.mostrarEstado();
        pedido.mudarEstado();
        pedido.mostrarEstado();
        pedido.mudarEstado();
        pedido.mostrarEstado();
        pedido.cancelar();

        // Cada estado de pedido, após o padrão
        // É responsável por mudar para o próximo estado
        // Cada estado também é responsável pelo ato de cancelar
        // (Apenas Novo e Processando podem cancelar)
        // Dessa maneira, é possível adicionar outros estados sem mudar a estrutura atual
        // Ou com o mínimo de mudança, já que há menos acoplamento
    }
}