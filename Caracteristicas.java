package loja;

public class Caracteristicas {
	public String modelo;
	public int ano;
	public String cor;
	public String marca;
	

	
	public Caracteristicas(String modelo, int ano, String cor, String marca) {
		
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.marca = marca;
		
		System.out.println("Modelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nMarca: " + marca);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caracteristicas Carro1 = new Caracteristicas("Gol", 1999, "Prata", "Volkswagem");
		
		
	}

}
