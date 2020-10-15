package application;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import com.sun.javafx.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
  
    
    


public class MeuControle2 implements Initializable {
	    @FXML
	    private BarChart<String, Number> graficomeu;
	
	   @FXML
	   private CategoryAxis eixoX;

	   @FXML
	   private NumberAxis eixoY;
   
	   
	   
	   @FXML
	   private Button btnFechar;
	   
	    
	   
	  
	   
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		Series<String, Number> dt =new XYChart.Series<>();
		String [] situ= {"Muito abaixo do peso", "Abaixo do peso", "Peso normal","Acima do peso", "Obesidade I","Obesidade II (severa)", "Obesidade III (mórbida)"}; 
		int [] ind ={10,17, 19, 25, 30, 35, 40};
		for (int i=0; i<7;i++)
		{
			dt.getData().add(new Data<String, Number>(situ[i], ind[i]));
			
		}
		dt.setName("classificação");
		
		graficomeu.getData().addAll(dt);
		
	}
	
	 
        
    
    
    @FXML
    public void fechar(ActionEvent event) {
	   System.out.println("botão fechar do gráfico");
       Node node = (Node) event.getSource();
   	   Stage stage = (Stage) node.getScene().getWindow();
   	   Parent root = null;
   	   try {
   	       root = FXMLLoader.load(getClass().getResource("/application/TesteG.fxml"));
   	      } catch (IOException e) {
   		    e.printStackTrace();
   	     }
   	    Scene scene = new Scene(root);
   	    stage.setScene(scene);
     	stage.show();

    	
    }
    
    

}

