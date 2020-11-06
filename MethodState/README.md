## PATTERN NAME AND CLASIFICATION

Method State

## INTENTION

A intenção de usar o Method State é permitir que o objeto altere o seu comportamento quando o seu estado interno mudar.

## MOTIVATION

A motivação para usar esse Method é permitir ao objeto possuir diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com base nesse estado.

## APPLICABILITY

Esse Method é usado em situações que você tenha objetos que se comportem de maneira diferente.

## STRUCTURE

Context: define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do projeto.

State: Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto.

## SAMPLE CODE

Podemos ver um exemplo desse Method sendo implementado no Exercício da pasta acima
