package bancodados;

import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PessoaFisica {
	@Column
	private double altura;
	@Column
	private double massa;
	@Column
	private String nome;
	@Column
	private char sexo;
	
    public PessoaFisica(String n,char sexo)
    {
    	nome=n;
    	this.sexo=sexo;
    }
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
	public void escreverAfazeres() {
		System.out.println("eu, " + nome + ", andei alguns passos");	
	}
		
	public boolean sorrir() {
		return true;
	}
	
	public void comer(String oque)	{
		System.out.println(nome+ " comeu " + oque);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica n=new PessoaFisica("João",'M');
	   n.comer("arroz");
	   n.escreverAfazeres();
		}

}
