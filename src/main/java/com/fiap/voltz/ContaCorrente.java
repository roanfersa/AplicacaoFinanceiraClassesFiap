package com.fiap.voltz;

/**
 * Classe que representa uma conta corrente
 * Herda de Conta e implementa operações específicas de conta corrente
 */
public class ContaCorrente extends Conta {
    private double limiteCredito;
    private double taxaManutencao;
    
    // Construtor
    public ContaCorrente(int idConta, int oidEmpresa, int oidUsuario, String tipoConta, 
                        String statusAtual, String apelidoConta, String nomeConta,
                        double limiteCredito, double taxaManutencao) {
        super(idConta, oidEmpresa, oidUsuario, tipoConta, statusAtual, apelidoConta, nomeConta);
        this.limiteCredito = limiteCredito;
        this.taxaManutencao = taxaManutencao;
    }
    
    @Override
    public void realizarOperacao(double valor) {
        System.out.println("Operação de R$ " + valor + " realizada na conta corrente " + this.apelidoConta);
    }
    
    @Override
    public void calcularRendimento() {
        // Conta corrente não tem rendimento
        System.out.println("Conta corrente não possui rendimento.");
    }
    
    public void cobrarTaxaManutencao() {
        System.out.println("Taxa de manutenção de R$ " + this.taxaManutencao + " cobrada na conta " + this.apelidoConta);
    }
    
    public void exibirLimiteCredito() {
        System.out.println("Limite de crédito da conta " + this.apelidoConta + ": R$ " + this.limiteCredito);
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
                "idConta=" + idConta +
                ", oidEmpresa=" + oidEmpresa +
                ", oidUsuario=" + oidUsuario +
                ", tipoConta='" + tipoConta + '\'' +
                ", statusAtual='" + statusAtual + '\'' +
                ", apelidoConta='" + apelidoConta + '\'' +
                ", nomeConta='" + nomeConta + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", taxaManutencao=" + taxaManutencao +
                '}';
    }
}