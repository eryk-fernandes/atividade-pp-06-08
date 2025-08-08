package org.example.command;


// TODO: Você está desenvolvendo um aplicativo que permite ao usuário realizar comandos como:
//  - Criar um arquivo
//  - Renomear um arquivo
//  - Excluir um arquivo
//  .
//  APlique o padrão Command para que o usuário consiga adicionar novos comandos facilmente


public class Main {

    public static void main(String[] args) {

        EditorDeArquivos editor = new EditorDeArquivos();
        ListaDeComandos listaDeComandos = new ListaDeComandos();

        listaDeComandos.adicionar(new CriarCommand(editor, "documento.txt"));
        listaDeComandos.adicionar(new RenomearCommand(editor, "documento.txt"));
        listaDeComandos.adicionar(new ExcluirCommand(editor, "documento.txt"));

        listaDeComandos.executar();
    }
}
