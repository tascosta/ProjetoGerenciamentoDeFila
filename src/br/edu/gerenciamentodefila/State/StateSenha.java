package br.edu.gerenciamentodefila.State;

public interface StateSenha {

    StateSenha getAtendido();

    StateSenha getDescartado();

    StateSenha getAguardando();

}
