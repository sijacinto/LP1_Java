package recurso;
import javax.swing.JOptionPane;

public class Teste_Objetos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro[] Car=new Carro [3];
		Pessoa [] Pes =new Pessoa [2];
		Car[0]=new Carro("GM","Onix");
		Car[1]=new Carro();
		Car[2]=new Carro("Fiat","Uno", "branco",2020,"Xyz2222");
		Pes[0]=new Pessoa(JOptionPane.showInputDialog("Digite seu nome:"), 'F');
		Pes[1]=new Pessoa("Hugo",'M');
		for(int i=0;i <2;i++)
		{
			System.out.println("carro"+" \t"+ i + Car[i].getMarca() + Car[i].getModelo());
			System.out.println("pessoa"+i + Pes[i].getNome() + Pes[i].getSexo());
		}
		
		
	    
   }
}
