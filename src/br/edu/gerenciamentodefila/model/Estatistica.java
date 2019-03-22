package br.edu.gerenciamentodefila.model;

public class Estatistica {

    private int numImpressao;
    private int numCopia;
    private int numEncadernacao;

    public Estatistica() {

    }

    /**
     * @return the numImpressao
     */
    public int getNumImpressao() {
        return numImpressao;
    }

    /**
     * @param numImpressao the numImpressao to set
     */
    public void setNumImpressao(int numImpressao) {
        this.numImpressao = numImpressao;
    }

    /**
     * @return the numCopia
     */
    public int getNumCopia() {
        return numCopia;
    }

    /**
     * @param numCopia the numCopia to set
     */
    public void setNumCopia(int numCopia) {
        this.numCopia = numCopia;
    }

    /**
     * @return the numEncadernacao
     */
    public int getNumEncadernacao() {
        return numEncadernacao;
    }

    /**
     * @param numEncadernacao the numEncadernacao to set
     */
    public void setNumEncadernacao(int numEncadernacao) {
        this.numEncadernacao = numEncadernacao;
    }

}
