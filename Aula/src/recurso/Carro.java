package recurso;

public class Carro {
	
		private String cor;
		private String modelo;
		private String marca;
		private int ano;
		private String placa;
		
	//construtor	
	   public Carro(String marca, String Modelo){
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
		}


