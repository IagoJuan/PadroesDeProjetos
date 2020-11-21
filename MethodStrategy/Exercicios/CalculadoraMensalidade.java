import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class CalculadoraMensalidade {
  
  private List<Desconto> descontos = new ArrayList<Desconto>();

  public CalculadoraMensalidade(List<Desconto> descontos) {
    this.descontos = descontos;
  }

  public BigDecimal obterValorMensalidade(Aluno aluno, BigDecimal mensalidade) {

    BigDecimal valorFinal = mensalidade;

    for (Desconto d : descontos) {      
      //  compor as estratégias para cada aluno
    
      valorFinal = valorFinal.subtract(d.aplicarDesconto(aluno, valorFinal));
    }

    return valorFinal;
  }
  
}