package com.fiap.voltz;

/**
 * Classe que representa um Relatório no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Relatorio {
    private int idRelatorio;
    private int oidUsuario; // FK para Usuario que gerou
    private String dataGeracaoRelatorio;
    private String operiodoFim;
    private String operiodoInicio;
    private String nomeRelatorio;
    
    // Construtor
    public Relatorio(int idRelatorio, int oidUsuario, String dataGeracaoRelatorio, 
                    String operiodoFim, String operiodoInicio, String nomeRelatorio) {
        this.idRelatorio = idRelatorio;
        this.oidUsuario = oidUsuario;
        this.dataGeracaoRelatorio = dataGeracaoRelatorio;
        this.operiodoFim = operiodoFim;
        this.operiodoInicio = operiodoInicio;
        this.nomeRelatorio = nomeRelatorio;
    }
    
    // Métodos específicos
    public void gerarRelatorio() {
        System.out.println("=== GERANDO RELATÓRIO ===");
        System.out.println("Nome: " + this.nomeRelatorio);
        System.out.println("Período: " + this.operiodoInicio + " até " + this.operiodoFim);
        System.out.println("Data Geração: " + this.dataGeracaoRelatorio);
        System.out.println("Gerado por Usuário ID: " + this.oidUsuario);
        System.out.println("Relatório gerado com sucesso!");
    }
    
    public void exibirPeriodo() {
        System.out.println("Período do relatório: " + this.operiodoInicio + " - " + this.operiodoFim);
    }
    
    public void alterarPeriodo(String novoInicio, String novoFim) {
        this.operiodoInicio = novoInicio;
        this.operiodoFim = novoFim;
        System.out.println("Período do relatório alterado para: " + novoInicio + " - " + novoFim);
    }
    
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DO RELATÓRIO ===");
        System.out.println("ID: " + this.idRelatorio);
        System.out.println("Nome: " + this.nomeRelatorio);
        System.out.println("Período: " + this.operiodoInicio + " até " + this.operiodoFim);
        System.out.println("Data Geração: " + this.dataGeracaoRelatorio);
        System.out.println("Gerado por Usuário ID: " + this.oidUsuario);
    }
    
    // Getters e Setters
    public int getIdRelatorio() {
        return idRelatorio;
    }
    
    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }
    
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public String getDataGeracaoRelatorio() {
        return dataGeracaoRelatorio;
    }
    
    public void setDataGeracaoRelatorio(String dataGeracaoRelatorio) {
        this.dataGeracaoRelatorio = dataGeracaoRelatorio;
    }
    
    public String getOperiodoFim() {
        return operiodoFim;
    }
    
    public void setOperiodoFim(String operiodoFim) {
        this.operiodoFim = operiodoFim;
    }
    
    public String getOperiodoInicio() {
        return operiodoInicio;
    }
    
    public void setOperiodoInicio(String operiodoInicio) {
        this.operiodoInicio = operiodoInicio;
    }
    
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
    
    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
    
    @Override
    public String toString() {
        return "Relatorio{" +
                "idRelatorio=" + idRelatorio +
                ", oidUsuario=" + oidUsuario +
                ", dataGeracaoRelatorio='" + dataGeracaoRelatorio + '\'' +
                ", operiodoFim='" + operiodoFim + '\'' +
                ", operiodoInicio='" + operiodoInicio + '\'' +
                ", nomeRelatorio='" + nomeRelatorio + '\'' +
                '}';
    }
}
