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
	    
		/*cod = Long.parseLong(JOptionPane.showInputDialog("Digite RA"));
        q="SELECT * from Aluno where RA='"+ cod+"'";
        System.out.println(q);
        ob1.read(q);
        
        q="DELETE FROM Aluno WHERE RA='" + cod + "'";
        ob1.delete(q);
        
        cod = Long.parseLong(JOptionPane.showInputDialog("Digite RA"));
        q= "UPDATE Aluno SET Nome='Ana', Massa=60, Altura=1.73, Sexo='F' WHERE RA='" + cod + "'";
        ob1.update(q);
       
        q="INSERT INTO Aluno (RA,Nome,Massa,Sexo,Altura) VALUES (130,'Felipe',70,'M',1.90)";
        ob1.createRegistro(q);*/
        
        /*********************************************************************************************************/
		
        System.out.println("*********************Conexão jdbc+DAO******************************");
		
		ConexaoDAO objCon=new ConexaoDAO();
		Aluno aluno=new Aluno("Fabio",'M',Long.parseLong(JOptionPane.showInputDialog("Digite RA")));
	    aluno.setMassa(78);
	    aluno.setAltura(1.84);
	    objCon.insereRegistro(aluno);
		objCon.imprimir(objCon.getLista());
			
		
		
		/*********************************************************************************************************/
		
		System.out.println("*********************Conexão jdbc+jpa+Hibernate******************************");
		
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
