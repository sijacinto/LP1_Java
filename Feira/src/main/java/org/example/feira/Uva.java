package org.example.feira;

public class Uva extends Fruta {
// atributos
    private String variedade;
    private Boolean semente;
// construtor
    public Uva(String cor, Double peso, String variedade, Boolean semente) {
        super("Uva", cor, peso);
        this.variedade = variedade;
        this.semente = semente;
    }


    public Uva() {

    }

    // métodos de acesso
    public String getVariedade() {
        return variedade;
    }

    public Boolean getSemente() {
        return semente;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    public void setSemente(Boolean Semente) {
        this.semente = Semente;
    }

    //métodos da classe
    public String fazerSuco() {
        return("Fazendo suco de uva.");
    }

    public String madurar() {
        return("Uva em processo de amadurecimento.");
    }
    public String comer() {
        return("Que uva gostosa!!");
    }
}