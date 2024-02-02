# Projeto de exemplo para utilização de `Proxy`

## Proxy
- Faz parte do GoF
- Padrão de projeto Estrutural
- Permite que forneça um substituto ou um espaço reservado para outro objeto

### Motivação do Pattern `Proxy`
- Evitar que um processo seja executado sempre mesmo sem ser necessário

### Estrutura
- ‘Interface’ do serviço
- Serviço
  - É uma classe que fornece alguma lógica de negócio útil
- Proxy 
  - Tem um campo de referência que aponta para um objeto do serviço
- Cliente
  - Deve trabalhar tanto com os serviços e proxies através da mesma interface

### Prós e Contras
- Prós
  - Consegue utilizar o proxy sem alterar o cliente e implementação
  - Extremamente flexivel
  - Pode controlar o objeto do serviço sem os clientes ficarem sabendo
  - Gerir o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele
  - Trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível
  - Princípio aberto/fechado
    - Pode introduzir novos proxies sem mudar o serviço ou clientes
- Contras
  - O código pode ficar mais complicado visto que precisa introduzir uma série de novas classes
  - A resposta de um serviço pode ter atrasos

### Referências utilizadas
- Altere COMPORTAMENTOS de classes SEM MODIFICÁ-LAS com o padrão PROXY!
  - https://www.youtube.com/watch?v=bRcr6x8KvGo
- Proxy
  - https://refactoring.guru/pt-br/design-patterns/proxy

