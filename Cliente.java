package loja;

public class Cliente {
	
	private String CPF;
	public String nome;
	public String nascimento;
	
	public Cliente(String CPF, String nome, String nascimento) {
		this.CPF = CPF;
		this.nome = nome;
		this.nascimento = nascimento;
		
		System.out.println("Nome: " + nome + "\nCPF: " + CPF + "\nNascimento: "+ nascimento );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente joao = new Cliente("453.099.099.08", "João", "12/03/1954");
		
	}

}
