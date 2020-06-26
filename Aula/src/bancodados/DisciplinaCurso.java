package bancodados;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DisciplinaCurso {
	@Id
	private long Codigo;
	@Column
	private String Nome;
	private long ProfTitular;
	private long Matriculado;

	public long getCodigo() {
		return Codigo;
	}
	public void setCodigo(long codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public long getProfTitular() {
		return ProfTitular;
	}
	public void setProfTitular(long profTitular) {
		ProfTitular = profTitular;
	}
	public long getMatriculado() {
		return Matriculado;
	}
	public void setMatriculado(long matriculado) {
		Matriculado = matriculado;
	}
	
}
