package com.fiap.voltz;

/**
 * Classe que representa um Criptoativo no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Criptoativo {
    private int idCripto;
    private String descricaoCripto;
    private double cotacaoAtual;
    private String simboloCripto;
    private String nomeCripto;
    
    // Construtor
    public Criptoativo(int idCripto, String descricaoCripto, double cotacaoAtual, 
                      String simboloCripto, String nomeCripto) {
        this.idCripto = idCripto;
        this.descricaoCripto = descricaoCripto;
        this.cotacaoAtual = cotacaoAtual;
        this.simboloCripto = simboloCripto;
        this.nomeCripto = nomeCripto;
    }
    
    // Métodos específicos
    public void atualizarCotacao(double novaCotacao) {
        double cotacaoAnterior = this.cotacaoAtual;
        this.cotacaoAtual = novaCotacao;
        double variacao = ((novaCotacao - cotacaoAnterior) / cotacaoAnterior) * 100;
        System.out.println("Cotação atualizada!");
        System.out.println("Anterior: R$ " + cotacaoAnterior);
        System.out.println("Atual: R$ " + novaCotacao);
        System.out.println("Variação: " + String.format("%.2f", variacao) + "%");
    }
    
    public void calcularValorInvestimento(double quantidade) {
        double valorTotal = quantidade * this.cotacaoAtual;
        System.out.println("=== CÁLCULO DE INVESTIMENTO ===");
        System.out.println("Criptoativo: " + this.nomeCripto + " (" + this.simboloCripto + ")");
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Cotação Atual: R$ " + this.cotacaoAtual);
        System.out.println("Valor Total: R$ " + valorTotal);
    }
    
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CRIPTOATIVO ===");
        System.out.println("ID: " + this.idCripto);
        System.out.println("Nome: " + this.nomeCripto);
        System.out.println("Símbolo: " + this.simboloCripto);
        System.out.println("Descrição: " + this.descricaoCripto);
        System.out.println("Cotação Atual: R$ " + this.cotacaoAtual);
    }
    
    // Getters e Setters
    public int getIdCripto() {
        return idCripto;
    }
    
    public void setIdCripto(int idCripto) {
        this.idCripto = idCripto;
    }
    
    public String getDescricaoCripto() {
        return descricaoCripto;
    }
    
    public void setDescricaoCripto(String descricaoCripto) {
        this.descricaoCripto = descricaoCripto;
    }
    
    public double getCotacaoAtual() {
        return cotacaoAtual;
    }
    
    public void setCotacaoAtual(double cotacaoAtual) {
        this.cotacaoAtual = cotacaoAtual;
    }
    
    public String getSimboloCripto() {
        return simboloCripto;
    }
    
    public void setSimboloCripto(String simboloCripto) {
        this.simboloCripto = simboloCripto;
    }
    
    public String getNomeCripto() {
        return nomeCripto;
    }
    
    public void setNomeCripto(String nomeCripto) {
        this.nomeCripto = nomeCripto;
    }
    
    @Override
    public String toString() {
        return "Criptoativo{" +
                "idCripto=" + idCripto +
                ", descricaoCripto='" + descricaoCripto + '\'' +
                ", cotacaoAtual=" + cotacaoAtual +
                ", simboloCripto='" + simboloCripto + '\'' +
                ", nomeCripto='" + nomeCripto + '\'' +
                '}';
    }
}
