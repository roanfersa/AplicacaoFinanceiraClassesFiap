package com.fiap.voltz;

/**
 * Classe que representa um Usuário do sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Usuario {
    private int idUsuario;
    private String dataCadastroUsuario;
    private String tipoUsuario;
    private String senhaUsuario;
    private String emailUsuario;
    private String nomeUsuario;
    
    // Construtor
    public Usuario(int idUsuario, String dataCadastroUsuario, String tipoUsuario, 
                   String senhaUsuario, String emailUsuario, String nomeUsuario) {
        this.idUsuario = idUsuario;
        this.dataCadastroUsuario = dataCadastroUsuario;
        this.tipoUsuario = tipoUsuario;
        this.senhaUsuario = senhaUsuario;
        this.emailUsuario = emailUsuario;
        this.nomeUsuario = nomeUsuario;
    }
    
    // Métodos específicos
    public void alterarSenha(String novaSenha) {
        this.senhaUsuario = novaSenha;
        System.out.println("Senha alterada com sucesso para o usuário: " + this.nomeUsuario);
    }
    
    public void atualizarDados(String nomeUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        System.out.println("Dados do usuário atualizados com sucesso!");
    }
    
    public void exibirDados() {
        System.out.println("=== DADOS DO USUÁRIO ===");
        System.out.println("ID: " + this.idUsuario);
        System.out.println("Nome: " + this.nomeUsuario);
        System.out.println("Email: " + this.emailUsuario);
        System.out.println("Tipo: " + this.tipoUsuario);
        System.out.println("Data Cadastro: " + this.dataCadastroUsuario);
    }
    
    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getDataCadastroUsuario() {
        return dataCadastroUsuario;
    }
    
    public void setDataCadastroUsuario(String dataCadastroUsuario) {
        this.dataCadastroUsuario = dataCadastroUsuario;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
    public String getEmailUsuario() {
        return emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", dataCadastroUsuario='" + dataCadastroUsuario + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", senhaUsuario='" + senhaUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                '}';
    }
}
