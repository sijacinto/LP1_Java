package bancodados;
//7 a 9/7 prova, 14/7 - última entrega LP1, 15/07 - sub
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class ConexaoJPAHiber {
	
	public void InsereDocente()
	{
		Docente prof=new Docente();
		prof.setMatricula(Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
		prof.setAltura(181);
		prof.setMassa(85);
		prof.setSexo('M');
		prof.setNome("Rubens");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(prof);
		manager.getTransaction().commit();
		System.out.println("Matricula do professor: " + prof.getMatricula());
		manager.close();
		factory.close();
	}
	
	public void SelectDocente()
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
		 Docente prof = manager.find(Docente.class, 1L);
		 
		 System.out.println("Meu docente"); 
		 System.out.println(prof.getNome());
		 manager.close();
		 factory.close();
	}
	
	public static void main(String[] args) {
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		//factory.close();
		ConexaoJPAHiber cjh = new ConexaoJPAHiber();
		cjh.InsereDocente();
		//cjh.SelectDocente();
		}

}
