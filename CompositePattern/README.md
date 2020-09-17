# Composite Pattern

O tipo de padrão Composite Patten, é um padrão de projeto utilizado para componentes em que a superclasse possui subclasses, ele armazena componentes das subclasses e 
implementa operações relacionadas a filhos e definidas na interface Component.

## Onde utilizar:

O Composite deve ser usado quando os clientes ignoram a diferença entre composições de objetos e objetos individuais. [1] Se os programadores descobrem que estão usando vários objetos da mesma maneira, e muitas vezes têm código quase idêntico para lidar com cada um deles, então o composto é uma boa escolha; é menos complexo nesta situação tratar primitivos e compostos como homogêneos.


## O Composite Pattern pode auxiliar na resolução de:

.Uma hierarquia parte-todo deve ser representada para que os clientes possam tratar os objetos parte e todo uniformemente.
.Uma hierarquia parte-todo deve ser representada como uma estrutura de árvore.

## Motivation 

O Composite pattern é uma interface que permite tratar objetos complexos e primitivos de maneira uniforme. Na programação orientada a objetos, um composto é um objeto projetado como uma composição de um ou mais objetos semelhantes, todos exibindo funcionalidade semelhante. Isso é conhecido como relacionamento " tem um " entre objetos. O conceito principal é que você pode manipular uma única instância do objeto da mesma forma que manipularia um grupo deles.


###### Exemplos Composite Pattern

Com base nas aulas ministradas pelo professor João cunha, conseguimos concluir alguns exemplos em sala de aula para o mesmo padrão de projetos. [Exemplo Composite Pattern](https://github.com/IagoJuan/PadroesDeProjetos/tree/master/CompositePattern/Composite).
