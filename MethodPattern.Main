import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String decoder = scan.nextLine();

    player deco = null;

    if (decoder.indexOf("mkv") >= 0) {
      deco = new mkv ();
    }
    else if (decoder.indexOf ("mp4") >= 0) {
      deco = new mp4();
  
    }
    else {
      System.out.println("Erro");
      return;
    }

    System.out.println(deco.play());
  }
  }
