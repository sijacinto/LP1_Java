package bancodados;
import java.util.List;

//7 a 9/7 prova, 14/7 - última entrega LP1, 15/07 - sub
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;



public class ConexaoJPAHiber {
	
	
	 
	public void Inserir(Object coisa)
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(coisa);
			manager.getTransaction().commit();
		 } catch (Exception ex) 
		  {
             ex.printStackTrace();
             manager.getTransaction().rollback();
        }
	       finally
			{
				manager.close();
				factory.close();
				
			}
	}
	
	public Object SelecionarByID(Object coisa,long id)
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
         Object p = manager.find(coisa.getClass(), id);
		  
		 manager.close();
		 factory.close();
		 return p;
	}
	
	 @SuppressWarnings("unchecked")
     public List<Object> SelecionarTodos(Object coisa) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		EntityManager manager = factory.createEntityManager();
       return manager.createQuery("FROM " + coisa.getClass().getName()).getResultList();
     }
	 
	 
	 
	public void Remover(Object coisa, long id)
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Fatec");
		 EntityManager manager = factory.createEntityManager();
		
		
		 try {
				 manager.getTransaction().begin();
				 manager.remove(manager.find(coisa.getClass(), id));
				 manager.getTransaction().commit();
		 
	       } catch (Exception ex) 
		  {
               ex.printStackTrace();
               manager.getTransaction().rollback();
          }
	       finally
			{
				manager.close();
				factory.close();
				
			}
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
		Aluno prof=new Aluno();
		List<Object> seres; 
		prof.setRA(Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
		prof.setAltura(1.92);
		prof.setMassa(85);
		prof.setSexo('M');
		prof.setNome("Fabiano");
		ConexaoJPAHiber cjh = new ConexaoJPAHiber();
		cjh.Inserir(prof);
		prof.setMassa(87);
		cjh.Atualizar(prof);
		prof=(Aluno) cjh.SelecionarByID(prof, prof.getRA());
		System.out.println("ser"+ prof.getNome());
		cjh.Remover(prof, prof.getRA());
		seres=cjh.SelecionarTodos(prof);
		for(int i=0;i< seres.size();i++){
			prof=(Aluno)seres.get(i);
			System.out.println("meu ser: "+ prof.getNome());
						
		}
		
	}

}
