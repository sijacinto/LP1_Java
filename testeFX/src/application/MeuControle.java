package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

//import com.sun.javafx.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import recurso.Pessoa;

  
    
    


public class MeuControle implements Initializable {
	   
   
	   @FXML
	   private Button btnGraf;
	   @FXML
	   private Button btnSalvar;
	   @FXML
	   private Button btnFechar;
	   @FXML
	   private Button btnLimpar;
	   @FXML
	   private Button btnProcurar;
	   @FXML
	   private TextField Lcpf;
	   @FXML
	   private TextField Lnome;
	   @FXML
	   private TextField Lsexo;
	   @FXML
	   private TextField Laltura;
	   @FXML
	   private TextField Lmassa;
	    
	   
	   private ArrayList<Pessoa> pessoas;
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		pessoas=new ArrayList<Pessoa>();
		
		
	}
	
	@FXML
	public void InserirPessoa(ActionEvent event){
		Pessoa p=new Pessoa(Lcpf.getText(),Lnome.getText());
    	p.setAltura(Float.valueOf((Laltura.getText())));
    	p.setMassa(Float.parseFloat((Lmassa.getText())));
    	char s=Lsexo.getText().charAt(0);
    	p.setSexo(s);
    	pessoas.add(p);
    	limparCampos();
	}
	
 
    
    public void limparCampos(){
   	 Lcpf.setText("");
   	 Lmassa.setText("");
   	 Lsexo.setText("");
   	 Lnome.setText("");
   	 Laltura.setText("");
   	 
   	 
    }
    public void Procurar(){
		Pessoa p=new Pessoa();
		
		for (int i=0;i<pessoas.size();i++) 
		{
			p=(Pessoa)pessoas.get(i);
			if (p.getCPF().equals(Lcpf.getText())){
				
				Lnome.setText(p.getNome());
				Lmassa.setText(String.valueOf(p.getMassa()));
				Lsexo.setText(String.valueOf(p.getSexo()));
				Laltura.setText(String.valueOf(p.getAltura()));
				break;
			} 
			
				
		}
		
	}
    
  
	@FXML
    public void mostrarGraf(ActionEvent event) {
    	System.out.println("botão de gráfico");
    	
    	Node node = (Node) event.getSource();
    	Stage stage = (Stage) node.getScene().getWindow();
    	Parent root = null;
    	try {
    	root = FXMLLoader.load(getClass().getResource("/application/Grafico.fxml"));
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
 
    }
    
    
    

}

