package com.fiap.voltz;

/**
 * Classe que representa a relação N:N entre Usuario e Empresa
 * Tabela de junção conforme o diagrama de entidade-relacionamento
 */
public class UsuarioEmpresa {
    private int oidUsuario; // FK para Usuario
    private int oidEmpresa; // FK para Empresa
    private String papelUsuario;
    private String permissaoUsuario;
    
    // Construtor
    public UsuarioEmpresa(int oidUsuario, int oidEmpresa, String papelUsuario, String permissaoUsuario) {
        this.oidUsuario = oidUsuario;
        this.oidEmpresa = oidEmpresa;
        this.papelUsuario = papelUsuario;
        this.permissaoUsuario = permissaoUsuario;
    }
    
    // Métodos específicos
    public void alterarPapel(String novoPapel) {
        this.papelUsuario = novoPapel;
        System.out.println("Papel do usuário alterado para: " + novoPapel);
    }
    
    public void alterarPermissao(String novaPermissao) {
        this.permissaoUsuario = novaPermissao;
        System.out.println("Permissão do usuário alterada para: " + novaPermissao);
    }
    
    public void exibirRelacionamento() {
        System.out.println("=== RELACIONAMENTO USUÁRIO-EMPRESA ===");
        System.out.println("ID Usuário: " + this.oidUsuario);
        System.out.println("ID Empresa: " + this.oidEmpresa);
        System.out.println("Papel: " + this.papelUsuario);
        System.out.println("Permissão: " + this.permissaoUsuario);
    }
    
    // Getters e Setters
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public int getOidEmpresa() {
        return oidEmpresa;
    }
    
    public void setOidEmpresa(int oidEmpresa) {
        this.oidEmpresa = oidEmpresa;
    }
    
    public String getPapelUsuario() {
        return papelUsuario;
    }
    
    public void setPapelUsuario(String papelUsuario) {
        this.papelUsuario = papelUsuario;
    }
    
    public String getPermissaoUsuario() {
        return permissaoUsuario;
    }
    
    public void setPermissaoUsuario(String permissaoUsuario) {
        this.permissaoUsuario = permissaoUsuario;
    }
    
    @Override
    public String toString() {
        return "UsuarioEmpresa{" +
                "oidUsuario=" + oidUsuario +
                ", oidEmpresa=" + oidEmpresa +
                ", papelUsuario='" + papelUsuario + '\'' +
                ", permissaoUsuario='" + permissaoUsuario + '\'' +
                '}';
    }
}
