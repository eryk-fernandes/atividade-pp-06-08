package org.example.state;

public class Pedido {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = new Novo();
    }

    public void mudarEstado() {
        estado = estado.mudarEstado(this.estado);
    }

    public void cancelar() {
        estado = estado.cancelar(this.estado);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }
}
