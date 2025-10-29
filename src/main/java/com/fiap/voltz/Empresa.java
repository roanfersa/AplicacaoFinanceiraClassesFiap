package com.fiap.voltz;

/**
 * Classe que representa uma Empresa no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Empresa {
    private int idEmpresa;
    private int oidUsuarioResponsavel; // FK para Usuario
    private String nomeEmpresa;
    private String cnpjEmpresa;
    
    // Construtor
    public Empresa(int idEmpresa, int oidUsuarioResponsavel, String nomeEmpresa, String cnpjEmpresa) {
        this.idEmpresa = idEmpresa;
        this.oidUsuarioResponsavel = oidUsuarioResponsavel;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
    }
    
    // Métodos específicos
    public void alterarResponsavel(int novoResponsavelId) {
        this.oidUsuarioResponsavel = novoResponsavelId;
        System.out.println("Responsável da empresa alterado para ID: " + novoResponsavelId);
    }
    
    public void atualizarDados(String nomeEmpresa, String cnpjEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        System.out.println("Dados da empresa atualizados com sucesso!");
    }
    
    public void exibirDados() {
        System.out.println("=== DADOS DA EMPRESA ===");
        System.out.println("ID: " + this.idEmpresa);
        System.out.println("Nome: " + this.nomeEmpresa);
        System.out.println("CNPJ: " + this.cnpjEmpresa);
        System.out.println("ID Responsável: " + this.oidUsuarioResponsavel);
    }
    
    // Getters e Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    public int getOidUsuarioResponsavel() {
        return oidUsuarioResponsavel;
    }
    
    public void setOidUsuarioResponsavel(int oidUsuarioResponsavel) {
        this.oidUsuarioResponsavel = oidUsuarioResponsavel;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }
    
    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
    
    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", oidUsuarioResponsavel=" + oidUsuarioResponsavel +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", cnpjEmpresa='" + cnpjEmpresa + '\'' +
                '}';
    }
}
