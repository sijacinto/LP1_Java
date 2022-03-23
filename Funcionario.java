package loja;

public class Funcionario {
	private int id;
	public String nome;
	public String cargo;
	
	public Funcionario(int id, String nome, String cargo) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		
		System.out.println("Nome: " + nome + "\nId: " + id + "\nCargo: "+ cargo );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario lucas = new Funcionario(1923, "Lucas", "Vendedor");
		
	}
}
