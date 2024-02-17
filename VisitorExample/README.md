# Projeto de exemplo para utilização de Visitor

## Visitor
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite que separe algoritmos dos objetos nos quais eles operam

### Motivação do Pattern Visitor
- Evitar modificar classes que funcionam

### Estrutura
- A ‘interface’ visitante declara um conjunto de métodos visitantes que podem receber elementos concretos de uma estrutura de objetos como argumentos
- Cada visitante concreto implementa diversas versões do mesmo comportamento, feitos sob medida para diferentes elementos concretos de classes
- A ‘interface’ elemento declara um método para aceitar visitantes
- Cada elemento concreto deve implementar o método de aceitação
- O cliente geralmente representa uma coleção de outros objetos complexos

### Prós e Contras
- Prós
  - Princípio aberto/fechado
    - Pode introduzir um novo comportamento que pode funcionar com objetos de diferentes classes sem mudar essas classes
  - Princípio de responsabilidade única
    - Pode mover múltiplas versões do mesmo comportamento para dentro da mesma classe
  - Um objeto visitante pode acumular algumas informações úteis enquanto trabalha com vários objetos
- Contras
  - Precisar atualizar todos os visitantes a cada vez que a classe é adicionada ou removida da hierarquia de elementos
  - Visitantes podem não ter o seu acesso permitido para campos e métodos privados dos elementos que eles deveriam estar trabalhando

### Referências utilizadas:
- FINALLY, the Visitor Design Pattern makes Sense
  - https://www.youtube.com/watch?v=yyKrt7zSmv0
- Visitor - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/visitor
