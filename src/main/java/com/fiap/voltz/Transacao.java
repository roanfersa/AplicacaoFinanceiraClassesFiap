package com.fiap.voltz;

/**
 * Classe que representa uma transação bancária
 * Registra operações de depósito, saque e transferência
 */
public class Transacao {
    private String idTransacao;
    private String tipoTransacao;
    private double valor;
    private String dataTransacao;
    private String numeroContaOrigem;
    private String numeroContaDestino;
    private String status;
    
    // Construtor para depósito e saque
    public Transacao(String idTransacao, String tipoTransacao, double valor, 
                    String dataTransacao, String numeroContaOrigem) {
        this.idTransacao = idTransacao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
        this.numeroContaOrigem = numeroContaOrigem;
        this.status = "Pendente";
    }
    
    // Construtor para transferência
    public Transacao(String idTransacao, String tipoTransacao, double valor, 
                    String dataTransacao, String numeroContaOrigem, String numeroContaDestino) {
        this.idTransacao = idTransacao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
        this.numeroContaOrigem = numeroContaOrigem;
        this.numeroContaDestino = numeroContaDestino;
        this.status = "Pendente";
    }
    
    // Métodos específicos
    public void processarTransacao() {
        this.status = "Processada";
        System.out.println("Transação " + this.idTransacao + " processada com sucesso!");
    }
    
    public void cancelarTransacao() {
        this.status = "Cancelada";
        System.out.println("Transação " + this.idTransacao + " cancelada!");
    }
    
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DA TRANSAÇÃO ===");
        System.out.println("ID: " + this.idTransacao);
        System.out.println("Tipo: " + this.tipoTransacao);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Data: " + this.dataTransacao);
        System.out.println("Conta Origem: " + this.numeroContaOrigem);
        if (this.numeroContaDestino != null) {
            System.out.println("Conta Destino: " + this.numeroContaDestino);
        }
        System.out.println("Status: " + this.status);
    }
    
    // Getters e Setters
    public String getIdTransacao() {
        return idTransacao;
    }
    
    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }
    
    public String getTipoTransacao() {
        return tipoTransacao;
    }
    
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getDataTransacao() {
        return dataTransacao;
    }
    
    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
    
    public String getNumeroContaOrigem() {
        return numeroContaOrigem;
    }
    
    public void setNumeroContaOrigem(String numeroContaOrigem) {
        this.numeroContaOrigem = numeroContaOrigem;
    }
    
    public String getNumeroContaDestino() {
        return numeroContaDestino;
    }
    
    public void setNumeroContaDestino(String numeroContaDestino) {
        this.numeroContaDestino = numeroContaDestino;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Transacao{" +
                "idTransacao='" + idTransacao + '\'' +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                ", valor=" + valor +
                ", dataTransacao='" + dataTransacao + '\'' +
                ", numeroContaOrigem='" + numeroContaOrigem + '\'' +
                ", numeroContaDestino='" + numeroContaDestino + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
