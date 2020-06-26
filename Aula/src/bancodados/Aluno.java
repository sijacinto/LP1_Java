package bancodados;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno extends PessoaFisica{
	@Id
	private long RA;
	
	public Aluno(String n, char sexo,long RA) {
		super(n, sexo);
		this.RA=RA;
		// TODO Auto-generated constructor stub
	}
	
	public Aluno() {
		super("",'g');
		
		// TODO Auto-generated constructor stub
	}
	public long getRA() {
		return RA;
	}

	public void setRA(long rA) {
		RA = rA;
	}

	
	
	public void escreverAfazeres() {
		System.out.println("estudar muito");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno J=new Aluno("Felipe",'M',2020);
		   J.comer("feijão");
		   J.escreverAfazeres();

	}

}
