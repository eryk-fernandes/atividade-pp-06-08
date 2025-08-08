package org.example.command;

public class RenomearCommand implements Command{
    private EditorDeArquivos editor;
    private String nome;

    public RenomearCommand(EditorDeArquivos editor, String nome) {
        this.editor = editor;
        this.nome = nome;
    }

    @Override
    public void executar() {
        this.editor.renomear(this.nome);
    }
}
