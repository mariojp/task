package br.ucsal.lab.tarefa;

/**
 * 
 * Classe que representa uma Tarefa
 * 
 * @author Mario Pereira
 */
public class Tarefa {
    
    private String titulo;
    private String descricao;
    private Boolean concluida;


    public Tarefa(){

    }

    public Tarefa(String titulo, String descricao, Boolean concluida){
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public Tarefa(String titulo, String descricao){
        this( titulo,descricao, false);
    }




    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
       this.descricao = descricao; 
    }

    public Boolean getConcluida(){
        return concluida;
    } 

    public void setConcluida(Boolean concluida){
        this.concluida = concluida;
    }





}
