# Projeto de exemplo para utilização de `Template Method`

## Template Method
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Define o esqueleto de um algoritmo numa operação, postergando a definição de alguns passos para subclasses
  - Permite que as subclasses redefinam certos passos de um algoritmo sem mudar a sua estrutura

### Motivação do Pattern `Template Method`
- Retirar duplicação de código no sistema
- Eliminar condicionais de classes parecidas

### Estrutura
- A classe abstrata declara métodos que agem como etapas de um algoritmo
  - Bem como o próprio método padrão que chama esses métodos numa ordem específica
  - Os passos podem ser declarados como abstratos ou ter alguma implementação padrão
- As classes concretas podem sobrescrever todas as etapas, mas não o próprio método padrão

### Prós e Contras
- Prós
  - Evita duplicação de código
  - Permite fácil alteração de algoritmos
  - Aplica o OCP e SRP
  - Pode deixar clientes sobrescrever apenas certas partes de um algoritmo grande
    - Isso a torna menos afetados por mudanças que acontecem por outras partes do algoritmo
- Contras
  - Pode violar o LSP ao alterar o comportamento de métodos nas subclasses
  - Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo
  - Implementações do padrão tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem

### Referências utilizadas:
- `Template Method` Teoria — Padrões de Projeto — Parte 39/45
  - https://www.youtube.com/watch?v=-nSOKE4f2gA
- `Template Method` - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/template-method
