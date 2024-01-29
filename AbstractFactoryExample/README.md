# Projeto de exemplo para utilização de Abstract Factory

## Abstract Factory
- Faz parte do GoF
- Padrão de Projeto Criacional
- Permite que crie família de objetos com uma única ‘interface’ sem que a classe concreta seja especificada

### Motivação do Pattern Abstract Factory
- Centralizar familias de objetos com relação entre si

### Conceitos básicos
- Declare uma fábrica abstrata
- Declare objetos abstratos
- Crie a implementação de cada objeto
- O cliente vai chamar o objeto que precisa conforme a fábrica que ele utilizou

### Estrutura
- Produtos abstratos declaram ‘interfaces’ para um conjunto de produtos distintos, mas relacionados que fazem parte de uma familia de produtos
- Produtos concretos são várias implementações de produtos abstratos, agrupados por variantes
- A ‘interface’ fábrica abstrata declara um conjunto de métodos para criação de cada um dos produtos abstratos
- Fábricas concretas implementam métodos de criação fábrica abstratos
- Embora fábricas concretas instanciam produtos concretos, assinaturas dos seus métodos de criação devem retornar produtos abstratos correspondentes

### Prós e Contras
- Prós
  - Segue os conceitos do `SOLID`
  - Pode ter certeza que os produtos que obtém de uma fábrica são compatíveis entre si
  - Evita um vínculo forte entre produtos concretos e o código cliente
  - Princípio de responsabilidade única
    - Pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção
  - Princípio aberto/fechado
    - Pode introduzir novas variantes de produtos sem quebra o código cliente existente
- Contras
  - Muita complexidade

### Referências utilizadas:
- Entenda DEFINITIVAMENTE o padrão Abstract Factory do GOF
  - https://www.youtube.com/watch?v=_EcV-BcJ2-E
- Abstract Factory - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/abstract-factory
