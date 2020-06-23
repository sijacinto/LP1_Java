package recurso;
/*IMPORTANDO BIBLIOTECAS */

//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**

 *

 *
 */
/*CLASSE DE CONEXÃO*/
public class Conexao {
   
	/* ATRIBUTOS DA CLASSE*/
	
   Connection con;
   Statement stmt;
   ResultSet rs;
   PreparedStatement ps;

 /*CONFIGURAÇÃO DO BANCO   */
   
   //bd db4free.net
   String url = "jdbc:mysql://db4free.net:3306/fatec_adriana";
   String user = "fatec_adriana";
   String password = "12345678";
   String driver = "com.mysql.cj.jdbc.Driver";
   
   
/*MÉTODO DE ABERTURA DA CONEXÃO */
    
    public void OpenConexao()

    {

        try{

            //Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
           
          
    

        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, "Erro na conexão com o BD ","ERRO",JOptionPane.ERROR_MESSAGE,null);

        }

    }

  public void close() throws SQLException
  {
	 try
	 {
		
	 }finally
	 {
		 con.close();  
	 }
  }

}