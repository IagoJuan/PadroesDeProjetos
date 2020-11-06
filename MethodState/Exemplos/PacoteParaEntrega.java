public class PacoteParaEntrega implements EstadoPacote {
    public void previousState(Pacote pacote) {
      pacote.setState(new PacoteSeparadoEntrega());
    }
    
    public void nextState(Pacote pacote) {
      pacote.setState(new PacoteRecebido());
    }
  
    public void printStatus() {
      System.out.println("Saiu para entrega.");
    }
  }