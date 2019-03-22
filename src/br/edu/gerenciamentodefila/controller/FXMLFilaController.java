package br.edu.gerenciamentodefila.controller;

import static br.edu.gerenciamentodefila.GerenciamentoDeFila.scene;
import br.edu.gerenciamentodefila.model.Fila;
import br.edu.gerenciamentodefila.model.Senha;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class FXMLFilaController implements Initializable {

    Fila fila = new Fila();
    @FXML
    private ListView<?> List1;
    @FXML
    private TableView<?> tableViewSenha;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    /*ListView<Senha> listView = new ListView<>();
    ObservableList<Senha> items = 
            FXCollections.observableArrayList(new Senha(0, "Fiesta"), new Senha(1, "Ranger"), new Senha(2, "Focus"), new Senha(3, "Ka"));
    listView.setItems(items); 
    StackPane root = new StackPane();
    root.getChildren().add(listView);
    Scene scene = new Scene(root, 300, 250); 
    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show(); }
    public void Criarlista() {*/
//    
//        for (Senha itens : fila.getListaAtendimento()) {
//
//        }
    public void preencheLista(ObservableList<Senha> listaSenha) {
        Senha teste = new Senha();
        //        
        // List<Senha> teste = new ArrayList<Senha>(listaSenha);
        // ObservableList<Senha>  listaSenhaObservable = new  FXCollections.observableArrayList(listaSenha);

        // for (Senha senha : listaSenhaObservable) {
        //}
        //tableViewSenha.set;
    }

}
