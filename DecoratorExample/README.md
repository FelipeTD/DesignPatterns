# Projeto de exemplo para utilização de `Decorator`

## Decorator
- Faz parte do GoF
- Padrão de projeto Estrutural
- Adicionar funcionalidade a uma classe sem herança
- Permite que você acople novos comportamentos para objetos ao colocá-los em invólucros de objetos que contém os comportamentos

### Motivação do Pattern `Decorator`
- Em alguns casos não compensam criar subclasses, pois deixaria o código inflado

### Estrutura
- O componente declara a ‘interface’ comum tanto para os envoltórios como para os objetos envolvidos
- O componente concreto é uma classe de objetos sendo envolvidos
  - Ela define o comportamento básico, que pode ser alterado por decoradores
- A classe decorador base tem um campo para referenciar um objeto envolvido
- Os decoradores concretos definem os comportamentos adicionais que podem ser adicionados aos componentes dinamicamente
- O cliente pode envolver componentes em múltiplas camadas de decoradores

### Prós e Contras
- Prós
  - Não precisa usar herança
  - Composição pode ser encadeada
  - Pode estender o comportamento de um objeto sem fazer uma nova subclasse
  - Pode adicionar ou remover responsabilidades de um objeto no momento da execução
  - Pode combinar diversos comportamentos ao envolver o objeto com múltiplos decoradores
  - Princípio de responsabilidade única
    - Pode dividir uma classe monolítica que implementa muitas variantes de um comportamento em diversas classes menores 
- Contras
  - É difícil remover um invólucro de uma pilha de invólucros
  - É difícil implementar um decorador de maneira que o seu comportamento não dependa da ordem da pilha de decoradores
  - A configuração inicial do código de camadas pode ficar bastante feia

### Referências utilizadas
- ACRESCENTE funcionalidades com DECORATOR ao invés de usar HERANÇA!
  - https://www.youtube.com/watch?v=gpfZAYxBKjc
- Decorator
  - https://refactoring.guru/pt-br/design-patterns/decorator

