package com.fiap.voltz;

/**
 * Classe base para todas as contas do sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public abstract class Conta {
    protected int idConta;
    protected int oidEmpresa; // FK para Empresa
    protected int oidUsuario; // FK para Usuario
    protected String tipoConta;
    protected String statusAtual;
    protected String apelidoConta;
    protected String nomeConta;
    
    // Construtor
    public Conta(int idConta, int oidEmpresa, int oidUsuario, String tipoConta, 
                String statusAtual, String apelidoConta, String nomeConta) {
        this.idConta = idConta;
        this.oidEmpresa = oidEmpresa;
        this.oidUsuario = oidUsuario;
        this.tipoConta = tipoConta;
        this.statusAtual = statusAtual;
        this.apelidoConta = apelidoConta;
        this.nomeConta = nomeConta;
    }
    
    // Métodos abstratos
    public abstract void realizarOperacao(double valor);
    public abstract void calcularRendimento();
    
    // Métodos específicos
    public void ativarConta() {
        this.statusAtual = "Ativa";
        System.out.println("Conta " + this.apelidoConta + " foi ATIVADA!");
    }
    
    public void desativarConta() {
        this.statusAtual = "Inativa";
        System.out.println("Conta " + this.apelidoConta + " foi DESATIVADA!");
    }
    
    public void exibirDados() {
        System.out.println("=== DADOS DA CONTA ===");
        System.out.println("ID: " + this.idConta);
        System.out.println("Nome: " + this.nomeConta);
        System.out.println("Apelido: " + this.apelidoConta);
        System.out.println("Tipo: " + this.tipoConta);
        System.out.println("Status: " + this.statusAtual);
        System.out.println("ID Empresa: " + this.oidEmpresa);
        System.out.println("ID Usuário: " + this.oidUsuario);
    }
    
    // Getters e Setters
    public int getIdConta() {
        return idConta;
    }
    
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    public int getOidEmpresa() {
        return oidEmpresa;
    }
    
    public void setOidEmpresa(int oidEmpresa) {
        this.oidEmpresa = oidEmpresa;
    }
    
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public String getTipoConta() {
        return tipoConta;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public String getStatusAtual() {
        return statusAtual;
    }
    
    public void setStatusAtual(String statusAtual) {
        this.statusAtual = statusAtual;
    }
    
    public String getApelidoConta() {
        return apelidoConta;
    }
    
    public void setApelidoConta(String apelidoConta) {
        this.apelidoConta = apelidoConta;
    }
    
    public String getNomeConta() {
        return nomeConta;
    }
    
    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
    
    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", oidEmpresa=" + oidEmpresa +
                ", oidUsuario=" + oidUsuario +
                ", tipoConta='" + tipoConta + '\'' +
                ", statusAtual='" + statusAtual + '\'' +
                ", apelidoConta='" + apelidoConta + '\'' +
                ", nomeConta='" + nomeConta + '\'' +
                '}';
    }
}