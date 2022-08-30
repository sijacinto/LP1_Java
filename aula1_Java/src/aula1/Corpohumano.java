package aula1;

public class Corpohumano {
	//atributos
	private char sexo;
	private double altura;
	private double massa;
	private String nome;
	
	// métodos de acesso
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
	public void andar(int passos) {
		System.out.println("A pessoa  "+ nome + "  andou  " + passos + " passos");
	}

	public String falar() {
		return("OI");
	}
	
	public int ouvir(String instrumento) {
		System.out.println("A pessoa ouviu;" + instrumento);
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criando objeto
		Corpohumano c1=new Corpohumano();
		c1.setNome("Luciano");
		c1.setMassa(75);
		System.out.println(c1.getNome() + " "+ c1.getMassa());
		c1.setMassa(68);
		System.out.println(c1.getNome() + " "+ c1.getMassa());
		c1.andar(30);
		
		Corpohumano c2;
		c2=new Corpohumano();
		c2.setNome("Elizabeth");
		c2.sexo = 'f';
		System.out.println(c2.getNome() + " "+ c2.sexo);

	}

}
