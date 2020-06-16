package recurso;

public class PessoaFisica {
	protected char sexo;
	protected float altura;
	protected float massa;
	protected String nome;
	
    public PessoaFisica(String n,char sexo)
    {
    	nome=n;
    	this.sexo=sexo;
    }
	public void escreverAfazeres() {
		System.out.println("eu, " + nome + ", andei alguns passos");	
		}
	
	
	public boolean sorrir(){return true;}
	
	public void comer(String oque)	{System.out.println(nome+ " comeu " + oque);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica n=new PessoaFisica("João",'M');
	   n.comer("arroz");
	   n.escreverAfazeres();
		}

}
