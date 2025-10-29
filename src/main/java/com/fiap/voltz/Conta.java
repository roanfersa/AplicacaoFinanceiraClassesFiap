package com.fiap.voltz;

/**
 * Classe base para todas as contas do sistema financeiro
 * Representa uma conta bancária genérica
 */
public abstract class Conta {
    protected String numeroConta;
    protected String titular;
    protected double saldo;
    protected String tipoConta;
    
    // Construtor
    public Conta(String numeroConta, String titular, double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
    
    // Métodos abstratos
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void calcularRendimento();
    
    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTipoConta() {
        return tipoConta;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }
}
