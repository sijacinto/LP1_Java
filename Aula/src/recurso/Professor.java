package recurso;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professor extends PessoaFisica {
   @Id
  // @GeneratedValue
	int matricula;
   
   
   public Professor(String n, char sexo, int matricula) {
		super(n, sexo);
		this.matricula=matricula;
		// TODO Auto-generated constructor stub
	}
   
   public Professor(){
		super("",'N');
		
	}
	public Professor(String n,int matricula){
		super(n,'N');
		this.matricula=matricula;
	}
	
	public int getMatricula() {
	return matricula;
    }
	
    public void setMatricula(int matricula) {
	this.matricula = matricula;
   }
    
	
   @Override
	public void escreverAfazeres() {
		System.out.println("preparar e ministrar aula, corrigir atividades");
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor g=new Professor("Adriana",'F',21);
		   g.comer("salada");
		   g.escreverAfazeres();
		   Professor k=new Professor("Devanir", 31);
		   k.comer("farofa");
		   k.escreverAfazeres();
		   
	}

}
