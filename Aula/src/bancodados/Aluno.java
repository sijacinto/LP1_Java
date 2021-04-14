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
		Aluno F=new Aluno("Fernando",'M',2021);
		  System.out.println("Sexo do objeto F: " +F.getSexo());
		   F.comer("Pizza");
		   F.escreverAfazeres();

	}

}
