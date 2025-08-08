package org.example.state;

public class Enviado implements PedidoEstado {

    @Override
    public PedidoEstado mudarEstado(PedidoEstado pedidoEstado) {
        return new Entregue();
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Enviado");
    }

    @Override
    public PedidoEstado cancelar(PedidoEstado pedidoEstado) {
        System.out.println("O pedido não pode ser cancelado.");
        return new Enviado();
    }

}
