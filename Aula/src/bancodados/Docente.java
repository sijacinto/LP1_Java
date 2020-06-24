package bancodados;
//classe JavaBeans
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Docente  {
   
	@Id
	private long matricula;
	private double altura;
	private double massa;
	private String nome;
	private char sexo;
    
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public long getMatricula() {
	return matricula;
    }
	
    public void setMatricula(long matricula) {
	this.matricula = matricula;
   }
    
	
}
