package org.example.command;

public class ExcluirCommand implements Command{
    private EditorDeArquivos editor;
    private String nome;

    public ExcluirCommand(EditorDeArquivos editor, String nome) {
        this.editor = editor;
        this.nome = nome;
    }

    @Override
    public void executar() {
        this.editor.excluir(this.nome);
    }
}
