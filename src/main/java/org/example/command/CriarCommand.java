package org.example.command;

public class CriarCommand implements Command{

    private EditorDeArquivos editor;
    private String nome;

    public CriarCommand(EditorDeArquivos editor, String nome) {
        this.editor = editor;
        this.nome = nome;
    }

    @Override
    public void executar() {
        this.editor.criar(this.nome);
    }
}
