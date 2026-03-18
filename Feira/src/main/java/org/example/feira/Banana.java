package org.example.feira;
// Classe banana é subclasse de Fruta
public class Banana extends Fruta {
// atributos
   private Double tamanho;
    private String tipo;
// método construtor
    public Banana(Double peso, Double tamanho, String tipo) {
        super("Banana", "amarela", peso);
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
//métodos de acesso do tipo setters
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
// métodos de acesso do tipo getters
    public Double getTamanho() {
        return tamanho;
    }

    public String getTipo() {
        return tipo;
    }
//métodos da classe
    public String descascar() {
        return("Descascando a banana.");
    }

    public String fazerVitamina() {
        return("Fazendo vitamina de banana.");
    }
}