package br.edu.gerenciamentodefila.controller;

import br.edu.gerenciamentodefila.State.StateSenha;

public class ControllerSenha {

    private int senha = 0;
    private int tipoAtendimento = 0;
    private StateSenha estado;

    public ControllerSenha(int tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public void setStatus(StateSenha estado) {
        this.estado = estado;
    }

}
