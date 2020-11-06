public class PacotePronto implements EstadoPacote {
    public void previousState(Pacote pacote) {
      System.out.println("Nenhum estado anterior");
    }
    
    public void nextState(Pacote pacote) {
      pacote.setState(new PacoteEnviado());
    }
  
    public void printStatus() {
      System.out.println("Pronto para ser enviado.");
    }
  }