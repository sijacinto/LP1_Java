package vertebrados;
/**
 * 
 * @author sijac
 *
 */
public class Cachorro {
//atributos
	private String pelagem;
	private char porte;
	private String ra�a;
	private char genero;
	private float peso;
	private String cor;
	private int idade;
	private boolean vacina;
	private boolean pedigree;
	//m�todos de acesso
	
	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public char getPorte() {
		return porte;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float p) {
		peso = p;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}
	
	//m�todo construtor
	public Cachorro(String ra�a, String cor1, char gen){
		this.ra�a=ra�a;
		cor=cor1;
		this.genero=gen;
		
	}
	//m�todos de classes
	public void latir(){
		System.out.println("au, au, au");
	}
	
	public void abanarRabo(){
		System.out.println("Abanar,abanar, abanar...");
	}
	
	public boolean sentar(boolean obd){
		if (obd) {
			System.out.println("Sentado");
		}
		else
		{
			System.out.println("Tudo menos sentado");
		}
		
		return obd;
	}
	

}
