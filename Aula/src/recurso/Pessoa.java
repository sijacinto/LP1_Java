package recurso;

public class Pessoa {
	private char sexo;
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

	private float altura;
	private float massa;
	private String nome;
	
    public Pessoa(String n,char sexo)
    {
    	nome=n;
    	this.sexo=sexo;
    }
	public void andar(int passos) {System.out.println("Andei "+ passos+ " passos");	}
	
	
	public void falar(String oque){	System.out.println("Frase:  " + oque);}
	
	public void ouvir(){}
	
	public boolean sorrir(){return true;}
	
	public void comer(String oque)	{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa J=new Pessoa("João",'M');
	   J.falar("Meu nome é João e nasci agora");
	   J.andar(3);
		}

}
