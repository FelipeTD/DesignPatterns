 Projeto de exemplo para utilização de Iterator

## Iterator
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite percorrer elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc)

### Motivação do Pattern Iterator
- Encontrar uma maneira de acessar as coleções de forma eficiente, independente do tipo da coleção

### Estrutura
- A ‘interface’ iterator declara as operações necessárias para percorrer uma coleção
  - Buscar o próximo elemento
  - Pegar a posição atual
  - Recomeçar a iteração
- Iteradores concretos implementam algoritmos específicos para percorrer uma coleção
- A ‘interface’ coleção declara um ou mais métodos para obter os iteradores compatíveis com a coleção
- Coleções concretas retornam novas instâncias de uma classe iterator concreta em particular cada vez que um cliente pede por uma
- O cliente trabalha tanto com as coleções como os iteradores através das suas ‘interfaces’

### Prós e Contras
- Prós
  - Princípio de responsabilidade única
    - Pode limpar o código cliente e as coleções ao extrair os pesados algoritmos de travessia para classes separadas
  - Princípio aberto/fechado
    - Pode implementar novas coleções e iteradores e passá-los para o código existente sem quebrar coisa alguma
  - Pode iterar sobre a mesma coleção em pararelo porque cada objeto iterador contém o seu próprio estado de iteração
  - Pode atrasar uma iteração e continuá-la quando necessário
- Contras
  - Aplicar o padrão pode ser um preciosismo se a sua aplicação só trabalhar com coleções simples
  - Usar um iterador pode ser menos eficiente que percorrer elementos de algumas coleções especializadas diretamente

### Referências utilizadas:
- Iterator pattern explained - Brain Bytes (Java Brains)
  - https://www.youtube.com/watch?v=wqD4fOiGep4
- Iterator - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/iterator
