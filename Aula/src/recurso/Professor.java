package recurso;

public class Professor extends PessoaFisica {
   int matricula;
	public Professor(String n, char sexo) {
		super(n, sexo);
		// TODO Auto-generated constructor stub
	}
	public Professor(String n){
		super(n,'N');
	}
   @Override
	public void escreverAfazeres() {
		System.out.println("preparar e ministrar aula, corrigir atividades");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor g=new Professor("Adriana",'F');
		   g.comer("salada");
		   g.escreverAfazeres();
		   Professor k=new Professor("Devanir");
		   k.comer("farofa");
		   k.escreverAfazeres();
		   
	}

}
