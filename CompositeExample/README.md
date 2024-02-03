# Projeto de exemplo para utilização de `Composite`

## Composite
- Faz parte do GoF
- Padrão de projeto Estrutural
- Conhecido como árvore de objetos, `object tree`
- Permite que componha objetos em estruturas de árvores e então trabalhe com essas estruturas como se elas fossem objetos individuais

### Motivação do Pattern `Composite`
- Faz sentido apenas quando o modelo central da sua aplicação pode ser representada como uma árvore

### Estrutura
- A ‘interface’ componente descreve operações que são comuns tanto para elementos simples como para elementos complexos
- A folha é um elemento básico de uma árvore que não tem subelementos
- O contêiner (ou composite) é o elemento que tem subelementos: folhas ou outros contêiners
- O cliente trabalha com todos os elementos através da ‘interface’ componente

### Prós e Contras
- Prós
  - Pode trabalhar com estruturas de árvore complexas mais convenientemente
    - Utilize o polimorfismo e a recursão a seu favor
  - Princípio aberto/fechado
    - Pode introduzir novos elementos na aplicação sem quebrar o código existente 
      - Que funciona como a árvore de objetos
- Contras
  - Pode ser difícil providenciar uma ‘interface’ comum para classes cuja funcionalidade difere muito
    - Em certos cenários, seria necessário generalizar muito a ‘interface’ componente, fazendo dela uma ‘interface’ de difícil compreensão

### Referências utilizadas
- Composite, o design pattern para árvores
  - https://www.youtube.com/watch?v=f4jLEVxP1_U
- Composite
  - https://refactoring.guru/pt-br/design-patterns/composite

