package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.model.Fila;
import br.edu.gerenciamentodefila.model.Senha;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class FXMLFilaEncadernarController implements Initializable {

    @FXML
    private ListView<Senha> listViewSenhas;
    Fila fila = new Fila();

    private ArrayList<Senha> listaAtendimento = new ArrayList<Senha>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listViewSenhas.getItems().addAll(listaAtendimento);
    }

}
