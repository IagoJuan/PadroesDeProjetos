public class PacoteEnviado implements EstadoPacote {
    public void previousState(Pacote pacote) {
      System.out.println(new PacotePronto());
    }
    
    public void nextState(Pacote pacote) {
      pacote.setState(new PacoteSeparadoEntrega());
    }
  
    public void printStatus() {
      System.out.println("Pronto enviado.");
    }
  }