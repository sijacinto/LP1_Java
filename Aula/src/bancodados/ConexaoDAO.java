package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;




public class ConexaoDAO {
	   Connection con;
	
	   ResultSet rs;
	   PreparedStatement ps;
	 //bd db4free.net
	   String url = "jdbc:mysql://db4free.net:3306/fatec_adriana";
	   String user = "fatec_adriana";
	   String password = "12345678";
	 //String driver = "com.mysql.cj.jdbc.Driver";
	
	/******************************************************************************/
	   
	//Padrão de Projeto (Design Patterns) - Data Access Object (DAO)
		public void insereRegistro(Aluno j) throws SQLException
		{
		try {
			con = DriverManager.getConnection(url, user, password);
			String q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (?,?,?,?,?)";
	     	ps = con.prepareStatement(q);
		    ps.setString(1, String.valueOf(j.getRA()));
			ps.setString(2, j.getNome());
			ps.setString(3, String.valueOf(j.getMassa()));
			ps.setString(4, String.valueOf(j.getSexo()));
			ps.setString(5, String.valueOf(j.getAltura()));
			ps.execute();
			System.out.println("Dados do aluno foram inseridos!");
			} catch (SQLException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  finally
			{
				con.close();
			}
	        
	    
	        
		}
/**
 * @throws SQLException *******************************************************************************************************/	
		public ArrayList <Aluno> getLista() throws SQLException {
			ArrayList<Aluno> turma = new ArrayList<Aluno>();
			try {
			
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("select * from Aluno");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setRA(rs.getInt("RA"));
				aluno.setAltura(rs.getFloat("Altura"));
			    aluno.setMassa(rs.getFloat("Massa"));
			    aluno.setNome(rs.getString("Nome"));
			    aluno.setSexo(rs.getString("Sexo").charAt(0));
				turma.add(aluno);
			}
			   rs.close();
			   ps.close();
			   
			
			} catch (SQLException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  finally
			{
				con.close();
				
			}
			return turma;
			
		}	
		
/*********************************************************************************************************/
		public void imprimir(ArrayList <Aluno> turma)
	  {
			for	(Aluno aluno:turma) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Massa: " + aluno.getMassa());
				
				}
		}
		
		
/*********************************************************************************************************/
	
}
