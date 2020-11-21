import java.math.BigDecimal;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Main10 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Joao");
    aluno1.setTransferencia(true);
    
    List<Desconto> descontos = new ArrayList<Desconto>();
    descontos.add(new DescontoTransferencia());

    CalculadoraMensalidade cm = new CalculadoraMensalidade(descontos);
    processarAluno(aluno1, cm);    

    Aluno aluno2 = new Aluno("Maria");
    aluno2.setTransferencia(true);
    aluno2.setBaixaRenda(true);

    descontos = new ArrayList<Desconto>();
    descontos.add(new DescontoBaixaRenda());
    cm = new CalculadoraMensalidade(descontos);
    processarAluno(aluno2, cm);    

    Aluno aluno3 = new Aluno("Jose");   
    cm = new CalculadoraMensalidade(new ArrayList<Desconto>());
    processarAluno(aluno3, cm);
  }

  public static void processarAluno(Aluno aluno, CalculadoraMensalidade contexto) {    
    System.out.println("Valor Mensalidade do " + aluno.getNome());

    BigDecimal mensalidade = sc.nextBigDecimal();

    BigDecimal valorFinal = contexto.obterValorMensalidade(aluno, mensalidade);
    System.out.println("Valor com descontos: " + valorFinal);
  }

}