package rh.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProfessorAlunoController {

    @FXML
    private TextField aa;

    @FXML
    private Button btCadAlu;

    @FXML
    private Button btCadProf;

    @FXML
    private TextField ma;

    @FXML
    private TextField na;

    @FXML
    private TextField raa;

    @FXML
    private TextField sa;

    @FXML
    private Label saida;
    
    @FXML
    void CadastrarAluno(ActionEvent event) {
        
        Aluno F=new Aluno(na.getText(),sa.getText(),Integer.parseInt(raa.getText()));
        System.out.println("Sexo do objeto F: " +F.getSexo());
        saida.setText(F.comer("Pizza") +" e  " + F.escreverAfazeres());
    
        

    }

}
