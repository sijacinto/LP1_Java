package bancodados;
import java.util.List;

//7 a 9/7 prova, 14/7 - última entrega LP1, 15/07 - sub
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import recurso.Carro;

public class ConexaoJPAHiber {
	
	
	 
	public void Inserir(Object coisa)
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(coisa);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
	public Object SelecionarByID(Object coisa,long id)
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
		 Docente prof = manager.find(Docente.class, id);
		  
		 manager.close();
		 factory.close();
		 return prof;
	}
	
	 @SuppressWarnings("unchecked")
     public List<Object> SelecionarTodos() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
       return manager.createQuery("FROM " + Docente.class.getName()).getResultList();
     }
	 
	 
	 
	public void Remover(Object coisa,long id)
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
		 Docente prof = manager.find(Docente.class, id);
		 
		 manager.getTransaction().begin();
		 manager.remove(prof);
		 manager.getTransaction().commit();
		 
		 manager.close();
		 factory.close();
	}
	
	public void Atualizar(Object coisa)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
		
		try{
		
		 manager.getTransaction().begin();
		 manager.merge(coisa);
		 manager.getTransaction().commit();
		 
		} catch (Exception ex) {
            ex.printStackTrace();
            manager.getTransaction().rollback();
         }
		finally
		{
			manager.close();
			factory.close();
		}
	}
	
	
	public static void main(String[] args) {
		Docente prof=new Docente();
		List<Object> docentes; 
		prof.setMatricula(Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
		prof.setAltura(1.92);
		prof.setMassa(85);
		prof.setSexo('M');
		prof.setNome("Fabiano");
		ConexaoJPAHiber cjh = new ConexaoJPAHiber();
		cjh.Inserir(prof);
		prof.setMassa(87);
		cjh.Atualizar(prof);
		cjh.Remover(prof, 23);
		prof=(Docente) cjh.SelecionarByID(prof, 10);
		System.out.println("docente id 10"+ prof.getNome());
		docentes=cjh.SelecionarTodos();
		for(int i=0;i< docentes.size();i++){
			prof=(Docente)docentes.get(i);
			System.out.println("meu docente: "+ prof.getNome());
			
		}
		}

}
