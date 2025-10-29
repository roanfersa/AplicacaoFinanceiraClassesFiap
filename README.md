# Sistema Financeiro VOLTZ - Missão Tio Patinhas

## Sprint 3 - Implementação Completa das Classes Java

Este projeto implementa um sistema financeiro completo baseado no diagrama de entidade-relacionamento fornecido para a atividade da Fase 3 do curso FIAP. O sistema gerencia usuários, empresas, contas, criptoativos, transações e todos os relacionamentos entre essas entidades.

## Estrutura do Projeto

### Classes Implementadas (12 classes conforme diagrama ER)

#### Entidades Centrais
1. **Usuario** - Representa usuários do sistema
   - Atributos: idUsuario, dataCadastroUsuario, tipoUsuario, senhaUsuario, emailUsuario, nomeUsuario
   - Métodos: alterarSenha(), atualizarDados(), exibirDados()

2. **Empresa** - Representa empresas no sistema
   - Atributos: idEmpresa, oidUsuarioResponsavel (FK), nomeEmpresa, cnpjEmpresa
   - Métodos: alterarResponsavel(), atualizarDados(), exibirDados()

3. **UsuarioEmpresa** - Tabela de junção N:N entre Usuario e Empresa
   - Atributos: oidUsuario (FK), oidEmpresa (FK), papelUsuario, permissaoUsuario
   - Métodos: alterarPapel(), alterarPermissao(), exibirRelacionamento()

#### Entidades Financeiras
4. **Conta** (Classe Abstrata) - Classe base para todas as contas
   - Atributos: idConta, oidEmpresa (FK), oidUsuario (FK), tipoConta, statusAtual, apelidoConta, nomeConta
   - Métodos abstratos: realizarOperacao(), calcularRendimento()

5. **ContaCorrente** (Herda de Conta) - Conta corrente com limite de crédito
   - Atributos específicos: limiteCredito, taxaManutencao
   - Métodos: cobrarTaxaManutencao(), exibirLimiteCredito()

6. **ContaPoupanca** (Herda de Conta) - Conta poupança com rendimento
   - Atributos específicos: taxaRendimento, diaAniversario
   - Métodos: aplicarRendimentoMensal(), exibirInformacoesRendimento()

#### Entidades de Criptoativos
7. **Criptoativo** - Representa criptomoedas no sistema
   - Atributos: idCripto, descricaoCripto, cotacaoAtual, simboloCripto, nomeCripto
   - Métodos: atualizarCotacao(), calcularValorInvestimento(), exibirInformacoes()

8. **Transacao** - Registra operações com criptoativos
   - Atributos: idTransacao, oidAprovacao (FK), oidCripto (FK), oidConta (FK), dataTransacao, valorTransacao, tipoTransacao
   - Métodos: processarTransacao(), cancelarTransacao(), exibirDetalhes()

9. **Aprovacao** - Controla aprovações de transações
   - Atributos: idAprovacao, oidUsuario (FK), statusAprovacao, dataAprovacao
   - Métodos: aprovar(), rejeitar(), pendente(), isAprovada()

#### Entidades de Suporte
10. **Relatorio** - Gera relatórios do sistema
    - Atributos: idRelatorio, oidUsuario (FK), dataGeracaoRelatorio, operiodoFim, operiodoInicio, nomeRelatorio
    - Métodos: gerarRelatorio(), exibirPeriodo(), alterarPeriodo()

11. **Autenticacao** - Gerencia autenticação de usuários
    - Atributos: idAutenticacao, oidUsuario (FK), ultimoLogin, statusAprovacao
    - Métodos: realizarLogin(), realizarLogout(), isAutenticado(), atualizarUltimoLogin()

12. **Alerta** - Configura alertas de preços de criptoativos
    - Atributos: idAlerta, oidCripto (FK), oidUsuario (FK), statusAlerta, valorAlvo, tipoAlerta
    - Métodos: ativarAlerta(), desativarAlerta(), dispararAlerta(), verificarCondicao()

13. **Main** - Classe principal com testes completos de todas as funcionalidades

## Relacionamentos Implementados

### Relacionamentos 1:N
- Usuario → Empresa (Responsável)
- Usuario → Relatorio (Gera)
- Usuario → Autenticacao (Autentica)
- Usuario → Conta (Possui)
- Usuario → Alerta (Configura)
- Usuario → Aprovacao (Realiza)
- Empresa → Conta (Pertence)
- Conta → Transacao (Realiza)
- Criptoativo → Alerta (Vinculado)
- Criptoativo → Transacao (Envolve)

### Relacionamentos N:N
- Usuario ↔ Empresa (via UsuarioEmpresa)

### Relacionamentos 1:1
- Transacao → Aprovacao (Exige)

## Características Implementadas

✅ **Herança**: ContaCorrente e ContaPoupanca herdam de Conta
✅ **Getters e Setters**: Todas as classes possuem getters e setters completos
✅ **Try-Catch**: Classe Main utiliza try-catch para tratamento de exceções
✅ **Arquivos Separados**: Cada classe em seu próprio arquivo (.java)
✅ **Encapsulamento**: Atributos privados com acesso controlado
✅ **Polimorfismo**: Métodos abstratos implementados nas classes filhas
✅ **Relacionamentos**: Todas as FK implementadas conforme diagrama ER
✅ **Funcionalidades Específicas**: Métodos únicos para cada tipo de entidade

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

- [x] Diagrama de classes implementado em Java (100% conforme ER)
- [x] Todas as 12 classes desenvolvidas baseadas no diagrama ER
- [x] Getters e Setters em todas as classes
- [x] Utilização de herança entre as classes
- [x] Classe Main com try-catch para testar as classes
- [x] Arquivos separados para cada classe
- [x] Todos os relacionamentos do diagrama implementados
- [x] Funcionalidades específicas de cada entidade implementadas

## Funcionalidades Demonstradas

- Criação e gerenciamento de usuários e empresas
- Relacionamentos N:N entre usuários e empresas
- Operações com criptoativos (Bitcoin, Ethereum, Cardano)
- Processamento de transações com aprovações
- Geração de relatórios financeiros
- Sistema de autenticação e login
- Alertas de preços de criptoativos
- Operações específicas de contas correntes e poupança
- Controle de aprovações e status de transações

Este projeto demonstra os conceitos de Programação Orientada a Objetos (POO) aplicados a um sistema financeiro completo com criptoativos, seguindo rigorosamente o diagrama de entidade-relacionamento fornecido.