package recurso;

public class Aluno extends PessoaFisica{
	private int RA;
	
	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public Aluno(String n, char sexo,int RA) {
		super(n, sexo);
		this.RA=RA;
		// TODO Auto-generated constructor stub
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
