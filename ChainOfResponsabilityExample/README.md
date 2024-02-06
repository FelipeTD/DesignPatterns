# Projeto de exemplo para utilização de `Chain of Responsability`

## ChainOfResponsability
- Faz parte do GoF
- Padrão de projeto Comportamental
- Permite que passe pedidos por uma corrente de handlers

### Motivação do Pattern `ChainOfResponsability`
- Existe uma lista de processo que precisam ser executados para dar uma resposta 
  - Caso algum processo falhe consegue retornar sem executar os outros processos restantes

### Estrutura
- O handler declara a interface comum a todos os handlers concretos
- O handler base é uma classe opcional onde pode colocar o código padrão que é comum a todas as classes handler
- Handlers concretos contém o código real para processar pedidos
- O cliente pode compor correntes apenas uma vez ou compô-las dinamicamente, dependendo da lógica da aplicação

### Prós e Contras
- Prós
  - Aplica o princípio da responsabilidade única (SRP)
  - Aplica o princípio do aberto fechado (OCP)
  - Permite que altere a cadeia de objetos e a ordem das chamadas facilmente
- Contras
  - É comum uma requisição passar por toda a cadeia e não ser tratada

### Referências utilizadas
- Chain Of Responsibility Teoria - Padrões de Projeto - Parte 37/45
  - https://www.youtube.com/watch?v=AdzLq9FVTXs
- Chain of Responsibility
  - https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility

