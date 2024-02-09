# Projeto de exemplo para utilização de Mediator

## Mediator
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite reduzir as dependências caóticas entre objetos

### Motivação do Pattern Mediator
- Evitar o acoplamento de classes no sistema para elas poderem ser reaproveitadas
- Utilize o padrão quando é difícil mudar classes porque elas estão acopladas a várias outras classes

### Estrutura
- Os componentes são várias classes que contém alguma lógica de negócio
- A ‘interface’ do mediador declara métodos de comunicação com os componentes
  - Geralmente incluem apenas um método de notificação
- Os mediadores concretos encapsulam as relações entre vários componentes
- Componentes não devem estar cientes de outros componentes

### Prós e Contras
- Prós
  - Princípio de Responsabilidade Única
    - Pode extrair as comunicações entre vários componentes para um único lugar tornando-as de mais fácil entendimento e manutenção
    - Princípio aberto/fechado
      - Pode introduzir novos mediadores sem ter que mudar os próprios componentes
    - Pode reduzir o acoplamento entre os vários componentes de um programa
    - Pode reutilizar componentes individuais mais facilmente
- Contras
  - Com o tempo um mediador pode evoluir para um objeto deus

### Referências utilizadas:
- The Mediator Pattern Explained and Implemented in Java | Behavioral Design Patterns | Geekific
  - https://www.youtube.com/watch?v=35D5cBosD4c
- Mediator - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/mediator
