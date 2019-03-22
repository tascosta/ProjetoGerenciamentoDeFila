package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.GerenciamentoDeFila;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLEmitirSenhaController implements Initializable {

    @FXML
    private Button btnAtendimentoNormal;
    @FXML
    private Button btnAtendimentoPrioritario;
    @FXML
    private Label lblNumetroSenha;
    @FXML
    private Label lbltipo;
    int n;
    String t;

    ControllerFila fila = new ControllerFila();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void btnAtendimentoNormal(ActionEvent event) {
        fila.crearSenhaNormal();
        n = fila.NumSenhaNormal();
        t = fila.TipoN();
        lblNumetroSenha.setText(Integer.toString(n));
        lbltipo.setText(t);
    }

    @FXML
    void btnAtendimentoPrioritario(ActionEvent event) {
        fila.crearSenhaPrefer();
        n = fila.NumSenhaPref();
        t = fila.TipoP();
        lblNumetroSenha.setText(Integer.toString(n));
        lbltipo.setText(t);

    }

    @FXML
    void btnSair(ActionEvent event) {
        GerenciamentoDeFila.scene.setRoot(GerenciamentoDeFila.principal);
    }

}
