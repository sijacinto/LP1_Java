package org.example;

import java.io.File;

public class Pessoa {
// atributos
        private double altura;

        private double massa;

        private String nome;

        private String sexo;
        // construtor
        public Pessoa(String n, String sexo, double altura, double massa)
        {
            nome=n;
            this.sexo=sexo;
            this.altura=altura;
            this.massa=massa;
        }
//métodos de acesso
        public String getSexo() {
            return this.sexo;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public double getMassa() {
            return massa;
        }
        public void setMassa(double massa) {
            this.massa = massa;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
//métodos de classe
        public String escreverAfazeres() {
           return("eu, " + nome + ", andei alguns passos");	
        }
            
        public boolean sorrir() {
            return true;
        }
        
        public String comer(String oque)	{
            return(nome+ "  comeu  " + oque);
        }

        public void salvar() {
            String caminho = "pessoa.csv";
            File arquivo = new File(caminho);
            String[] cabecalho;
            if (arquivo.exists()) cabecalho=null;
            else cabecalho = new String[]{"Nome", "Massa", "Altura", "Sexo"};
            String[][] dados = {
                    {getNome(), String.valueOf(getMassa()), String.valueOf(getAltura()),getSexo()},
                                };
            System.out.println(String.valueOf(getMassa()) + getMassa());
            CsvEscritaLeitura  cwr = new CsvEscritaLeitura();
            cwr.escreverCSV(caminho, cabecalho, dados);
        }

}
