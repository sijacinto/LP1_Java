package rh.example;

public class PessoaFisica {
// atributos       
        private double altura;
        
        private double massa;
        
        private String nome;
        
        private String sexo;
        // construtor
        public PessoaFisica(String n,String sexo)
        {
            nome=n;
            this.sexo=sexo;
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
        public void escreverAfazeres() {
            System.out.println("eu, " + nome + ", andei alguns passos");	
        }
            
        public boolean sorrir() {
            return true;
        }
        
        public void comer(String oque)	{
            System.out.println(nome+ " comeu " + oque);
        }

}
