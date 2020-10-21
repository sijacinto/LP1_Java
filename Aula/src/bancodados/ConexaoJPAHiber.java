package bancodados;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




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
	
	
	

}
