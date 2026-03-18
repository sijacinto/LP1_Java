package org.example.feira;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class CsvEscritaLeitura {

    public void escreverCSV(String caminhoArquivo, String[] cabecalho, String[][] dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            
            // Escreve o cabeçalho
            if (cabecalho != null) {
                writer.write(String.join(";", cabecalho)); // usa ; como separador
                writer.newLine();
            }

            // Escreve os dados
            for (String[] linha : dados) {
                writer.write(String.join(";", linha));
                writer.newLine();
            }

            System.out.println("Arquivo CSV gravado com sucesso em: " + caminhoArquivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void escreverCSV(String caminhoArquivo, String[] cabecalho, String[] dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {

            // Escreve o cabeçalho
            if (cabecalho != null) {
                writer.write(String.join(";", cabecalho)); // usa ; como separador
                writer.newLine();
            }

            // Escreve os dados
                writer.write(String.join(";", dados));
                writer.newLine();


            System.out.println("Arquivo CSV gravado com sucesso em: " + caminhoArquivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> lerCSV(String caminhoArquivo, String separador) {
        List<String[]> linhas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Divide a linha pelo separador (ex: ";" ou ",")
                String[] campos = linha.split(separador);
                linhas.add(campos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }



}
