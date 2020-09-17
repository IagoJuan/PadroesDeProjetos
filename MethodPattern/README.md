# Method Pattern

O Method Pattern Define o esqueleto de um algoritmo na supperclasse e permite que as subclasses façam modificações deste algoritimo sem alterar a sua estrutura. Em tempo de execução, o algoritmo representado pelo método template é executado enviando a mensagem template para uma instância de uma das subclasses concretas. Por meio de herança, o método de modelo na classe base começa a ser executado. Quando o método do modelo envia uma mensagem para se auto-solicitar um dos métodos auxiliares, a mensagem será recebida pela sub-instância concreta. Se o método auxiliar foi sobrescrito, a implementação sobrescrita na sub-instância será executada, se não foi substituído, a implementação herdada na classe base será executada. Esse mecanismo garante que o algoritmo geral siga as mesmas etapas todas as vezes, enquanto permite que os detalhes de algumas etapas dependam de qual instância recebeu a solicitação original para executar o algoritmo.


## Onde utilizar?

O Method pode ser aplicável em casos que se tem uma hierarquia de classes se tem um algoritmo que deve ser dividido em etapas "Um método na superclasse, chamado template method, invoca os demais métodos que podem ser abstratos".

###### Permite customizar as etapas do algoritimo se necessário.

## Quando usar?

- Aplicação possui estrutura hierárquica e um algoritmo que pode ser dividido em etapas/

- Dois ou mais componetes diferentes implementam esse algoritmo, possuindo várias semelhanças mas algumas diferenças na implementação de algumas etapas do algoritmo

- Alterações no algoritmo pode ser feitas de forma genérica ou especifica em cada componente especifico.

- Útil em cenários em que se tem gerador automático de código.

Um exemplo da utilização desse metodo é um criado em sala em um exercício dado pelo professor João Cunha e criado por mim Iago Juan [Exemplo Method Pattern](https://github.com/IagoJuan/PadroesDeProjetos/tree/master/MethodPattern/ExemploMethodPattern).
