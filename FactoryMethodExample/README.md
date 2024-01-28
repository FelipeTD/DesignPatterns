# Projeto de exemplo para utilização de Factory Method

## Factory Method
- Faz parte do GoF
- Padrão de Projeto Criacional
- Também chamado Virtual Constructor

### Motivação do pattern Factory Method
- Abstrair o código para conseguir reutilizar ele para criar objetos diferentes sem ter que alterar o código padrão

### Conceitos básicos
- Parar de utilizar o comando `new`
- Deixar a responsabilidade de criar objetos no método (fábrica) geralmente chamado produto

### Exemplo
- Formato simples
  - `Calendar.getInstance()`
  - `NumberFormat.getInstance()`
  - `Stream.of(1, 2, 3, 4)`
  - `List.of(1, 2, 3, 4)`
  - `Integer.valueOf("1234")`

### Estrutura
- O produto declara a ‘interface’, comum a todos os objetos que podem ser produzidos pelo criador e subclasses
- Produtos concretos são implementações diferentes da ‘interface’ do produto
- A classe criador declara o método fábrica que retorna novos objetos produto.
  - É importante que o retorno desse método corresponda à ‘interface’ do produto
- Criadores concretos sobrescrevem o método fábrica base para retornar um tipo diferente de produto

### Prós e contras
- Prós
  - Permite trabalhar com hierarquia paralela
  - Evita acoplamentos firmes entre o criador e os produtos concretos
  - Princípio de Responsabilidade Única
    - Pode mover o código de criação do produto para um único local do programa
    - Facilita a manutenção do código
  - Princípio Aberto/Fechado
    - Pode introduzir novos produtos no programa sem quebrar o código do cliente existente
- Contras
  - Deixa o código mais complexo. Não aplique para soluções mais simples

### Referências utilizadas:
- Torne FLEXÍVEL a CRIAÇÃO de objetos com FACTORY METHODS!
  - https://www.youtube.com/watch?v=-e9bFrcxG9E
- Factory Method - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/factory-method


