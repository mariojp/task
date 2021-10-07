package br.ucsal.lab.tarefa;

import java.util.List;
import java.util.*;

public class Lista {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>(); 


    public List<Tarefa> getTarefas(){
        return this.tarefas;
    }

    public void adicionaTarefa(Tarefa tarefa){
        if(tarefa.getTitulo().length()>0){
            this.tarefas.add(tarefa);
        }
    }

}