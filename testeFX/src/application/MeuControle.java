package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class MeuControle implements Initializable {
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
	
	public void InserirPessoa(ActionEvent event){
		Pessoa p=new Pessoa(Lcpf.getText(),Lnome.getText());
    	p.setAltura(Float.valueOf((Laltura.getText())));
    	p.setMassa(Float.valueOf((Lmassa.getText())));
    	char s=Lsexo.getText().charAt(0);
    	p.setSexo(s);
    	pessoas.add(p);
    	limparCampos();
	}
    public void fechar(ActionEvent event){
    	System.out.println("Feche a janela no X");
	}
    
    public void limparCampos(){
   	 Lcpf.setText("");
   	 Lmassa.setText("");
   	 Lsexo.setText("");
   	 Lnome.setText("");
   	 Laltura.setText("");
   	 //Lcpf.setPromptText("cpf");
   	 
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

}
