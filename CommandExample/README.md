# Projeto de exemplo para utilização de Command

## Command
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Transforma um pedido num objeto independente que contém toda a informação sobre o pedido
- Converte solicitações ou operações simples em objetos

### Motivação do Pattern Command
- Quando existe um acoplamento grande a uma única ‘interface’

### Estrutura
- A classe Remetente é responsável por iniciar os pedidos
- A ‘interface’ comando geralmente declara apenas um único método para executar o comando
- Comandos concretos implementam vários pedidos
- A classe destinatária contém a lógica do negócio
- O cliente cria e configura objetos comando concretos

### Prós e Contras
- Prós
  - Princípio de responsabilidade única
    - Pode desacoplar classes que invocam operações de classes que fazem essas operações
  - Princípio aberto/fechado
    - Pode introduzir novos comandos na aplicação sem quebrar o código cliente existente
  - Pode implementar desfazer/refazer
  - Pode implementar execução adiada de operações
  - Pode montar um conjunto de comandos simples em um complexo
- Contras
  - O código pode ficar mais complicado visto que introduzimos uma nova camada entre remetentes e destinatários

### Referências utilizadas:
- Arquitetando com Command Design Pattern (GOF)
  - https://www.youtube.com/watch?v=U-xbZJMsBnU
- Command - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/command
