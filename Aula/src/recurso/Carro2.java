package recurso;

import javax.swing.JOptionPane;

public class Carro2 {
	
		private String cor;
		private String modelo;
		private String marca;
		private int ano;
		private String placa;
		
	//construtor	
	   public Carro2(String marca, String Modelo){
		   modelo=Modelo;
		   this.marca=marca;
	   }
	   

	   //métodos de acesso do tipo setter
	    public void setCor(String c){
	    	cor=c;
	    }
	    
	    public void setAno(int a){
	    	ano=a;
	    }
	    
	    public void setPlaca(String placa){
	    	this.placa=placa;
	    }
	    
	    //método de acesso do tipo getter
	    public String getPlaca(){
	    	return placa;
	    }
	    
		//liga o carro
		public void ligar() {
		System.out.println("O carro está ligado");
		}
		
		//desliga o carro
		public	void desligar() {
				System.out.println("O carro na garagem! #Fique em casa com DEUS");
				}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			Carro meuCarro = new Carro("VW","Fox");
			//meuCarro.cor = "Verde"; //Por que não funciona assim?
			meuCarro.setCor("verde");
			meuCarro.setPlaca("DSI1234");
			//System.out.println(meuCarro.placa());//Por que não funciona assim?
			System.out.println("Placa do Fox "+ meuCarro.getPlaca());
			
			Carro[] novoCarro=new Carro [5];
			novoCarro[0]= new Carro ("VW","Golf");
			novoCarro[0].setCor("prata");
			novoCarro[0].setPlaca(JOptionPane.showInputDialog("A placa de seu carro"));
			System.out.println("Placa do Golf é "+novoCarro[0].getPlaca());
			for (int i=1;i<5;i++)
			{
				novoCarro[i]= new Carro ("VW","Golf");
				novoCarro[i].setCor(JOptionPane.showInputDialog("Digite a cor deste carro "+i ));
			}
			
			for (int i=0;i<5;i++)
			{
				//System.out.println("Cor do Golf é "+novoCarro[i].getCor()); //Por que ainda não funciona?
			}
			
		}
		
		}


