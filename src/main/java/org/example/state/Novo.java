package org.example.state;

public class Novo implements PedidoEstado{

    @Override
    public PedidoEstado mudarEstado(PedidoEstado pedidoEstado) {
        return new Processando();
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Novo");
    }

    @Override
    public PedidoEstado cancelar(PedidoEstado pedidoEstado) {
        System.out.println("Pedido cancelado");
        return new Cancelado();
    }


}
