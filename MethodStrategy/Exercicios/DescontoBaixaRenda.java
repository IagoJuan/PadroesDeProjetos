import java.math.BigDecimal;
public class DescontoBaixaRenda implements Desconto {
  
  public BigDecimal aplicarDesconto(Aluno aluno, BigDecimal mensalidade) {
    
    if (aluno.getBaixaRenda()) {
      return mensalidade.multiply(new BigDecimal(0.5));
    }
    else {
      return new BigDecimal(0);
    }
  }
}