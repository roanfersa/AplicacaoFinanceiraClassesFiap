package com.fiap.voltz;

/**
 * Classe que representa uma conta poupança
 * Herda de Conta e implementa operações específicas de conta poupança
 */
public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private int diaAniversario;
    
    // Construtor
    public ContaPoupanca(int idConta, int oidEmpresa, int oidUsuario, String tipoConta, 
                         String statusAtual, String apelidoConta, String nomeConta,
                         double taxaRendimento, int diaAniversario) {
        super(idConta, oidEmpresa, oidUsuario, tipoConta, statusAtual, apelidoConta, nomeConta);
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public void realizarOperacao(double valor) {
        System.out.println("Operação de R$ " + valor + " realizada na conta poupança " + this.apelidoConta);
    }
    
    @Override
    public void calcularRendimento() {
        System.out.println("Calculando rendimento da conta poupança " + this.apelidoConta);
        System.out.println("Taxa de rendimento: " + this.taxaRendimento + "%");
        System.out.println("Dia de aniversário: " + this.diaAniversario);
    }
    
    public void aplicarRendimentoMensal() {
        System.out.println("Aplicando rendimento mensal na conta poupança " + this.apelidoConta);
        calcularRendimento();
    }
    
    public void exibirInformacoesRendimento() {
        System.out.println("=== INFORMAÇÕES DE RENDIMENTO ===");
        System.out.println("Conta: " + this.apelidoConta);
        System.out.println("Taxa: " + this.taxaRendimento + "%");
        System.out.println("Dia Aniversário: " + this.diaAniversario);
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
                "idConta=" + idConta +
                ", oidEmpresa=" + oidEmpresa +
                ", oidUsuario=" + oidUsuario +
                ", tipoConta='" + tipoConta + '\'' +
                ", statusAtual='" + statusAtual + '\'' +
                ", apelidoConta='" + apelidoConta + '\'' +
                ", nomeConta='" + nomeConta + '\'' +
                ", taxaRendimento=" + taxaRendimento +
                ", diaAniversario=" + diaAniversario +
                '}';
    }
}