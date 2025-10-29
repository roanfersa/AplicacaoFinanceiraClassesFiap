package com.fiap.voltz;

/**
 * Classe que representa uma Aprovação no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Aprovacao {
    private int idAprovacao;
    private int oidUsuario; // FK para Usuario que aprovou
    private String statusAprovacao;
    private String dataAprovacao;
    
    // Construtor
    public Aprovacao(int idAprovacao, int oidUsuario, String statusAprovacao, String dataAprovacao) {
        this.idAprovacao = idAprovacao;
        this.oidUsuario = oidUsuario;
        this.statusAprovacao = statusAprovacao;
        this.dataAprovacao = dataAprovacao;
    }
    
    // Métodos específicos
    public void aprovar() {
        this.statusAprovacao = "Aprovada";
        System.out.println("Aprovação ID " + this.idAprovacao + " foi APROVADA!");
    }
    
    public void rejeitar() {
        this.statusAprovacao = "Rejeitada";
        System.out.println("Aprovação ID " + this.idAprovacao + " foi REJEITADA!");
    }
    
    public void pendente() {
        this.statusAprovacao = "Pendente";
        System.out.println("Aprovação ID " + this.idAprovacao + " está PENDENTE!");
    }
    
    public boolean isAprovada() {
        return "Aprovada".equals(this.statusAprovacao);
    }
    
    public void exibirStatus() {
        System.out.println("=== STATUS DA APROVAÇÃO ===");
        System.out.println("ID: " + this.idAprovacao);
        System.out.println("Status: " + this.statusAprovacao);
        System.out.println("Data: " + this.dataAprovacao);
        System.out.println("Aprovado por Usuário ID: " + this.oidUsuario);
    }
    
    // Getters e Setters
    public int getIdAprovacao() {
        return idAprovacao;
    }
    
    public void setIdAprovacao(int idAprovacao) {
        this.idAprovacao = idAprovacao;
    }
    
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public String getStatusAprovacao() {
        return statusAprovacao;
    }
    
    public void setStatusAprovacao(String statusAprovacao) {
        this.statusAprovacao = statusAprovacao;
    }
    
    public String getDataAprovacao() {
        return dataAprovacao;
    }
    
    public void setDataAprovacao(String dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }
    
    @Override
    public String toString() {
        return "Aprovacao{" +
                "idAprovacao=" + idAprovacao +
                ", oidUsuario=" + oidUsuario +
                ", statusAprovacao='" + statusAprovacao + '\'' +
                ", dataAprovacao='" + dataAprovacao + '\'' +
                '}';
    }
}
