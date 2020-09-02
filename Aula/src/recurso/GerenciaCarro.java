package recurso;

public class GerenciaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro geysa=new Carro("Toyota", "Etios");
		Carro jf1=new Carro();
		jf1.setModelo("Uno");
		jf1.setMarca("Fiat");
		jf1.setCor("branco");
		
		jf1.setPlaca("XWS 2346");
		Carro ad2= new Carro("VW","Gol","amarelo",2020,"fdv4566");
		Carro ad= new Carro();
		ad.setModelo("Gol");
		ad.setAno(2018);
		ad.setCor("Vermelho");
		ad.desligar();
		System.out.println("Carro em questão "+ ad.getCor());
		jf1.ligar();
		System.out.println("carro do José " + jf1.getModelo());
		System.out.println("carro da Geysa " + geysa.getModelo());
		
	}

}
