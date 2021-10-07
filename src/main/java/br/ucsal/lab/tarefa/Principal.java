package br.ucsal.lab.tarefa;

public class Principal {
    
    

    public static void main(String ... arg){
        Tarefa t1 = new Tarefa();
        t1.setTitulo("Tarefa 1");
        t1.setDescricao("Descricao 1");
        t1.setConcluida(true);

        Lista lista = new Lista();

        lista.adicionaTarefa(t1);

        for(Tarefa t : lista.getTarefas()){
            System.out.println(t);
        }


    }


}
