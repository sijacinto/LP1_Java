package recurso;

public class Pessoa {
	//atributos
	private char sexo;
	private float altura;
	private float massa;
	private String nome;
	private String CPF;
	
//construtor
	public Pessoa(String cpf, String nome)
	 {
		    CPF=cpf;
			this.nome=nome;
	    	
	  }
	public Pessoa(String nome, char Sexo)
	 {
		this.nome=nome;    
		sexo=Sexo;
			
	    	
	  }
	public Pessoa()
	 {
		
			
	    	
	  }
	 //métodos de acesso do tipo getters e setters
	 public String getCPF() {
			return CPF;
		}
	 
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getMassa() {
		return massa;
	}
	
	public void setMassa(float massa) {
		this.massa = massa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	//métodos da classe
	public void andar(int passos) {System.out.println("Andei "+ passos+ " passos");	}
	
	
	public void falar(String oque){	System.out.println("Frase:  " + oque);}
	
	public void ouvir(){}
	
	public boolean sorrir(){return true;}
	
	public void comer(String oque)	{}

	
}
