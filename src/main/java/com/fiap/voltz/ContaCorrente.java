package com.fiap.voltz;

/**
 * Classe que representa uma conta corrente
 * Herda de Conta e implementa operações específicas de conta corrente
 */
public class ContaCorrente extends Conta {
    private double limiteCredito;
    private double taxaManutencao;
    
    // Construtor
    public ContaCorrente(String numeroConta, String titular, double saldo, 
                        double limiteCredito, double taxaManutencao) {
        super(numeroConta, titular, saldo, "Conta Corrente");
        this.limiteCredito = limiteCredito;
        this.taxaManutencao = taxaManutencao;
    }
    
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }
    
    @Override
    public void sacar(double valor) {
        double saldoDisponivel = this.saldo + this.limiteCredito;
        if (valor > 0 && valor <= saldoDisponivel) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    
    @Override
    public void calcularRendimento() {
        // Conta corrente não tem rendimento
        System.out.println("Conta corrente não possui rendimento.");
    }
    
    public void cobrarTaxaManutencao() {
        this.saldo -= this.taxaManutencao;
        System.out.println("Taxa de manutenção de R$ " + this.taxaManutencao + " cobrada.");
    }
    
    // Getters e Setters específicos
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limiteCredito=" + limiteCredito +
                ", taxaManutencao=" + taxaManutencao +
                '}';
    }
}
