package br.com.opet.tds.appdespesasandroid;

/**
 * Created by Diego on 21/03/2018.
 */

public class Despesa {
    private String nome;
    private double valor_total;
    private double qtde_pessoas;
    private double divisao_despesa;

    public Despesa() {
    }

    public Despesa(String nome, double valor_total, double qtde_pessoas, double divisao_despesa) {
        this.nome = nome;
        this.valor_total = valor_total;
        this.qtde_pessoas = qtde_pessoas;
        this.divisao_despesa = divisao_despesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getQtde_pessoas() {
        return qtde_pessoas;
    }

    public void setQtde_pessoas(double qtde_pessoas) {
        this.qtde_pessoas = qtde_pessoas;
    }

    public double getDivisao_despesa() {
        return divisao_despesa;
    }

    public void setDivisao_despesa(double divisao_despesa) {
        this.divisao_despesa = divisao_despesa;
    }
}
