package org.example.state;

public class Cancelado implements PedidoEstado {

    @Override
    public PedidoEstado mudarEstado(PedidoEstado pedidoEstado) {
        return new Cancelado();
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Cancelado");
    }

    @Override
    public PedidoEstado cancelar(PedidoEstado pedidoEstado) {
        return new Cancelado();
    }
}
