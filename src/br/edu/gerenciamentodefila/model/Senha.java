package br.edu.gerenciamentodefila.model;

import br.edu.gerenciamentodefila.State.StateSenha;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Senha implements StateSenha {

    private int numSenha;
    private String date;
    private String time;
    private int senha;
    private int tipoServico;
    private String tipoAtendimento;
    private StateSenha estado;

    public Senha(int numSenha, int tipoServico, String tipoAtendimento) {
        this.numSenha = numSenha;
        this.tipoServico = tipoServico;
        this.tipoAtendimento = tipoAtendimento;

    }

    public Senha(String prioritadade, int numSenha) {
        this.tipoAtendimento = prioritadade;

    }

    public Senha() {

    }

    /**
     * @return the num
     */
    public int getNumSenha() {
        return numSenha;
    }

    /**
     * @param num the num to set
     */
    public void setNumSenha(int num) {
        this.numSenha = num;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the tipoServico
     */
    public int getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * @return the tipoAtendimento
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * @param tipoAtendimento the tipoAtendimento to set
     */
    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    /**
     * @return the estado
     */
    public StateSenha getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(StateSenha estado) {
        this.estado = estado;
    }

    public void setDateTime() {
        Locale locale = new Locale("pt", "BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat simple_date = new SimpleDateFormat("dd/MM/yyyy", locale);
        this.date = simple_date.format(calendar.getTime());
        simple_date = new SimpleDateFormat("HH:mm:ss", locale);
        this.time = simple_date.format(calendar.getTime());
    }

    @Override
    public StateSenha getAtendido() {
        estado = estado.getAtendido();
        return estado;
    }

    @Override
    public StateSenha getDescartado() {
        estado = estado.getDescartado();
        return estado;
    }

    @Override
    public StateSenha getAguardando() {
        estado = estado.getAguardando();
        return estado;
    }

}
