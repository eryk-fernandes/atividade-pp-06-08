package org.example.command;

public class EditorDeArquivos {

    public void criar(String nome) {
        System.out.println("Arquivo " + nome + " criado.");
    }

    public void renomear(String nome) {
        System.out.println("Arquivo " + nome + " renomeado.");
    }

    public void excluir(String nome) {
        System.out.println("Arquivo " + nome + " excluído.");
    }

//    public void executarAcao(String acao, String nome) {
//
//        if (acao.equals("criar")) {
//
//            System.out.println("Arquivo " + nome + " criado.");
//
//        } else if (acao.equals("renomear")) {
//
//            System.out.println("Arquivo " + nome + " renomeado.");
//
//        } else if (acao.equals("excluir")) {
//
//            System.out.println("Arquivo " + nome + " excluído.");
//
//        } else {
//
//            System.out.println("Ação desconhecida.");
//        }
//    }
}
