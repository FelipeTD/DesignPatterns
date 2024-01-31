# Design Patterns

- Projeto com explicação sobre vários `Design Patterns` com exemplos
- O que são Patterns?
  - São padrões
  - Foi por Kent Beck & Ward Cunningham
  - 1987 - Conferência de OOPSLA (Object-Oriented Programming, Systems, Languages & Applications)
  - Propuseram os primeiros padrões na área de computação
- GoF (Gang of Four)
  - 1994 – 4 Programadores da IBM
  - Erich Gama, Richard Helm, Ralph Johnson e John Vlissides
  - Observaram 23 problemas comuns e as suas soluções
  - Livro: Design Patterns: Elements of Reusable Object-Oriented Software
- Elementos de um pattern
  - Nome
  - Problema / Motivação
  - Solução / Aplicabilidade
  - Consequências
- Exemplo de Pattern
  - Adapter
    - Problema / Motivação
      - Não reaproveitamento de uma classe, pois a sua ‘interface’ não corresponde com a ‘interface’ específica de um domínio
    - Aplicabilidade
      - Se deseja utilizar uma classe existente, porém a sua ‘interface’ não corresponde à ‘interface’ que se necessita
    - Consequências:
      - Um adaptador de classe não funcionará quando quisermos adaptar uma classe e todas as suas subclasses
- Outros tipos de padrões:
  - Segurança
  - Concorrência
  - SQL
  - Interface do Usuário
  - Aplicações distribuídas
  - Microserviços
- Padrões de microserviços
  - microservices.io
- Por que utilizar Padrões de Projetos?
  - Linguagem global compartilhada pelos seus pares
  - Definições iniciais de solução
  - Produtividade
  - Não reinventa a roda
  - Facilita a legibilidade de um código / solução
  - Design, Design, Design
- Por onde começar?
  - Padrões GoF
    - Criacionais
    - Estruturais
    - Comportamentais

## Criacionais
- Singleton
  - Garante a criação de uma única instância de uma classe através de toda a aplicação, mantendo um ponto global de acesso ao seu objeto
- Builder
  - Permite construir objetos complexos passo a passo
- Factory Method
  - Resolve o problema de criar objetos de produtos sem especificar suas classes concretas
- Abstract Factory
  - Permite que crie família de objetos com uma única ‘interface’ sem que a classe concreta seja especificada
- Prototype
  - Permite copiar objetos existentes sem fazer o seu código ficar dependente das suas classes

## Estruturais
- Adapter
  - Permitir que classes que não possuem uma ‘interface’ comum trabalhem de forma conjunta
- Bridge
  - Divide a lógica de negócio ou uma enorme classe em hierarquias de classe separadas que podem ser desenvolvidas independentemente

## Comportamentais
- Strategy
  - Quando precisa encapsular algoritmos similares para tomar alguma decisão
