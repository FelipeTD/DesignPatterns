# Projeto de exemplo para utilização de `Facade`

## Facade
- Faz parte do GoF
- Padrão de projeto Estrutural
- Fornece uma ‘interface’ simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes

### Motivação do Pattern `Facade`
- Evitar o acoplamento aos detalhes de implementação das classes de terceiros ou códigos complexos
- É útil quando precisamos integrar a nossa aplicação com uma biblioteca sofisticada, mas usamos somente alguns métodos

### Estrutura
- A fachada fornece um acesso conveniente para uma parte particular da funcionalidade do subsistema
- Uma fachada adicional pode ser criada para previnir a poluição de uma única fachada com funcionalidades não relevantes
  - Isso evita que a fachada principal se torne uma estrutura complexa
  - Fachadas adicionais podem ser usadas tanto por clientes como por outras fachadas
- O Subsistema complexo consiste em dúzias de objetos variados
  - As classes do subsistema não estão cientes da existência da fachada
  - Elas operam no sistema e trabalham entre si diretamente
- O cliente usa a fachada ao invés de chamar os objetos do subsistema diretamente

### Prós e Contras
- Prós
  - Pode isolar o seu código da complexidade de um subsistema
- Contras
  - Uma fachada pode se tornar um objeto deus acoplado a todas as classes de uma aplicação

### Referências utilizadas
- Façade o `design` pattern mais famoso do GOF
  - https://www.youtube.com/watch?v=FJlynE_z5R4
- Facade
  - https://refactoring.guru/pt-br/design-patterns/facade

