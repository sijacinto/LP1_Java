package recurso;




import java.sql.SQLException;

import javax.swing.JOptionPane;



public class InterBD {
	Conexao objCon=null;
	
	public void abrirConexao()
	{
		try{
			objCon = new Conexao();
	        objCon.OpenConexao();
	        objCon.stmt = objCon.con.createStatement();
	 } catch (Exception e) 
		{

         JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

         }
		
	}
	
//******************************************************************/	
	public void createRegistro(String q) throws SQLException {
		
		try {

			abrirConexao();

            //Executa a query de inserção
           objCon.stmt.executeUpdate(q);
           JOptionPane.showMessageDialog(null, "registro inserido");
		}
		finally
		{
			objCon.close();
		}
	
	}
	
//**************************************************************/	
	public void read (String query) throws SQLException {
		try {

			abrirConexao();
            
            objCon.rs = objCon.stmt.executeQuery(query);
           
          
            if (objCon.rs.next()) {

                System.out.println(objCon.rs.getString("RA")+ objCon.rs.getString("Nome")+ objCon.rs.getString("Sexo")+ objCon.rs.getString("Massa")+objCon.rs.getString("Altura"));
               	
             
            	JOptionPane.showMessageDialog(null,objCon.rs.getString("RA")+ objCon.rs.getString("Nome")+ objCon.rs.getString("Sexo")+ objCon.rs.getString("Massa")+objCon.rs.getString("Altura"));
            	
                

            } 
            else {

                     JOptionPane.showMessageDialog(null, "Não existe Cliente com este Código !");
               
            }
		
		} //fim do try
		
		catch (Exception ex) {

	                              JOptionPane.showMessageDialog(null,"erro aqui");

	       }
		finally
		{
			objCon.close();
		}
			
	
	}

//***********************************************************************************/
	public void update(String query) throws SQLException{
		try {

			abrirConexao();
            

            objCon.stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(null, " Dados atualizados");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
		finally
		{
			objCon.close();
		}//Fim try
		
	}

	
//*************************************************************************/	
	public void delete(String query) throws SQLException {
		try {

			abrirConexao();
            
            objCon.stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "item excluído");
            
		
		}//Fim try 
		catch (Exception ex) {

	            JOptionPane.showMessageDialog(null, "erro ao exlcuir");

	        }
		finally
		{
			objCon.close();
		}
			
	}
	
//********************************************************************************/
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String q=new String();
		InterBD TBD=new InterBD();
		int cod;
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite RA"));
        q="SELECT * from Aluno where RA='"+ cod+"'";
        System.out.println(q);
        TBD.read(q);
        
        q="DELETE FROM Aluno WHERE RA='" + cod + "'";
        TBD.delete(q);
       q= "UPDATE Aluno SET Nome='Ana', Massa=60, Altura=1.73, Sexo='F' WHERE RA='" + cod + "'";
        TBD.update(q);
        q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (5,'Marcos',70,'M',1.90)";
        TBD.createRegistro(q);
                  
	}

}
