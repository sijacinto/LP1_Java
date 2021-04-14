package bancodados;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

public class Testa_Conexao_BD {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("*********************Conexão jdbc******************************");
		
		ConexaoJdbc ob1=new ConexaoJdbc();
		String q=new String();
	    long cod;
	    
		cod = Long.parseLong(JOptionPane.showInputDialog("Digite RA"));
        q="SELECT * from Aluno where RA='"+ cod+"'";
        System.out.println(q);
        ob1.read(q);
        
        q="DELETE FROM Aluno WHERE RA='" + cod + "'";
        ob1.delete(q);
        
        cod = Long.parseLong(JOptionPane.showInputDialog("Digite RA"));
        q= "UPDATE Aluno SET Nome='Marcia', Massa=60, Altura=1.73, Sexo='F' WHERE RA='" + cod + "'";
        ob1.update(q);
       
        q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (146028,'Renata',46,'F',1.49)";
        ob1.createRegistro(q);
        
        /*********************************************************************************************************/
		
       System.out.println("*********************Conexão jdbc+DAO******************************");
		
		ConexaoDAO objCon=new ConexaoDAO();
		Aluno aluno=new Aluno("Bruno",'M',Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
	    aluno.setMassa(78);
	    aluno.setAltura(1.84);
	    objCon.insereRegistro(aluno);
		objCon.imprimir(objCon.getLista());
			
		
		
		/*********************************************************************************************************/
		
	    System.out.println("*********************Conexão jdbc+jpa+Hibernate******************************");
		
			Aluno al=new Aluno();
			List<Object> seres; 
			al.setRA(Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
			al.setAltura(1.92);
			al.setMassa(85);
			al.setSexo('M');
			al.setNome("Rubens Barreto");
			ConexaoJPAHiber cjh = new ConexaoJPAHiber();
			cjh.Inserir(al);
			al.setMassa(87);
			cjh.Atualizar(al);
			al=(Aluno) cjh.SelecionarByID(al, al.getRA());
			System.out.println("ser"+ al.getNome());
			cjh.Remover(al, al.getRA());
			seres=cjh.SelecionarTodos(al);
			for(int i=0;i< seres.size();i++){
				al=(Aluno)seres.get(i);
				System.out.println("meu ser: "+ al.getNome());
							
			}
			
		}

	

}
