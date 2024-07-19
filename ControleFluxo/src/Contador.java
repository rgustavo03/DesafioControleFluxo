import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite um valor inteiro:");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite outro valor inteiro:");
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm,parametroDois);
    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo valor deve ser maior que o primeiro!");
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    int qtdIteracoes = 0;

    if(parametroDois < parametroUm) {
      throw new ParametrosInvalidosException();
    }
    else {
      qtdIteracoes = parametroDois - parametroUm;
    }

    for(int x = 0; x < qtdIteracoes; x++) {
      System.out.println(x + 1);
    }
  }

}
