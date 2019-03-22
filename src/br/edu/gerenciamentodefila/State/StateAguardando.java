package br.edu.gerenciamentodefila.State;

import br.edu.gerenciamentodefila.model.Senha;

public class StateAguardando implements StateSenha {

    @Override
    public StateSenha getAtendido() {
        System.out.println("Senha Atendida...");
        return (StateSenha) new Senha();

    }

    @Override
    public StateSenha getDescartado() {
        System.out.println("Senha Cancelada...");
        return (StateSenha) new Senha();
    }

    @Override
    public StateSenha getAguardando() {
        System.out.println("Senha Aguardando...");
        return (StateSenha) new Senha();
    }

}
