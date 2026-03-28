package org.example.feira;

import javafx.application.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//Padr�o de Projeto (Design Patterns) - Data Access Object (DAO)

public class ConexaoDAO {
	   Connection con;
	   ResultSet rs;
	   PreparedStatement ps;

	private final String URL="jdbc:postgresql://db.qsmrqasxynvtcblddxyg.supabase.co:5432/postgres?user=postgres&password=Idalina@1943";
	//private final String USER = "postgres";
	//private final String PASSWORD = "Idalina@1943";

	//String driver = "com.mysql.cj.jdbc.Driver";
	/*  public void insereRegistro(Fruta j) throws SQLException	{
		try {
			con = DriverManager.getConnection(url, user, password);
			//String q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (?,?,?,?,?)";
			/*insert into public.fruta ("cor","nome","peso","tamanho") values ('rosada','uva',200,15);
	     	        ps = con.prepareStatement(q);
		        ps.setString(1, String.valueOf(j.getRA()));
			ps.setString(2, j.getNome());
			ps.setString(3, String.valueOf(j.getMassa()));
			ps.setString(4, String.valueOf(j.getSexo()));
			ps.setString(5, String.valueOf(j.getAltura()));
			ps.execute();
			System.out.println("Dados do aluno foram inseridos!");
			} catch (SQLException e)    {e.printStackTrace();}
		          finally{con.close();	}
	 }*/
	public ArrayList <Fruta> getLista() throws SQLException {
			ArrayList<Fruta> t = new ArrayList<Fruta>();
			try {
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection(URL);
				//con = DriverManager.getConnection(URL, USER, PASSWORD);
				ps = con.prepareStatement("select * from public.fruta");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Fruta f = new Fruta();
					f.setCor(rs.getString("cor"));
					f.setPeso(rs.getDouble("peso"));
			    	f.setNome(rs.getString("nome"));
					System.out.println(f.getCor());
			  		t.add(f);
			}
			   rs.close();
			   ps.close();					
			} catch (SQLException e) {e.printStackTrace();}
			catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

			  return t;
	}	
	/*public void imprimir(ArrayList <Aluno> turma) {
			for(Aluno aluno:turma) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Massa: " + aluno.getMassa());				
				}
		}*/

	public static void main(String[] args) throws SQLException {
     ConexaoDAO dao = new ConexaoDAO();
        try {
            dao.getLista();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
