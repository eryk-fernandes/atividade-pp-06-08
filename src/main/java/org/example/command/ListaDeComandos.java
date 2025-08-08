package org.example.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {
    private List<Command> commands = new ArrayList<>();

    public void adicionar(Command command){
        commands.add(command);
    }

    public void executar() {
        for(Command command: commands) {
            command.executar();
        }
    }
}
