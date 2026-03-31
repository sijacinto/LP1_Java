package org.example.feira;
//Fruta é superclasse de Uva e Banana
public class Fruta {
// atributos
    private String nome;
    private String cor;
    private Double peso;
// construtor
    public Fruta(String nome, String cor, Double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    public Fruta (){}
//métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
// métodos da classe Fruta
    public String madurar() {
        return(nome + " está maturando.");
    }

    public String comer() {
        return("Comendo a fruta: " + nome);
    }
}