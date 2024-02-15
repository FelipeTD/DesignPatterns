# Projeto de exemplo para utilização de Observer

## Observer
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite que defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles observam

### Motivação do Pattern Observer
- Evitar enviar notificações incorretas para clientes
- Criar um mecanismo de notificação conforme as preferências do cliente

### Estrutura
- A publicadora manda eventos de interesse para outros objetos
- Quando um novo evento acontece, a publicadora percorre a lista de assinantes e chama o método de notificação declarado na ‘interface’ do assinante em cada objeto assinante
- A ‘interface’ do assinante declara a ‘interface’ de notificação
- Assinantes concretos realizam algumas ações em resposta às notificações enviadas pela publicadora
- Assinantes precisam de alguma informação contextual para lidar com a atualização corretamente
- O cliente cria a publicadora e os objetos assinantes separadamente e então registra os assinantes para as atualizações da publicadora

### Prós e Contras
- Prós
  - Princípio aberto/fechado 
    - Pode introduzir novas classes assinantes sem ter que mudar o código da publicadora
  - Pode estabelecer relações entre objetos durante a execução
- Contras
  - Assinantes são notificados em ordem aleatória

### Referências utilizadas:
- Observer Design Pattern in Java
  - https://www.youtube.com/watch?v=98DiwRp-KZk
- Observer - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/observer
