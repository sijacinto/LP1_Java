package recurso;
import javax.swing.JOptionPane;
public class TestaCarro {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro[] Car=new Carro [3];
		Object[] item = new Object [3];
		Object selecionado=new Object();
		
		for (int i=0;i<3;i++)
		{
			Car[i]= new Carro ("VW","Golf");
			Car[i].setCor(JOptionPane.showInputDialog("Digite a cor deste carro "+i ));
			Car[i].setPlaca(JOptionPane.showInputDialog("A placa do carro"));
			Car[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("O ano do carro")));
		}
				
		
	      
		for (int i=0;i<3;i++)	item[i]=Car[i].getPlaca();
		selecionado = JOptionPane.showInputDialog(null, "Escolha placa", "Opção", JOptionPane.INFORMATION_MESSAGE, null, item, item[0]); 
	
		
	
		for (int i=0;i<3;i++) 
		{
			
			if (selecionado.equals(Car[i].getPlaca()))
			   System.out.println("Cor do carro é  " + Car[i].getCor()); 
				
		}
		
	    
   }
}
