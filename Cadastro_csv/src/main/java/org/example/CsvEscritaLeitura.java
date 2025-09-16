package org.example;

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


    // Exemplo de uso
    public static void main(String[] args) {
        String caminho = "saida.csv";
        String[] cabecalho = {"ID", "Nome", "Email"};
        String[][] dados = {
            {"1", "Ana", "ana@email.com"},
            {"2", "Bruno", "bruno@email.com"},
            {"3", "Carlos", "carlos@gmail.com"},
            {"4","Adriana","adriana@fatec.com"}
        };
        CsvEscritaLeitura  cwr = new CsvEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
        List<String[]> linhas=cwr.lerCSV(caminho,";");
        for (String[] linha : linhas) {
            System.out.println(linha[1]);
        }

    }
}
