/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.gerenciamentodefila;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author TSC
 */
public class GerenciamentoDeFila extends Application {

    public static Scene scene;
    public static Parent principal, EmitirSenha, telasFilas;

    @Override
    public void start(Stage stage) throws Exception {
        principal = FXMLLoader.load(getClass().getResource("view/FXMLPrincipal.fxml"));
        EmitirSenha = FXMLLoader.load(getClass().getResource("view/FXMLEmitirSenha.fxml"));
        telasFilas = FXMLLoader.load(getClass().getResource("view/FXMLMenuFilas.fxml"));
        
        scene = new Scene(principal);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
