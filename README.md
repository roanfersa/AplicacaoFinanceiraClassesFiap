# Sistema Financeiro VOLTZ - Missão Tio Patinhas

## Sprint 3 - Implementação das Classes Java

Este projeto implementa um sistema financeiro completo baseado no diagrama de classes fornecido para a atividade da Fase 3 do curso FIAP.

## Estrutura do Projeto

### Classes Implementadas

1. **Conta (Classe Abstrata)**
   - Classe base para todas as contas bancárias
   - Atributos: numeroConta, titular, saldo, tipoConta
   - Métodos abstratos: depositar(), sacar(), calcularRendimento()

2. **ContaCorrente (Herda de Conta)**
   - Implementa operações específicas de conta corrente
   - Atributos específicos: limiteCredito, taxaManutencao
   - Métodos: cobrarTaxaManutencao()

3. **ContaPoupanca (Herda de Conta)**
   - Implementa operações específicas de conta poupança
   - Atributos específicos: taxaRendimento, diaAniversario
   - Métodos: aplicarRendimentoMensal()

4. **Cliente**
   - Representa um cliente do banco
   - Atributos: cpf, nome, endereco, telefone, email
   - Métodos: atualizarDados(), exibirDados()

5. **Transacao**
   - Registra operações bancárias
   - Atributos: idTransacao, tipoTransacao, valor, dataTransacao, etc.
   - Métodos: processarTransacao(), cancelarTransacao(), exibirDetalhes()

6. **Main**
   - Classe principal com método main()
   - Demonstra o funcionamento de todas as classes
   - Utiliza try-catch para tratamento de exceções

## Características Implementadas

✅ **Herança**: ContaCorrente e ContaPoupanca herdam de Conta
✅ **Getters e Setters**: Todas as classes possuem getters e setters completos
✅ **Try-Catch**: Classe Main utiliza try-catch para tratamento de exceções
✅ **Arquivos Separados**: Cada classe em seu próprio arquivo
✅ **Encapsulamento**: Atributos privados com acesso controlado
✅ **Polimorfismo**: Métodos abstratos implementados nas classes filhas

## Como Executar

1. Compile todos os arquivos Java:
```bash
javac -d . *.java
```

2. Execute a classe Main:
```bash
java com.fiap.voltz.Main
```

## Requisitos Atendidos

- [x] Diagrama de classes implementado em Java
- [x] Todas as classes desenvolvidas baseadas no diagrama
- [x] Getters e Setters em todas as classes
- [x] Utilização de herança entre as classes
- [x] Classe Main com try-catch para testar as classes
- [x] Arquivos separados para cada classe
- [x] Funcionalidades específicas de cada tipo de conta implementadas

## Funcionalidades Demonstradas

- Criação de clientes e contas
- Operações de depósito e saque
- Cálculo de rendimento da poupança
- Cobrança de taxa de manutenção
- Processamento de transações
- Atualização de dados do cliente
- Exibição de informações detalhadas

Este projeto demonstra os conceitos de Programação Orientada a Objetos (POO) aplicados a um sistema financeiro real.
# AplicacaoFinanceiraClassesFiap
