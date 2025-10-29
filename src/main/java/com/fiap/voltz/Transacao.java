package com.fiap.voltz;

/**
 * Classe que representa uma Transação no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Transacao {
    private int idTransacao;
    private int oidAprovacao; // FK para Aprovação (1:1)
    private int oidCripto; // FK para Criptoativo
    private int oidConta; // FK para Conta
    private String dataTransacao;
    private double valorTransacao;
    private String tipoTransacao;
    
    // Construtor
    public Transacao(int idTransacao, int oidAprovacao, int oidCripto, int oidConta, 
                    String dataTransacao, double valorTransacao, String tipoTransacao) {
        this.idTransacao = idTransacao;
        this.oidAprovacao = oidAprovacao;
        this.oidCripto = oidCripto;
        this.oidConta = oidConta;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        this.tipoTransacao = tipoTransacao;
    }
    
    // Métodos específicos
    public void processarTransacao() {
        System.out.println("=== PROCESSANDO TRANSAÇÃO ===");
        System.out.println("ID: " + this.idTransacao);
        System.out.println("Tipo: " + this.tipoTransacao);
        System.out.println("Valor: R$ " + this.valorTransacao);
        System.out.println("Data: " + this.dataTransacao);
        System.out.println("Conta ID: " + this.oidConta);
        System.out.println("Criptoativo ID: " + this.oidCripto);
        System.out.println("Aprovação ID: " + this.oidAprovacao);
        System.out.println("Transação processada com sucesso!");
    }
    
    public void cancelarTransacao() {
        System.out.println("Transação ID " + this.idTransacao + " foi CANCELADA!");
    }
    
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DA TRANSAÇÃO ===");
        System.out.println("ID: " + this.idTransacao);
        System.out.println("Tipo: " + this.tipoTransacao);
        System.out.println("Valor: R$ " + this.valorTransacao);
        System.out.println("Data: " + this.dataTransacao);
        System.out.println("Conta ID: " + this.oidConta);
        System.out.println("Criptoativo ID: " + this.oidCripto);
        System.out.println("Aprovação ID: " + this.oidAprovacao);
    }
    
    public boolean isCompra() {
        return "Compra".equals(this.tipoTransacao);
    }
    
    public boolean isVenda() {
        return "Venda".equals(this.tipoTransacao);
    }
    
    public boolean isTransferencia() {
        return "Transferência".equals(this.tipoTransacao);
    }
    
    // Getters e Setters
    public int getIdTransacao() {
        return idTransacao;
    }
    
    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }
    
    public int getOidAprovacao() {
        return oidAprovacao;
    }
    
    public void setOidAprovacao(int oidAprovacao) {
        this.oidAprovacao = oidAprovacao;
    }
    
    public int getOidCripto() {
        return oidCripto;
    }
    
    public void setOidCripto(int oidCripto) {
        this.oidCripto = oidCripto;
    }
    
    public int getOidConta() {
        return oidConta;
    }
    
    public void setOidConta(int oidConta) {
        this.oidConta = oidConta;
    }
    
    public String getDataTransacao() {
        return dataTransacao;
    }
    
    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    
    public double getValorTransacao() {
        return valorTransacao;
    }
    
    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
    
    public String getTipoTransacao() {
        return tipoTransacao;
    }
    
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    
    @Override
    public String toString() {
        return "Transacao{" +
                "idTransacao=" + idTransacao +
                ", oidAprovacao=" + oidAprovacao +
                ", oidCripto=" + oidCripto +
                ", oidConta=" + oidConta +
                ", dataTransacao='" + dataTransacao + '\'' +
                ", valorTransacao=" + valorTransacao +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                '}';
    }
}