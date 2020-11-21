public class Aluno {
    private String nome;
    private boolean transferencia;
    private boolean baixaRenda;
    
    public Aluno(String nome) {
      this.nome = nome;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public void setTransferencia(boolean transferencia) {
      this.transferencia = transferencia;
    }
  
    public boolean getTransferencia() {
      return this.transferencia;
    }
  
    public void setBaixaRenda(boolean baixaRenda) {
      this.baixaRenda = baixaRenda;
    }
  
    public boolean getBaixaRenda() {
      return this.baixaRenda;
    }
  
  }