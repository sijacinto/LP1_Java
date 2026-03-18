package org.example.rh;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PessoaController {

    @FXML
    private Button btAndar;

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btComer;

    @FXML
    private TextField txtId;
    @FXML
    private Label lbComer;

    Pessoa p;

    @FXML
    private TextField txtNome;

    @FXML
    void andarController(ActionEvent event) {
      p.andar();

    }
    @FXML
    void cadastrarController(ActionEvent event) {
        p=new Pessoa(txtNome.getText(),txtId.getText());
        txtNome.clear();
        txtId.clear();


    }

    @FXML
    void comerController(ActionEvent event) {

        lbComer.setText(p.comer());

        //lbComer.setText(p.comer());

    }

}
