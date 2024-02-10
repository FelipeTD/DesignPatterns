# Projeto de exemplo para utilização de Memento

## Memento
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite que salve e restaure o estado anterior de um objeto sem revelar os detalhes da sua implementação

### Motivação do Pattern Memento
- Encontrar uma maneira segura de conseguir guardar estados de um objeto na aplicação

### Estrutura

#### Classes aninhadas
- A classe originadora pode produzir retratos do seu próprio estado, bem como restaurar o seu estado de retratos quando necessário
- O memento é um objeto de valor que age como um retrato do estado da originadora
- A cuidadora sabe não só quando e por que capturar o estado da originadora, mas também quando o estado deve ser restaurado
- Nessa implementação, a classe memento está aninhada na originadora

#### Interface intermediária
- Na ausência de classes aninhadas
  - Pode restringir o acesso aos campos do memento
  - Estabelece uma convenção para que cuidadoras possam trabalhar com um memento
  - Utiliza uma ‘interface’ intermediária explicitamente declarada
  - Essa interface, só declararia os métodos relacionados aos metadados do memento
- As originadoras podem trabalhar com um objeto memento diretamente
  - Realiza o acesso a campos e métodos declarados na classe memento

#### Encapsulamento ainda mais restrito
- Permite ter múltiplos tipos de originadoras e mementos
- Cuidadoras são agora explicitamente restritas de mudar o estado armazenado nos mementos
- Cada memento se torna ligado à originadora que o produziu

### Prós e Contras
- Prós
  - Pode produzir retratos do estado de um objeto sem violar o seu encapsulamento
  - Pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora
- Contras
  - A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência
  - Cuidadoras devem acompanhar o ciclo de vida da originadora para conseguirem destruir mementos obsoletos
  - A maioria das linguagens de programação dinâmicas como PHP, Python e Javascript não conseguem garantir que o estado no memento permaneça intacto

### Referências utilizadas:
- Padrão de Projeto Memento: mais conhecido como `design pattern` do desfazimento
  - https://www.youtube.com/watch?v=fB8VMU7CLbo
- Memento - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/memento
