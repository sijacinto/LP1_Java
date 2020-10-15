package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			Parent root1=FXMLLoader.load(getClass().getResource("/application/TesteG.fxml"));
			primaryStage.setTitle("Cadastro de Pessoa");
			primaryStage.setScene(new Scene(root1));
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
