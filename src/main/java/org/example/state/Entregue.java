package org.example.state;

public class Entregue implements PedidoEstado {
    @Override
    public PedidoEstado mudarEstado(PedidoEstado pedidoEstado) {
        System.out.println("Pedido já foi entregue");
        return new Entregue();
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Entregue");
    }

    @Override
    public PedidoEstado cancelar(PedidoEstado pedidoEstado) {
        System.out.println("O pedido não pode ser cancelado.");
        return new Entregue();
    }

}
