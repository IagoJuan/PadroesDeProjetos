import java.math.BigDecimal;

public class DescontoTransferencia implements Desconto {
  public BigDecimal aplicarDesconto(Aluno aluno, BigDecimal mensalidade) {

    if (aluno.getTransferencia()) {
      return mensalidade.multiply(new BigDecimal(0.2));
    }
    else {
      return new BigDecimal(0);
    }
  }
}