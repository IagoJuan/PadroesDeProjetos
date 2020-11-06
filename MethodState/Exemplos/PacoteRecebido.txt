public class PacoteRecebido implements EstadoPacote {
    public void previousState(Pacote pacote) {
      pacote.setState(new PacoteParaEntrega());
    }
    
    public void nextState(Pacote pacote) {
      System.out.println("Pronto já recebido.");
    }
  
    public void printStatus() {
      System.out.println("Pronto recebido.");
    }
  }