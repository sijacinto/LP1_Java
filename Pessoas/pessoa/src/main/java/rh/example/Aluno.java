package rh.example;

public class Aluno extends PessoaFisica{
	
	private int RA;
	
	public Aluno(String n, String sexo, int RA) {
		super(n, sexo);
		this.RA=RA;
		
	}
	
	public Aluno() {
		super("","neutro");
		
		
	}
	public int getRA() {
		return this.RA;
	}

	public void setRA(int rA) {
		this.RA = rA;
	}
	
	public String escreverAfazeres() {
		String a="estuda muito";
		return(a);
		}
	

}