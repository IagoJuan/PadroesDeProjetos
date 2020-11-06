public class Pacote {
    private String nome;
    
    // pacote possui 3 estados possíveis
    // 1. Pronto  
    // 2. Enviado
    // 3. Separado para entrega
    // 4. Saiu para entrega
    // 5. Recebido
  
    private EstadoPacote estadoAtual;
  
    public Pacote(String nome) {
      this.nome = nome;
      this.estadoAtual = new PacotePronto();
    }
  
    public void setState(EstadoPacote newState) {
      this.estadoAtual = newState;
    }
  
    public void previousState() {
      this.estadoAtual.previousState(this);
    }
  
    public void nextState() {
      this.estadoAtual.nextState(this);
    }
  
    public void printStatus() {
      this.estadoAtual.printStatus();
    }
  }