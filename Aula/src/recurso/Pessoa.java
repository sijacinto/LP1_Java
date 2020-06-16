package recurso;

public class Pessoa {
	char sexo;
	float altura;
	float massa;
	String nome;
	
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
