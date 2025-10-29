package com.fiap.voltz;

/**
 * Classe principal do sistema financeiro VOLTZ - Missão Tio Patinhas
 * Demonstra o funcionamento de todas as classes desenvolvidas conforme o diagrama ER
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA FINANCEIRO VOLTZ - MISSÃO TIO PATINHAS ===");
        System.out.println("=== SPRINT 3 - IMPLEMENTAÇÃO COMPLETA DAS CLASSES JAVA ===\n");
        
        try {
            // 1. CRIANDO USUÁRIOS
            System.out.println("1. CRIANDO USUÁRIOS...");
            Usuario usuario1 = new Usuario(1, "2025-01-15", "Admin", "senha123", "admin@voltz.com", "Administrador Sistema");
            Usuario usuario2 = new Usuario(2, "2025-02-20", "Cliente", "senha456", "cliente@voltz.com", "João Silva");
            Usuario usuario3 = new Usuario(3, "2025-03-10", "Gerente", "senha789", "gerente@voltz.com", "Maria Santos");
            
            usuario1.exibirDados();
            System.out.println();
            usuario2.exibirDados();
            System.out.println();
            
            // 2. CRIANDO EMPRESAS
            System.out.println("2. CRIANDO EMPRESAS...");
            Empresa empresa1 = new Empresa(1, 1, "Voltz Finance", "12.345.678/0001-90");
            Empresa empresa2 = new Empresa(2, 2, "Crypto Solutions", "98.765.432/0001-10");
            
            empresa1.exibirDados();
            System.out.println();
            empresa2.exibirDados();
            System.out.println();
            
            // 3. CRIANDO RELACIONAMENTOS USUÁRIO-EMPRESA
            System.out.println("3. CRIANDO RELACIONAMENTOS USUÁRIO-EMPRESA...");
            UsuarioEmpresa rel1 = new UsuarioEmpresa(1, 1, "Administrador", "Total");
            UsuarioEmpresa rel2 = new UsuarioEmpresa(2, 1, "Cliente", "Limitada");
            UsuarioEmpresa rel3 = new UsuarioEmpresa(3, 2, "Gerente", "Alta");
            
            rel1.exibirRelacionamento();
            System.out.println();
            rel2.exibirRelacionamento();
            System.out.println();
            
            // 4. CRIANDO CRIPTOATIVOS
            System.out.println("4. CRIANDO CRIPTOATIVOS...");
            Criptoativo bitcoin = new Criptoativo(1, "Moeda digital descentralizada", 250000.0, "BTC", "Bitcoin");
            Criptoativo ethereum = new Criptoativo(2, "Plataforma de contratos inteligentes", 15000.0, "ETH", "Ethereum");
            Criptoativo cardano = new Criptoativo(3, "Blockchain sustentável", 2.5, "ADA", "Cardano");
            
            bitcoin.exibirInformacoes();
            System.out.println();
            ethereum.exibirInformacoes();
            System.out.println();
            
            // 5. CRIANDO CONTAS
            System.out.println("5. CRIANDO CONTAS...");
            ContaCorrente contaCorrente1 = new ContaCorrente(1, 1, 1, "Corrente", "Ativa", "CC-Admin", "Conta Corrente Admin", 10000.0, 25.0);
            ContaPoupanca contaPoupanca1 = new ContaPoupanca(2, 1, 2, "Poupança", "Ativa", "CP-João", "Conta Poupança João", 0.5, 15);
            ContaCorrente contaCorrente2 = new ContaCorrente(3, 2, 3, "Corrente", "Ativa", "CC-Maria", "Conta Corrente Maria", 15000.0, 30.0);
            
            contaCorrente1.exibirDados();
            System.out.println();
            contaPoupanca1.exibirDados();
            System.out.println();
            
            // 6. CRIANDO APROVAÇÕES
            System.out.println("6. CRIANDO APROVAÇÕES...");
            Aprovacao aprovacao1 = new Aprovacao(1, 1, "Pendente", "2025-10-29");
            Aprovacao aprovacao2 = new Aprovacao(2, 2, "Aprovada", "2025-10-29");
            
            aprovacao1.exibirStatus();
            System.out.println();
            aprovacao2.exibirStatus();
            System.out.println();
            
            // 7. CRIANDO TRANSAÇÕES
            System.out.println("7. CRIANDO TRANSAÇÕES...");
            Transacao transacao1 = new Transacao(1, 1, 1, 1, "2025-10-29", 1000.0, "Compra");
            Transacao transacao2 = new Transacao(2, 2, 2, 2, "2025-10-29", 500.0, "Venda");
            Transacao transacao3 = new Transacao(3, 1, 3, 3, "2025-10-29", 200.0, "Transferência");
            
            transacao1.exibirDetalhes();
            System.out.println();
            transacao2.exibirDetalhes();
            System.out.println();
            
            // 8. CRIANDO RELATÓRIOS
            System.out.println("8. CRIANDO RELATÓRIOS...");
            Relatorio relatorio1 = new Relatorio(1, 1, "2025-10-29", "2025-10-31", "2025-10-01", "Relatório Mensal");
            Relatorio relatorio2 = new Relatorio(2, 2, "2025-10-29", "2025-10-29", "2025-10-29", "Relatório Diário");
            
            relatorio1.gerarRelatorio();
            System.out.println();
            relatorio2.gerarRelatorio();
            System.out.println();
            
            // 9. CRIANDO AUTENTICAÇÕES
            System.out.println("9. CRIANDO AUTENTICAÇÕES...");
            Autenticacao auth1 = new Autenticacao(1, 1, "2025-10-29T10:00:00", "Autenticado");
            Autenticacao auth2 = new Autenticacao(2, 2, "2025-10-29T11:30:00", "Autenticado");
            
            auth1.exibirStatusAutenticacao();
            System.out.println();
            auth2.exibirStatusAutenticacao();
            System.out.println();
            
            // 10. CRIANDO ALERTAS
            System.out.println("10. CRIANDO ALERTAS...");
            Alerta alerta1 = new Alerta(1, 1, 1, "Ativo", 300000.0, "Acima de");
            Alerta alerta2 = new Alerta(2, 2, 2, "Ativo", 10000.0, "Abaixo de");
            
            alerta1.exibirDetalhes();
            System.out.println();
            alerta2.exibirDetalhes();
            System.out.println();
            
            // 11. TESTANDO OPERAÇÕES ESPECÍFICAS
            System.out.println("11. TESTANDO OPERAÇÕES ESPECÍFICAS...");
            
            // Testando aprovações
            aprovacao1.aprovar();
            aprovacao2.rejeitar();
            System.out.println();
            
            // Testando transações
            transacao1.processarTransacao();
            transacao2.cancelarTransacao();
            System.out.println();
            
            // Testando criptoativos
            bitcoin.atualizarCotacao(255000.0);
            ethereum.calcularValorInvestimento(10.0);
            System.out.println();
            
            // Testando alertas
            alerta1.dispararAlerta(bitcoin.getCotacaoAtual());
            alerta2.verificarCondicao(ethereum.getCotacaoAtual());
            System.out.println();
            
            // Testando contas
            contaCorrente1.cobrarTaxaManutencao();
            contaPoupanca1.aplicarRendimentoMensal();
            System.out.println();
            
            // Testando autenticação
            auth1.realizarLogout();
            auth2.realizarLogin();
            System.out.println();
            
            // 12. RESUMO FINAL
            System.out.println("12. RESUMO FINAL DO SISTEMA...");
            System.out.println("✅ Usuários criados: 3");
            System.out.println("✅ Empresas criadas: 2");
            System.out.println("✅ Relacionamentos Usuário-Empresa: 3");
            System.out.println("✅ Criptoativos cadastrados: 3");
            System.out.println("✅ Contas criadas: 3");
            System.out.println("✅ Aprovações processadas: 2");
            System.out.println("✅ Transações realizadas: 3");
            System.out.println("✅ Relatórios gerados: 2");
            System.out.println("✅ Autenticações configuradas: 2");
            System.out.println("✅ Alertas configurados: 2");
            System.out.println();
            
        } catch (Exception e) {
            System.err.println("Erro durante a execução: " + e.getMessage());
            e.printStackTrace();
        }
    }
}