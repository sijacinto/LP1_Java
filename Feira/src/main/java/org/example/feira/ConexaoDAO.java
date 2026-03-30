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
			String q="INSERT INTO public.banana (cor,peso,tamanho,tipo) VALUES (?,?,?,?)";
			ps = con.prepareStatement(q);
			ps.setString(1, j.getCor());
			ps.setDouble(2, j.getPeso());
			ps.setDouble(3, j.getTamanho());
			ps.setString(4, j.getTipo());

			ps.execute();
			System.out.println("Fruta inserida!");

		} catch (SQLException e)    {e.printStackTrace();}
		finally{con.close();}
	}

	public void inserirUva(Uva j) throws SQLException	{
		try {
			con = DriverManager.getConnection(config.getUrl());
			String q="INSERT INTO public.uva (cor,peso,semente,variedade) VALUES (?,?,?,?)";
			ps = con.prepareStatement(q);
			ps.setString(1, j.getCor());
			ps.setDouble(2, j.getPeso());
			ps.setBoolean(3, j.getSemente());
			ps.setString(4, j.getVariedade());

			ps.execute();
			System.out.println("Fruta inserida!");

		} catch (SQLException e)    {e.printStackTrace();}
		finally{con.close();}
	}
	public void deletarFruta(int id) throws SQLException {
		try {
			con = DriverManager.getConnection(config.getUrl());
			String q = "DELETE FROM public.uva WHERE id_uva = ?";
			ps = con.prepareStatement(q);
            ps.setInt(1, id);
			int linhas = ps.executeUpdate();
			System.out.println(linhas + " registro(s) afetado(s)");


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public void atualizarUva(int id, Uva j) throws SQLException {
		try {
			con = DriverManager.getConnection(config.getUrl());
			String q = "UPDATE public.uva SET cor = ?, peso = ?, semente = ?, variedade = ? WHERE id = ?";
			ps = con.prepareStatement(q);

			ps.setString(1, j.getCor());
			ps.setDouble(2, j.getPeso());
			ps.setBoolean(3, j.getSemente());
			ps.setString(4, j.getVariedade());
			ps.setInt(5, id);

			ps.execute();
			System.out.println("Uva atualizada!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}


}
