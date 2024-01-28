# Projeto de exemplo para utilização de Builder

## Builder
- Faz parte do GoF
- Padrão de projeto Criacional
- Permite construir objetos complexos passo a passo

### Motivação do Pattern Builder
- Quando tem a necessidade de construir objetos complexos várias vezes
- Um exemplo é a construção de uma casa
  - Casa normal
  - Casa com garagem
  - Casa com piscina
  - Casa com jardim
  - Casa com estátuas
- A lógica é construir o objeto em várias etapas e utilizar somente as etapas que precisa
- Classe Diretor
  - Define a ordem onde executar as etapas da construção
  - Não é obrigatória
  - Esconde completamente os detalhes da construção do produto do código cliente

### Estrutura
- Builder
  - A ‘interface’ declara etapas de construção do produto que são comuns a todos os builders
- Builders Concretos
  - Provém diferentes implementações das etapas de construção
  - Podem produzir produtos que não seguem a ‘interface’ comum
- Produtos
  - São objetos resultantes
  - Produtos construídos por diferentes builders não precisam pertencer a mesma ‘interface’ ou hierarquia da classe
- Diretor
  - Define a ordem onde as etapas de construção são chamadas
  - Com o diretor, o cliente pode criar e reutilizar configurações específicas de produtos
- Cliente
  - Deve associar um dos objetos builders com o diretor
  - É feito apenas uma vez, por parâmetros do construtor do diretor
  - O diretor usa aquele objeto builder para todas as futuras construções
  - Uma abordagem diferente seria usar um builder diferente a cada vez que produzir alguma coisa com o diretor

### Prós e Contras
- Prós
  - Construir objetos passo a passo, adiar etapas de construção ou rodar etapas recursivamente
  - Reutilizar o mesmo código de construção quando construimos várias representações de produtos
  - Princípio de responsabilidade única
    - Isolar um código de construção complexo da lógica de negócio do produtos
- Contras
  - A complexidade geral do código aumenta visto que o padrão exige criar múltiplas classes novas

### Referências utilizadas
- Design Pattern Builder na Prática
  - https://www.youtube.com/watch?v=W-96z2EjoJ0&list=PL5aY_NrL1rjtP1GVk1lxifkeob1F09L4p&index=5
- Builder
  - https://refactoring.guru/pt-br/design-patterns/builder

