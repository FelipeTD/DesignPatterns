# Projeto de exemplo para utilização de `Flyweight`

## Flyweight
- Faz parte do GoF
- Padrão de projeto Estrutural
- Permite colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre múltiplos objetos
  - Ao invés de manter todos os dados em cada objeto
- Traz uma grande economia de memória

### Motivação do Pattern `Flyweight`
- Consumo alto de RAM para executar programas

### Estrutura
- Flyweight é somente uma otimização
  - Utilize ele somente quando o seu ‘software’ tiver um problema de memória
- A classe flyweight contém a porção do estado do objeto original que pode ser compartilhada entre múltiplos objetos
- A classe contexto contém o estado extrínseco, único para todos os objetos originais
- Geralmente, o comportamento do objeto original permanece na classe flyweight
- O cliente calcula ou armazena o estado extrínseco dos flyweights
- A fábrica flyweight gerencia um conjunto de flyweights existentes

### Prós e Contras
- Prós
  - Pode economizar muita RAM, desde que o seu programa tenha muitos objetos similares
- Contras
  - Pode estar a trocar RAM por ciclos de CPU 
    - Quando parte dos dados de contexto precisa ser recalculado cada vez que alguém chama um método flyweight
  - O código fica complicado
    - Novos membros de equipe sempre se perguntarão porque o estado de uma entidade foi separado de tal forma

### Referências utilizadas
- Flyweight - O Design Pattern do GOF que salva a pele na infra
  - https://www.youtube.com/watch?v=2Z17zbLZa_M
- Flyweight
  - https://refactoring.guru/pt-br/design-patterns/flyweight

