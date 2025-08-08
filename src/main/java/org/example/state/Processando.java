package org.example.state;

public class Processando implements PedidoEstado {

    @Override
    public PedidoEstado mudarEstado(PedidoEstado pedidoEstado) {
        return new Enviado();
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Processando");
    }

    @Override
    public PedidoEstado cancelar(PedidoEstado pedidoEstado) {
        System.out.println("Pedido cancelado");
        return new Cancelado();
    }

}
