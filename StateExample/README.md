# Projeto de exemplo para utilização de State

## State
- Faz parte do GoF
- Padrão de Projeto Comportamental
- Permite que um objeto altere o seu comportamento quando o seu estado interno muda
- Parece como se o objeto mudasse de classe

### Motivação do Pattern State
- Evitar que um programa com muitas condicionais numa classe se torne uma massa inchada e disforme com o tempo 

### Estrutura
- O contexto armazena uma referência a um dos objetos concretos de estado e delegue-lhes todos os trabalhos específicos de estado
- A interface do estado declara métodos específicos a estados
- Os estados concretos fornecem as suas próprias implementações para os métodos específicos de estados 
- Ambos os estados de contexto e concretos podem configurar o próximo estado do contexto e realizar a atual transição de estado ao substituir o objeto estado ligado ao contexto

### Prós e Contras
- Prós
  - Princípio de responsabilidade única
    - Organiza o código relacionado a estados particulares em classes separadas
  - Princípio aberto/fechado
    - Introduz novos estados sem mudar classes de estado ou contexto existentes
  - Simplifica o código de contexto ao eliminar condicionais de máquinas de estado pesadas
- Contras
  - Aplicar o padrão pode ser um exagero se a máquina de estado só tem alguns estados ou raramente muda eles

### Referências utilizadas:
- State design pattern in Java
  - https://www.youtube.com/watch?v=rzU8CMNuFMM
- State - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/state
