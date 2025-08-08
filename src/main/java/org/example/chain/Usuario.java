package org.example.chain;

public class Usuario {

    private String user;
    private boolean autenticado;
    private boolean autorizado;
    private boolean dadosvalidos;

    public Usuario(String user, boolean autenticado, boolean autorizado, boolean dadosvalidos) {
        this.user = user;
        this.autenticado = autenticado;
        this.autorizado = autorizado;
        this.dadosvalidos = dadosvalidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public boolean isDadosvalidos() {
        return dadosvalidos;
    }

    public void setDadosvalidos(boolean dadosvalidos) {
        this.dadosvalidos = dadosvalidos;
    }
}
