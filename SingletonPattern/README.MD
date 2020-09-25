# SingletonPattern

## INTENTION
O Singleton Pattern é um padrão que faz com que exista apenas uma instância de uma classe

## MOTIVATION
Seria fazer que uma classe tenha apenas uma instância para todo o projeto.

## APPLICABILITY
A aplicabilidade seria assegurar que uma classe possua apenas uma instância pois se tiver mais de uma o código fica mais complexo e fica mais sujeito a erros.

## STRUCTURE
A classe Singleton declara o método estático getInstance que retorna a mesma instância de sua própria classe.

O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.

## SAMPLE CODE
Podemos ver um exeplo citado em aula acima.
