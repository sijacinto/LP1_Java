package org.example.feira;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FrutaController implements Initializable {

    @FXML
    private Button CadastrarBanana;

    @FXML
    private ListView <String> listaViewFrutas;

    @FXML
    private ToggleGroup acao;
    @FXML
    private Button RemoverUva;
    @FXML
    private Button CadastrarUva;

    @FXML
    private ChoiceBox<String> chBoxBanana;

    @FXML
    private CheckBox ckSemSemente;

    @FXML
    private TextField txtCorUva;

    @FXML
    private TextField txtPesoBanana;

    @FXML
    private TextField txtPesoUva;

    @FXML
    private TextField txtTamBanana;

    @FXML
    private TextField txtVariedade;
    @FXML
    private RadioButton rdComerUva;

    @FXML
    private RadioButton rdmadUva;

    @FXML
    private RadioButton rdsucoUva;
    Cesta c;

    public FrutaController(){
      c=new Cesta(10);


    }
    @FXML
    void cadastrarBanana(ActionEvent event) {

        Banana b=new Banana(Double.parseDouble(txtPesoBanana.getText()),Double.parseDouble(txtTamBanana.getText()),chBoxBanana.getValue());;
        String[] cabecalho = {"Nome", "Cor"};
        String[] dados = {b.getNome(),b.getCor()};
        String arquivo = "cesta.csv";
        CsvEscritaLeitura  cwr = new CsvEscritaLeitura();
        cwr.escreverCSV(arquivo, cabecalho, dados);
        c.adicionar(b);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Adiciona itens diretamente
        chBoxBanana.getItems().addAll("maçã", "nanica","ouro","prata",  "terra");
        // (Opcional) Seleciona um item padrão
        chBoxBanana.getSelectionModel().selectFirst();

        List <Fruta> lista= null;
        try {
            lista = c.getFrutas();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Fruta item:lista ){
            listaViewFrutas.getItems().add(item.getNome());
        }

    }
    @FXML
    void cadastrarUva(ActionEvent event) {

    }
    @FXML
    void removerUva(ActionEvent event) {

    }

}