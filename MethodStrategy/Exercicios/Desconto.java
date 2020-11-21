import java.math.BigDecimal;

public interface Desconto {
  BigDecimal aplicarDesconto(Aluno aluno, BigDecimal mensalidade);
}