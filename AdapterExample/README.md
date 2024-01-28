# Projeto de exemplo para utilização de Adapter

## Adapter
- Faz parte do GoF
- Padrão de Projeto Estrutural

### Motivação do pattern Adapter
- Converte a ‘interface’ de uma classe em outra esperada pelo cliente
- Permitir que classes que não possuem uma ‘interface’ comum trabalhem de forma conjunta
- Deixar a possibilidade de futuras implementações para o cliente provendo uma ‘interface’ pública para os seus adaptadores

### Conceitos básicos
- Cliente 
  - é uma classe que contém a lógica de negócio do programa existente.
- Interface do Cliente
  - descreve um protocolo que outras classes devem seguir para conseguir colaborar com o código cliente.
- Adaptador 
  - é uma classe que faz a adaptação. 
  - Ela consegue trabalhar tanto com o cliente quanto com o serviço.
  - Ela implementa a interface do cliente enquanto encobre o objeto do serviço.
- Adaptee ou Serviço 
  - classe que será adaptada.
  - é alguma classe útil (geralmente de terceiros ou código legado).
  - o cliente não pode usar essa classe diretamente porque ela tem uma ‘interface’ incompatível.

### Exemplo
- Client  
  - Target <interface> (insert, update, delete) 
    - connections.MySQLAdapter (insert, update, delete)
      - connections.MySQLCommands(insertMySQL, updateMySQL, deleteMySQL)

### Prós e contras
- Prós
  - Princípio de responsabilidade única. 
    - Pode separar a conversão de ‘interface’ ou de dados da lógica primária do negócio do programa.
  - Princípio aberto/fechado.
    - Pode introduzir novos adaptadores no programa sem quebrar o código cliente existente desde que eles trabalhem com os adaptadores através da ‘interface’ cliente.
- Contras
  - A complexidade geral do código aumenta.
  - Precisa introduzir um conjunto de novas ‘interfaces’ e classes.
  - É mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.

### Referências utilizadas:
- Textos do README.md e exemplo de código que está em connections foram retirados do vídeo: 
  - Design Pattern Adapter na Prática 
    - Disponível em https://www.youtube.com/watch?v=5AiiHFizQWY&list=PL5aY_NrL1rjtP1GVk1lxifkeob1F09L4p&index=3


- Prós e contras do README e exemplo de adaptação de pino quadrado em buraco redondo foram retiradas da página Refactoring Guru 
  - Texto do README disponível em https://refactoring.guru/pt-br/design-patterns/adapter
  - Exemplo disponível em https://refactoring.guru/pt-br/design-patterns/adapter/java/example


