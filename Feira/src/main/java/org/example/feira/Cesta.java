package org.example.feira;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cesta {
// atributos
    private int capacidade;
    private List<Fruta> frutas;

//métodos de acesso do tipo Getter
    public int getCapacidade() {
        return capacidade;
    }

    public List<Fruta> getFrutas() throws IOException {
        CsvEscritaLeitura  cwr = new CsvEscritaLeitura();
        List<String[]> linhas=cwr.lerCSV("cesta.csv",";");
        for (String[] linha : linhas) {
            Fruta f= new Fruta(linha[0],linha[1],2.0);
            frutas.add(f);
            ;
        }
        return frutas;
    }
// construtor
    public Cesta(int capacidade) {
        this.capacidade = capacidade;
        this.frutas = new ArrayList<>();
    }
// métodos da classe
    public void adicionar(Fruta fruta) {

        if (frutas.size() < capacidade) {
            frutas.add(fruta);
            System.out.println("Fruta adicionada na cesta.");
        } else {
            System.out.println("Cesta cheia!");
        }

    }

    public void remover(Fruta fruta) {
        frutas.remove(fruta);
        System.out.println("Fruta removida da cesta.");
    }
}