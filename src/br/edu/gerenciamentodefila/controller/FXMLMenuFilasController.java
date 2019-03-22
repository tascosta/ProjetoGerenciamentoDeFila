package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.model.Senha;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLMenuFilasController implements Initializable {

    @FXML
    private TableView<?> tableViewSenhaCopia;
    @FXML
    private TableColumn<Senha, Integer> ColumnSenha;
    @FXML
    private TableColumn<Senha, String> ColummTipo;
    @FXML
    private TableColumn<Senha, String> ColumnData;
    @FXML
    private TableColumn<Senha, String> ColumnHora;
    @FXML
    private TableView<?> tableViewSenhaEncadernar;
    @FXML
    private TableColumn<?, ?> ColunaSenha;
    @FXML
    private TableColumn<?, ?> ColunaTipo;
    @FXML
    private TableColumn<?, ?> ColunaHora;
    @FXML
    private TableView<?> tableViewSenhaImpressao;
    @FXML
    private TableColumn<?, ?> colunaSenha;
    @FXML
    private TableColumn<?, ?> colunaTipo;
    @FXML
    private TableColumn<?, ?> colunaData;
    @FXML
    private TableColumn<?, ?> colunaHora;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getSenha();
    }

    public ObservableList<Senha> getSenha() {

        ColumnSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
        ColummTipo.setCellValueFactory(new PropertyValueFactory<>("tipoAtendimento"));
        ColumnData.setCellValueFactory(new PropertyValueFactory<>("data"));
        ColumnHora.setCellValueFactory(new PropertyValueFactory<>("hora"));

        ObservableList<Senha> listasenha = FXCollections.observableArrayList();

        /* for (Senha f : Fila.getInstancia().getListaAtendimento()) {
            
          
        listasenha.add(f);

        }
         */
        return listasenha;

    }

}
