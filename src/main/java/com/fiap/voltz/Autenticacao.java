package com.fiap.voltz;

/**
 * Classe que representa a Autenticação de um Usuário no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Autenticacao {
    private int idAutenticacao;
    private int oidUsuario; // FK para Usuario (relação 1:1)
    private String ultimoLogin;
    private String statusAprovacao; // Status de autenticação/login
    
    // Construtor
    public Autenticacao(int idAutenticacao, int oidUsuario, String ultimoLogin, String statusAprovacao) {
        this.idAutenticacao = idAutenticacao;
        this.oidUsuario = oidUsuario;
        this.ultimoLogin = ultimoLogin;
        this.statusAprovacao = statusAprovacao;
    }
    
    // Métodos específicos
    public void realizarLogin() {
        this.ultimoLogin = java.time.LocalDateTime.now().toString();
        this.statusAprovacao = "Autenticado";
        System.out.println("Login realizado com sucesso!");
        System.out.println("Último login: " + this.ultimoLogin);
    }
    
    public void realizarLogout() {
        this.statusAprovacao = "Deslogado";
        System.out.println("Logout realizado com sucesso!");
    }
    
    public boolean isAutenticado() {
        return "Autenticado".equals(this.statusAprovacao);
    }
    
    public void exibirStatusAutenticacao() {
        System.out.println("=== STATUS DE AUTENTICAÇÃO ===");
        System.out.println("ID Autenticação: " + this.idAutenticacao);
        System.out.println("ID Usuário: " + this.oidUsuario);
        System.out.println("Status: " + this.statusAprovacao);
        System.out.println("Último Login: " + this.ultimoLogin);
    }
    
    public void atualizarUltimoLogin() {
        this.ultimoLogin = java.time.LocalDateTime.now().toString();
        System.out.println("Último login atualizado: " + this.ultimoLogin);
    }
    
    // Getters e Setters
    public int getIdAutenticacao() {
        return idAutenticacao;
    }
    
    public void setIdAutenticacao(int idAutenticacao) {
        this.idAutenticacao = idAutenticacao;
    }
    
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public String getUltimoLogin() {
        return ultimoLogin;
    }
    
    public void setUltimoLogin(String ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
    public String getStatusAprovacao() {
        return statusAprovacao;
    }
    
    public void setStatusAprovacao(String statusAprovacao) {
        this.statusAprovacao = statusAprovacao;
    }
    
    @Override
    public String toString() {
        return "Autenticacao{" +
                "idAutenticacao=" + idAutenticacao +
                ", oidUsuario=" + oidUsuario +
                ", ultimoLogin='" + ultimoLogin + '\'' +
                ", statusAprovacao='" + statusAprovacao + '\'' +
                '}';
    }
}
