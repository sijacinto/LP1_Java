package org.example.rh;

public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String nome;
    private  String id;
    public Pessoa(String nome, String id){
        this.nome=nome;
        this.id=id;
    }
    public void andar(){
        System.out.println("andando");
    }

    public String comer(){
        return(this.nome +" está comendo");
    }
}
