package vertebrados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner lerTec=new Scanner(System.in);
        int fim =0; 
		
		do {
			System.out.println("Você quer continuarl?1-não 0-sim");
			fim =lerTec.nextInt();
			
		System.out.println("Digite raça e cor do cachorro");
		String r=lerTec.next();
		Cachorro o1=new Cachorro(r,lerTec.next(),'M');
		System.out.println("Qual a idade?");
		o1.setIdade(lerTec.nextInt());
		
		Cachorro o2=new Cachorro(JOptionPane.showInputDialog("Raça?"),"bege",'M');
		o2.latir();
		
		Cachorro o3=new Cachorro("vira lata","caramelo",'F');
		o2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do o2?")));
		
		o3.sentar(false);
		
		Cachorro o4=new Cachorro("vira lata","preto",'F');
		o4.sentar(true);
		
		
		
		
		System.out.println("Idade do o1: " +o1.getIdade());
		System.out.println("Idade do o2: " +o2.getIdade());
		JOptionPane.showMessageDialog(null, o2.getIdade(), "Idade do Cachorro",1);
		
		
			
		} while (fim==0);

	}

}
