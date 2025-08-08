package org.example.state;

public class Pedido {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = new Novo();
    }

    public void mudarEstado() {
        setEstado(estado.mudarEstado(this.estado));
    }

    public void cancelar() {
        setEstado(estado.cancelar(this.estado));
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }
}
