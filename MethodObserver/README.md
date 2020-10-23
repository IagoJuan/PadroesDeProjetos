Method Observer

INTENTION
O Method Observer serve para receber notificações sobre mudanças de estado em outros objetos quando esta mudança for relevante.

MOTIVATION
A principal motivação ara o uso do Observer é para manter a consistência entre os objetos relacionados sem torná-los acoplados

APPLICABILITY
a aplicabilidade do Observer seria quando a mudança de estado em um objeto deve ser refletida em outro objeto, sem manter os objetos fortemente acoplados. a estrutura que estamos escrevendo precisa ser aprimorada no futuro com novos observadores com mudanças mínimas. 

PARTCIPANTS
Os participantes do Object são:

Subject: é a classe que possui a informação o estado que se deseja observar.

Observer: interface que define os métodos de notificação de interesse dos observadores

ConcreteObserverA e B: Classes concretas que observam a classe Subject