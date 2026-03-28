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
 	   ConfigBD config;

	public ConexaoDAO()
	{
		config = new ConfigBD();
	}

	public ArrayList <Uva> getListaUva() throws SQLException {
			ArrayList<Uva> t = new ArrayList<Uva>();
			try {
				//Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection(config.getUrl());
				ps = con.prepareStatement("select * from public.uva");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Uva f = new Uva();
					f.setCor(rs.getString("cor"));
					f.setPeso(rs.getDouble("peso"));
			    	f.setNome(rs.getString("nome"));
					f.setSemente(rs.getBoolean("semente"));
					f.setVariedade(rs.getString("variedade"));
					System.out.println(f.getSemente());
			  		t.add(f);
			}
			   rs.close();
			   ps.close();					
			} catch (SQLException e) {e.printStackTrace();}
			//catch (ClassNotFoundException e) {
           //     throw new RuntimeException(e);
          //  }

			  return t;
	}

	public void inserirBanana(Banana j) throws SQLException	{
		try {
			con = DriverManager.getConnection(config.getUrl());
			String q="INSERT INTO public.banana (cor,nome,peso,tamanho,tipo) VALUES (?,?,?,?,?)";
			ps = con.prepareStatement(q);
			ps.setString(1, j.getCor());
			ps.setString(2, j.getNome());
			ps.setString(3, String.valueOf(j.getPeso()));
			ps.setString(4, String.valueOf(j.getTamanho()));
			ps.setString(5, j.getTipo());

			ps.execute();
			System.out.println("Fruta inserida!");

		} catch (SQLException e)    {e.printStackTrace();}
		finally{con.close();}
	}

	public static void main(String[] args) throws SQLException {
     ConexaoDAO dao = new ConexaoDAO();
        try {
            dao.getListaUva();
			Banana b1=new Banana(5.0,26.5,"terra");
			dao.inserirBanana(b1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
