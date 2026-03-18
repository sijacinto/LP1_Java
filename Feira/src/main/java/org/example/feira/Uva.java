package org.example.feira;

public class Uva extends Fruta {
// atributos
    private String variedade;
    private Boolean semSemente;
// construtor
    public Uva(String cor, Double peso, String variedade, Boolean semSemente) {
        super("Uva", cor, peso);
        this.variedade = variedade;
        this.semSemente = semSemente;
    }
// métodos de acesso
    public String getVariedade() {
        return variedade;
    }

    public Boolean getSemSemente() {
        return semSemente;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    public void setSemSemente(Boolean semSemente) {
        this.semSemente = semSemente;
    }

    //método da classe
    public String fazerSuco() {
        return("Fazendo suco de uva.");
    }
}