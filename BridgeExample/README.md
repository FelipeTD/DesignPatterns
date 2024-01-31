# Projeto de exemplo para utilização de `Bridge`

## Bridge
- Faz parte do GoF
- Padrão de projeto Estrutural
- Permite divisão de uma classe grande ou um conjunto de classes em duas hierarquias separadas
  - abstração e implementação que podem ser desenvolvidas independentemente uma das outras

### Motivação do Pattern `Bridge`
- Ao criar uma classe será necessário criar duas subclasses para atender ao padrão
  - Isso torna insustentável de manter
  - O padrão veio para corrigir esse problema

### Estrutura
- A abstração fornece a lógica de 'controle' de alto nível
  - Ela depende do objeto de implementação para fazer o verdadeiro trabalho de baixo nível
- A implementação declara a ‘interface’ comum para todas as implementações concretas
- Implementações concretas contém código plataforma especificos
- Abstrações refinadas fornecem variantes para controle da lógica
  - Como o seu superior, trabalham com diferentes implementações através da ‘interface’ geral de implementação
- O cliente está apenas interessado em trabalhar com a abstração
  - É trabalho do cliente ligar o objeto de abstração com um dos objetos de implementação

### Prós e Contras
- Prós
  - Pode criar classes e aplicações independentes de plataforma
  - O código cliente trabalha com abstrações em alto nível
    - Ele não fica exposto a detalhes de plataforma
  - Princípio aberto/fechado
    - Pode introduzir novas abstrações e implementações independentemente uma das outras
  - Princípio de responsabilidade única
    - Pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação
- Contras
  - Pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa

### Referências utilizadas
- Bridge design pattern in Java
  - https://www.youtube.com/watch?v=pkY9kX5ly0w
- Bridge
  - https://refactoring.guru/pt-br/design-patterns/bridge

