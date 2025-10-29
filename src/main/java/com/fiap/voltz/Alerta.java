package com.fiap.voltz;

/**
 * Classe que representa um Alerta no sistema financeiro
 * Baseada no diagrama de entidade-relacionamento fornecido
 */
public class Alerta {
    private int idAlerta;
    private int oidCripto; // FK para Criptoativo
    private int oidUsuario; // FK para Usuario que configurou
    private String statusAlerta;
    private double valorAlvo;
    private String tipoAlerta;
    
    // Construtor
    public Alerta(int idAlerta, int oidCripto, int oidUsuario, String statusAlerta, 
                  double valorAlvo, String tipoAlerta) {
        this.idAlerta = idAlerta;
        this.oidCripto = oidCripto;
        this.oidUsuario = oidUsuario;
        this.statusAlerta = statusAlerta;
        this.valorAlvo = valorAlvo;
        this.tipoAlerta = tipoAlerta;
    }
    
    // Métodos específicos
    public void ativarAlerta() {
        this.statusAlerta = "Ativo";
        System.out.println("Alerta ID " + this.idAlerta + " foi ATIVADO!");
    }
    
    public void desativarAlerta() {
        this.statusAlerta = "Inativo";
        System.out.println("Alerta ID " + this.idAlerta + " foi DESATIVADO!");
    }
    
    public void dispararAlerta(double cotacaoAtual) {
        if ("Ativo".equals(this.statusAlerta)) {
            System.out.println("🚨 ALERTA DISPARADO! 🚨");
            System.out.println("Tipo: " + this.tipoAlerta);
            System.out.println("Valor Alvo: R$ " + this.valorAlvo);
            System.out.println("Cotação Atual: R$ " + cotacaoAtual);
            System.out.println("Criptoativo ID: " + this.oidCripto);
        }
    }
    
    public boolean verificarCondicao(double cotacaoAtual) {
        if ("Ativo".equals(this.statusAlerta)) {
            switch (this.tipoAlerta) {
                case "Acima de":
                    return cotacaoAtual > this.valorAlvo;
                case "Abaixo de":
                    return cotacaoAtual < this.valorAlvo;
                case "Igual a":
                    return Math.abs(cotacaoAtual - this.valorAlvo) < 0.01;
                default:
                    return false;
            }
        }
        return false;
    }
    
    public void exibirDetalhes() {
        System.out.println("=== DETALHES DO ALERTA ===");
        System.out.println("ID: " + this.idAlerta);
        System.out.println("Tipo: " + this.tipoAlerta);
        System.out.println("Valor Alvo: R$ " + this.valorAlvo);
        System.out.println("Status: " + this.statusAlerta);
        System.out.println("Criptoativo ID: " + this.oidCripto);
        System.out.println("Configurado por Usuário ID: " + this.oidUsuario);
    }
    
    // Getters e Setters
    public int getIdAlerta() {
        return idAlerta;
    }
    
    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }
    
    public int getOidCripto() {
        return oidCripto;
    }
    
    public void setOidCripto(int oidCripto) {
        this.oidCripto = oidCripto;
    }
    
    public int getOidUsuario() {
        return oidUsuario;
    }
    
    public void setOidUsuario(int oidUsuario) {
        this.oidUsuario = oidUsuario;
    }
    
    public String getStatusAlerta() {
        return statusAlerta;
    }
    
    public void setStatusAlerta(String statusAlerta) {
        this.statusAlerta = statusAlerta;
    }
    
    public double getValorAlvo() {
        return valorAlvo;
    }
    
    public void setValorAlvo(double valorAlvo) {
        this.valorAlvo = valorAlvo;
    }
    
    public String getTipoAlerta() {
        return tipoAlerta;
    }
    
    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }
    
    @Override
    public String toString() {
        return "Alerta{" +
                "idAlerta=" + idAlerta +
                ", oidCripto=" + oidCripto +
                ", oidUsuario=" + oidUsuario +
                ", statusAlerta='" + statusAlerta + '\'' +
                ", valorAlvo=" + valorAlvo +
                ", tipoAlerta='" + tipoAlerta + '\'' +
                '}';
    }
}
