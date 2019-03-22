package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.GerenciamentoDeFila;
import br.edu.gerenciamentodefila.model.Fila;
import br.edu.gerenciamentodefila.model.Senha;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class FXMLPrincipalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label lblEscolhaServico;
    @FXML
    private Button btnEncadernar;
    @FXML
    private Button btnImpressao;
    @FXML
    private Button btnChamar;
    @FXML
    private ImageView ImagemChamar;
    @FXML
    private Button btncopia;
    Senha senha = new Senha();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void btnEncadernar(ActionEvent event) {
        GerenciamentoDeFila.scene.setRoot(GerenciamentoDeFila.EmitirSenha);

        if (senha.getTipoAtendimento() == "N") {
            Fila.getInstancia().setCodFila(3);
        } else {
            Fila.getInstancia().setCodFila(4);
        }

    }

    @FXML
    void btnImpressao(ActionEvent event) {
        GerenciamentoDeFila.scene.setRoot(GerenciamentoDeFila.EmitirSenha);

        if (senha.getTipoAtendimento() == "N") {
            Fila.getInstancia().setCodFila(5);
        } else {
            Fila.getInstancia().setCodFila(6);
        }
    }

    @FXML
    void btnChamar(ActionEvent event) {

        for (Senha f : Fila.getInstancia().getListaNormalCopia()) {

            System.out.println("N°" + f.getNumSenha() + " " + "tipo" + "  " + f.getTipoAtendimento() + "  " + f.getDate());

        }

        /*  for (Senha f : Fila.getInstancia().getListaPrioritarioCopia() {

            System.out.println("N°" + f.getNumSenha() + " " + "tipo" + "  " + f.getTipoAtendimento() + "  " + f.getDate());

        }
        GerenciamentoDeFila.scene.setRoot(GerenciamentoDeFila.telasFilas);
         */
    }

    @FXML
    private void btncopia(ActionEvent event) {
        GerenciamentoDeFila.scene.setRoot(GerenciamentoDeFila.EmitirSenha);
        if (senha.getTipoAtendimento() == "N") {
            Fila.getInstancia().setCodFila(1);

        } else {
            Fila.getInstancia().setCodFila(2);
        }
    }

    private void foreach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
