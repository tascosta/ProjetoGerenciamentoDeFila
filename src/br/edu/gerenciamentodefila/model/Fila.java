package br.edu.gerenciamentodefila.model;

import java.util.ArrayList;

public class Fila {

    private Senha senha = new Senha();
    private int codFila;
    private ArrayList<Senha> listaNormalCopia = new ArrayList<Senha>();
    private ArrayList<Senha> listaNormalEncadernar = new ArrayList<Senha>();
    private ArrayList<Senha> listaNormalImpressao = new ArrayList<Senha>();
    private ArrayList<Senha> listaPrioritarioCopia = new ArrayList<Senha>();
    private ArrayList<Senha> listaPrioritarioEncadernar = new ArrayList<Senha>();
    private ArrayList<Senha> listaPrioritarioImpressao = new ArrayList<Senha>();

    String call = "";
    private static Fila instancia = null;

    public Fila() {

    }

    /**
     * @return the codFila
     */
    public int getCodFila() {
        return codFila;
    }

    /**
     * @param codFila the codFila to set
     */
    public void setCodFila(int codFila) {
        this.codFila = codFila;
    }

    /**
     * @return the senha
     */
    public Senha getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    /**
     * @return the listaNormalCopia
     */
    public ArrayList<Senha> getListaNormalCopia() {
        return listaNormalCopia;
    }

    /**
     * @param listaNormalCopia the listaNormalCopia to set
     */
    public void setListaNormalCopia(ArrayList<Senha> listaNormalCopia) {
        this.listaNormalCopia = listaNormalCopia;
    }

    /**
     * @return the listaNormalEncadernar
     */
    public ArrayList<Senha> getListaNormalEncadernar() {
        return listaNormalEncadernar;
    }

    /**
     * @param listaNormalEncadernar the listaNormalEncadernar to set
     */
    public void setListaNormalEncadernar(ArrayList<Senha> listaNormalEncadernar) {
        this.listaNormalEncadernar = listaNormalEncadernar;
    }

    /**
     * @return the listaNormalImpressao
     */
    public ArrayList<Senha> getListaNormalImpressao() {
        return listaNormalImpressao;
    }

    /**
     * @param listaNormalImpressao the listaNormalImpressao to set
     */
    public void setListaNormalImpressao(ArrayList<Senha> listaNormalImpressao) {
        this.listaNormalImpressao = listaNormalImpressao;
    }

    /**
     * @return the listaPrioritarioCopia
     */
    public ArrayList<Senha> getListaPrioritarioCopia() {
        return listaPrioritarioCopia;
    }

    /**
     * @param listaPrioritarioCopia the listaPrioritarioCopia to set
     */
    public void setListaPrioritarioCopia(ArrayList<Senha> listaPrioritarioCopia) {
        this.listaPrioritarioCopia = listaPrioritarioCopia;
    }

    /**
     * @return the listaPrioritarioEncadernar
     */
    public ArrayList<Senha> getListaPrioritarioEncadernar() {
        return listaPrioritarioEncadernar;
    }

    /**
     * @param listaPrioritarioEncadernar the listaPrioritarioEncadernar to set
     */
    public void setListaPrioritarioEncadernar(ArrayList<Senha> listaPrioritarioEncadernar) {
        this.listaPrioritarioEncadernar = listaPrioritarioEncadernar;
    }

    /**
     * @return the listaPrioritarioImpressao
     */
    public ArrayList<Senha> getListaPrioritarioImpressao() {
        return listaPrioritarioImpressao;
    }

    /**
     * @param listaPrioritarioImpressao the listaPrioritarioImpressao to set
     */
    public void setListaPrioritarioImpressao(ArrayList<Senha> listaPrioritarioImpressao) {
        this.listaPrioritarioImpressao = listaPrioritarioImpressao;
    }

    public void addSenha(Senha senha) {
        this.senha.setDateTime();
        listaNormalCopia.add(senha);
        this.senha = new Senha();
    }

    /**
     * @return the instancia
     */
    public static Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

}
