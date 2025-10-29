package com.fiap.voltz;

/**
 * Classe que representa uma conta poupança
 * Herda de Conta e implementa operações específicas de conta poupança
 */
public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private int diaAniversario;
    
    // Construtor
    public ContaPoupanca(String numeroConta, String titular, double saldo, 
                        double taxaRendimento, int diaAniversario) {
        super(numeroConta, titular, saldo, "Conta Poupança");
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
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
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    
    @Override
    public void calcularRendimento() {
        double rendimento = this.saldo * (this.taxaRendimento / 100);
        this.saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " aplicado!");
        System.out.println("Novo saldo: R$ " + this.saldo);
    }
    
    public void aplicarRendimentoMensal() {
        System.out.println("Aplicando rendimento mensal na conta poupança...");
        calcularRendimento();
    }
    
    // Getters e Setters específicos
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
    public int getDiaAniversario() {
        return diaAniversario;
    }
    
    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", taxaRendimento=" + taxaRendimento +
                ", diaAniversario=" + diaAniversario +
                '}';
    }
}
