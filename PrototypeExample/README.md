# Projeto de exemplo para utilização de Prototype

## Prototype
- Faz parte do GoF
- Padrão de Projeto Criacional
- Cria um prototipo utilizado para clonar e gerar um objeto real
- Permite copiar objetos existentes sem fazer o seu código ficar dependente das suas classes

### Motivação do Pattern Prototype
- Quando a subclasse tem pouca diferença entre a superclasse
- Copiar objetos mesmo sem saber que objeto que é

### Conceitos básicos
- Prototype (Clonable)
- ConcretePrototype (sua classe que implementa o Clonable)
- Cliente (quem usa)

### Estrutura
- ‘Interface’ protótipo declara os métodos de clonagem
  - Geralmente é apenas um método clonar
- A classe protótipo concreta implementa o método de clonagem
- O cliente pode produzir uma cópia de qualquer objeto que segue a ‘interface’ do protótipo

### Prós e Contras
- Prós
  - Menos subclasses
  - Pode clonar objetos sem acoplamento com as suas classes concretas
  - Se livrar de códigos repetidos
  - Produzir objetos mais complexos convenientemente
  - Tem uma alternativa para herança quando lidar com configurações pré-determinadas para objetos complexos
- Contras
  - Algumas situações são melhor utilizar subclasses
  - Clonar objetos complexos com referências circulares pode ser bem complicado

### Referências utilizadas:
- Crie MODELOS de INSTÂNCIAS para serem REUTILIZADAS com o padrão PROTOTYPE!
  - https://www.youtube.com/watch?v=yva9vcZM2tM
- Prototype - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/prototype
