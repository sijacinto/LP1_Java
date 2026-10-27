package org.example.feira;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class FrutaController implements Initializable {

    @FXML
    private Button CadastrarBanana;
    @FXML
    private ListView <String> listaViewFrutas;
    @FXML
    private ToggleGroup acao;
    @FXML
    private Label acaoUva;
    @FXML
    private Button RemoverUva;
    @FXML
    private Button CadastrarUva;
    @FXML
    private ChoiceBox<String> chBoxBanana;
    @FXML
    private CheckBox cksemente;
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

    private final ObservableList<String> itensDaLista = FXCollections.observableArrayList();

    Cesta c;
    ConexaoDAO dao;
    Uva u;

    public FrutaController(){
      c=new Cesta(10);
      dao = new ConexaoDAO();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Adiciona itens diretamente
        chBoxBanana.getItems().addAll( "maçã","nanica","ouro","prata","terra");
        // (Opcional) Seleciona um item padrão
        chBoxBanana.getSelectionModel().selectFirst();

        List <Fruta> lista= null;
        try {
            lista = c.getFrutas();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        listaViewFrutas.setItems(itensDaLista);
        for (Fruta item:lista ){
            //listaViewFrutas.getItems().add(item.getNome());

            itensDaLista.add(item.getNome());
        }

    }
    // escrevendo em um arquivo csv
    public void salvarCSV(Fruta f) throws IOException {

        //String[] cabecalho = {"Nome", "Cor"};
        String[] cabecalho = null;
        String[] dados = {f.getNome(),f.getCor()};
        String arquivo = "cesta.csv";
        CsvEscritaLeitura  cwr = new CsvEscritaLeitura();
        cwr.escreverCSV(arquivo, cabecalho, dados);
        c.adicionar(f);

        //atualização do lista
        itensDaLista.clear();
        List<Fruta> novaLista = c.getFrutas();
        if (novaLista != null) {
            for (Fruta item : novaLista) {
                itensDaLista.add(item.getNome());
            }
        }

    }

    @FXML
    void cadastrarBanana(ActionEvent event) throws SQLException, IOException {
        Banana b=new Banana(Double.parseDouble(txtPesoBanana.getText()),Double.parseDouble(txtTamBanana.getText()),chBoxBanana.getValue());;
      //inserindo no banco de dados
        dao.inserirBanana(b);
        salvarCSV(b);
        txtPesoBanana.clear();
        txtTamBanana.clear();

    }

    @FXML
    void cadastrarUva(ActionEvent event) throws SQLException, IOException {
        u=new Uva(txtCorUva.getText(),Double.parseDouble(txtPesoUva.getText()),txtVariedade.getText(),cksemente.isSelected());
        dao.inserirUva(u);
        salvarCSV(u);
        txtCorUva.clear();
        txtPesoUva.clear();
        txtVariedade.clear();
        cksemente.setSelected(false);

    }

    @FXML
    void removerUva(ActionEvent event) throws SQLException {
        Integer id;
        String entrada= JOptionPane.showInputDialog("Digite o id da fruta");
        try {
            id= Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro válido.");
            id=0;
        }
        dao.deletarFruta(id);

    }

    @FXML
    void rdacaomudar(ActionEvent event) {

       if(rdComerUva.isSelected()) acaoUva.setText(u.comer());
       if(rdmadUva.isSelected()) acaoUva.setText(u.madurar());
       if( rdsucoUva.isSelected()) acaoUva.setText(u.fazerSuco());

    }

}