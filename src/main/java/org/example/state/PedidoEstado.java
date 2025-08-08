package org.example.state;

public interface PedidoEstado {

    PedidoEstado mudarEstado(PedidoEstado pedidoEstado);
    void mostrarEstado();
    PedidoEstado cancelar(PedidoEstado pedidoEstado);

}
