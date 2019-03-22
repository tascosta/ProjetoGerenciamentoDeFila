package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.model.Fila;
import br.edu.gerenciamentodefila.model.Senha;

public class ControllerFila {

    static private int num_normal = 0;
    static private int num_prefer = 0;
    static private String tipoP = "P";
    static private String tipoN = "N";

    public ControllerFila() {

    }

    public void crearSenhaNormal() {
        Senha senha = new Senha();
        senha.setTipoAtendimento("N");
        senha.getTipoServico();
        senha.setNumSenha(this.num_normal);
        senha.setDateTime();
        Fila.getInstancia().addSenha(senha);
        this.num_normal++;

    }

    public void crearSenhaPrefer() {
        Senha senha = new Senha();
        senha.setTipoAtendimento("P");
        senha.setNumSenha(this.num_prefer);
        senha.setDateTime();
        Fila.getInstancia().addSenha(senha);
        this.num_prefer++;
    }

    public int NumSenhaNormal() {
        return num_normal;
    }

    public int NumSenhaPref() {
        return num_prefer;
    }

    public String TipoP() {
        return tipoP = "P";

    }

    public String TipoN() {
        return tipoN = "N";
    }

    /*public void listar(){
    for (Senha f : fila.getListaAtendimento()) {  
     
   }  
   }*/
    public void encaminhaSenha(Senha senha, Fila fila) {

    }

    public void pularSenha(Senha senha) {

    }

}
