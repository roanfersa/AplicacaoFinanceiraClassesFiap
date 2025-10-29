package com.fiap.voltz;

/**
 * Classe principal do sistema financeiro VOLTZ - Missão Tio Patinhas
 * Demonstra o funcionamento de todas as classes desenvolvidas
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA FINANCEIRO VOLTZ - MISSÃO TIO PATINHAS ===");
        System.out.println("=== SPRINT 3 - IMPLEMENTAÇÃO DAS CLASSES JAVA ===\n");
        
        try {
            // Criando clientes
            System.out.println("1. CRIANDO CLIENTES...");
            Cliente cliente1 = new Cliente("123.456.789-00", "Patrícia Silva", 
                                        "Rua das Flores, 123", "(11) 99999-9999", "patricia@email.com");
            Cliente cliente2 = new Cliente("987.654.321-00", "Carlos Santos", 
                                        "Av. Principal, 456", "(11) 88888-8888", "carlos@email.com");
            
            cliente1.exibirDados();
            System.out.println();
            cliente2.exibirDados();
            System.out.println();
            
            // Criando contas correntes
            System.out.println("2. CRIANDO CONTAS CORRENTES...");
            ContaCorrente contaCorrente1 = new ContaCorrente("CC001", "Patrícia Silva", 1000.0, 500.0, 15.0);
            ContaCorrente contaCorrente2 = new ContaCorrente("CC002", "Carlos Santos", 2000.0, 1000.0, 20.0);
            
            System.out.println("Conta Corrente 1: " + contaCorrente1);
            System.out.println("Conta Corrente 2: " + contaCorrente2);
            System.out.println();
            
            // Criando contas poupança
            System.out.println("3. CRIANDO CONTAS POUPANÇA...");
            ContaPoupanca contaPoupanca1 = new ContaPoupanca("CP001", "Patrícia Silva", 5000.0, 0.5, 15);
            ContaPoupanca contaPoupanca2 = new ContaPoupanca("CP002", "Carlos Santos", 8000.0, 0.6, 20);
            
            System.out.println("Conta Poupança 1: " + contaPoupanca1);
            System.out.println("Conta Poupança 2: " + contaPoupanca2);
            System.out.println();
            
            // Testando operações de depósito
            System.out.println("4. TESTANDO OPERAÇÕES DE DEPÓSITO...");
            contaCorrente1.depositar(500.0);
            contaPoupanca1.depositar(1000.0);
            System.out.println();
            
            // Testando operações de saque
            System.out.println("5. TESTANDO OPERAÇÕES DE SAQUE...");
            contaCorrente1.sacar(200.0);
            contaPoupanca1.sacar(300.0);
            System.out.println();
            
            // Testando rendimento da poupança
            System.out.println("6. TESTANDO RENDIMENTO DA POUPANÇA...");
            contaPoupanca1.aplicarRendimentoMensal();
            contaPoupanca2.aplicarRendimentoMensal();
            System.out.println();
            
            // Testando cobrança de taxa de manutenção
            System.out.println("7. TESTANDO COBRANÇA DE TAXA DE MANUTENÇÃO...");
            contaCorrente1.cobrarTaxaManutencao();
            contaCorrente2.cobrarTaxaManutencao();
            System.out.println();
            
            // Criando transações
            System.out.println("8. CRIANDO TRANSAÇÕES...");
            Transacao deposito1 = new Transacao("TXN001", "Depósito", 1000.0, "2025-10-29", "CC001");
            Transacao saque1 = new Transacao("TXN002", "Saque", 500.0, "2025-10-29", "CC002");
            Transacao transferencia1 = new Transacao("TXN003", "Transferência", 300.0, "2025-10-29", "CC001", "CC002");
            
            deposito1.exibirDetalhes();
            System.out.println();
            saque1.exibirDetalhes();
            System.out.println();
            transferencia1.exibirDetalhes();
            System.out.println();
            
            // Processando transações
            System.out.println("9. PROCESSANDO TRANSAÇÕES...");
            deposito1.processarTransacao();
            saque1.processarTransacao();
            transferencia1.processarTransacao();
            System.out.println();
            
            // Atualizando dados do cliente
            System.out.println("10. ATUALIZANDO DADOS DO CLIENTE...");
            cliente1.atualizarDados("Rua Nova, 789", "(11) 77777-7777", "patricia.nova@email.com");
            cliente1.exibirDados();
            System.out.println();
            
            // Exibindo saldos finais
            System.out.println("11. SALDOS FINAIS DAS CONTAS...");
            System.out.println("Saldo Conta Corrente 1: R$ " + contaCorrente1.getSaldo());
            System.out.println("Saldo Conta Corrente 2: R$ " + contaCorrente2.getSaldo());
            System.out.println("Saldo Conta Poupança 1: R$ " + contaPoupanca1.getSaldo());
            System.out.println("Saldo Conta Poupança 2: R$ " + contaPoupanca2.getSaldo());
            System.out.println();
            
        } catch (Exception e) {
            System.err.println("Erro durante a execução: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
