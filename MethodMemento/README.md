# Padrão Memento

## MOTIVATION
O Memento é definido como um padrão comportamental. Com esse método você pode capturar e externalizar um estado interno de um objeto, isso pode ser feito de maneira que o objeto possa ser restaurado para esse estado mais tarde

## INTENTION
A intenção para o uso do Memento é de você ir salvando momentaneamente as alteações que você faz e caso você precise voltar em um determinado momento antes de você ter feito alguma alteração isso seja possível.

## APLICABILITY
O Memento pode ser usado em sistemas onde os usuários fazem muitas simulações e são necessários salvar ou desfazer essas configurações em tempo de execução.

## PARTCIPANTS
Os participantes do Memento são:

### Memento: é a classe que representa um snapshot, contendo o estado de um objeto a ser restaurado em um Originador. Possui métodos para obter e definir o estado que um Memento encapsula dentro.

### Originador: é a classe na qual o estado atual é mantido. Define Método que permite criar um Memento com o estado atual do Originador armazenado no Memento retornado.

### Caretaker: Classe auxiliar responsavel por armazenar e restaurar o estado do Originador por meio do Objeto Memento.
