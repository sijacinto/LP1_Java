package recurso;
/**
 * 
 * documentação
 * 
 */
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
	   
	   public Carro(){
		   
	   }
	   
	   public Carro(String marca, String Modelo, String cor, int a, String Placa){
		   modelo=Modelo;
		   this.marca=marca;
		   this.cor=cor;
		   ano=a;
		   placa=Placa;
	   }
	   
	   
	   //mï¿½todos de acesso do tipo setter
	    public void setCor(String c){
	    	cor=c;
	    }
	    
	    public void setAno(int a){
	    	ano=a;
	    }
	    
	    public int getAno(){
	    	return ano;
	    }
	    
	    

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setPlaca(String placa){
	    	this.placa=placa;
	    }
	    
	    //mï¿½todo de acesso do tipo getter
	    public String getPlaca(){
	    	return placa;
	    }
	  //mï¿½todo de acesso do tipo getter
	    public String getCor(){
	    	return cor;
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


