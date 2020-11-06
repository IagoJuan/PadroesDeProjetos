public interface EstadoPacote {
    void previousState(Pacote pacote);
    void nextState(Pacote pacote);
    void printStatus();
  }