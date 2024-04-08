package rh.example;

public class Professor extends PessoaFisica {
//atributos       
         int matricula;
        
//construtores        
        public Professor(String n, String sexo, int matricula) {
             super(n, sexo);
             this.matricula=matricula;
             
         }
        
        public Professor(){
             super("","neutro");
             
         }
         public Professor(String n,int matricula){
             super(n,"neutro");
             this.matricula=matricula;
         }
 // métodos de acesso        
         public int getMatricula() {
         return matricula;
         }
         
         public void setMatricula(int matricula) {
         this.matricula = matricula;
        }
//método de classe            
        @Override
         public String escreverAfazeres() {
             return("preparar e ministrar aula, corrigir atividades");
         }
        
}
