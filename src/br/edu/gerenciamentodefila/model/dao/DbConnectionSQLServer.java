package br.edu.gerenciamentodefila.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionSQLServer {

    Connection conn;

    public Connection getConnection() {

        String url = "jdbc:sqlserver://localhost:DESKTOP-CMU2H64" + "databaseName=GESTORFILA";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // conn = DriverManager.getConnection(url);
            System.out.println("Conexao OK!");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Conexao Falhou!");
            return null;
        }

    }

}
