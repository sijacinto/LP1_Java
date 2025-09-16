package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PessoaController {

    @FXML
    private Button btnCadastrarPessoa;

    @FXML
    private Label saida;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtMassa;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSexo;

    @FXML
    public void CadastrarPessoa(ActionEvent event) {

    Pessoa p=new Pessoa(txtNome.getText(),txtSexo.getText(),Double.parseDouble(txtAltura.getText()),Double.parseDouble(txtMassa.getText()));
    p.salvar();
    txtNome.setText("");
    txtSexo.setText("");
    txtAltura.setText("");
    txtMassa.setText("");
    }

}
