package bancodados;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professor extends PessoaFisica {
   @Id
  // @GeneratedValue
	long matricula;
   
   
   public Professor(String n, char sexo, long matricula) {
		super(n, sexo);
		this.matricula=matricula;
		// TODO Auto-generated constructor stub
	}
   
   public Professor(){
		super("",'N');
		
	}
	public Professor(String n,long matricula){
		super(n,'N');
		this.matricula=matricula;
	}
	
	public long getMatricula() {
	return matricula;
    }
	
    public void setMatricula(long matricula) {
	this.matricula = matricula;
   }
    	
   @Override
	public void escreverAfazeres() {
		System.out.println("preparar e ministrar aula, corrigir atividades");
	}
   
}
