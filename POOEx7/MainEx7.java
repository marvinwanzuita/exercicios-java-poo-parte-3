package POOEx7;

import java.util.Scanner;

public class MainEx7 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("EXERCICIO POO 7");
    System.out.println("A fim de representar funcionários em uma empresa,\n" +
            "crie uma classe chamada Funcionario que inclui as três informações\n" +
            "a seguir como atributos:\n" +
            "a. um primeiro nome,\n" +
            "b. um sobrenome\n" +
            "c. um salário mensal\n" +
            "Sua classe deve ter um construtor que inicializa os três atributos.\n" +
            "Forneça os métodos getters e setters para cada atributo. Se o salário\n" +
            "mensal não for positivo, configure-o como 0.0. Escreva um aplicativo\n" +
            "de teste que demonstra as capacidades da classe. Crie duas instâncias\n" +
            "da classe e exiba o salário anual de cada instância. Então dê a cada\n" +
            "empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.");

    Scanner sc = new Scanner(System.in);

    FuncionarioEx7 funcionario1 = new FuncionarioEx7();
    FuncionarioEx7 funcionario2 = new FuncionarioEx7();

    System.out.println();
    System.out.print("Digite o nome do funcionário 1: ");
    funcionario1.setPrimeiroNome(sc.nextLine());

    System.out.print("Digite o sobrenome do funcionário 1: ");
    funcionario1.setSobreNome(sc.nextLine());

    System.out.print("Digite o salário do funcionário 1: ");
    funcionario1.setSalarioMensal(sc.nextDouble());

    System.out.println();
    System.out.print("Digite o nome do funcionário 2: ");
    sc.nextLine();
    funcionario2.setPrimeiroNome(sc.nextLine());

    System.out.print("Digite o sobrenome do funcionário 2: ");
    funcionario2.setSobreNome(sc.nextLine());

    System.out.print("Digite o salário do funcionário 2: ");
    funcionario2.setSalarioMensal(sc.nextDouble());

    System.out.println();
    System.out.println(funcionario1);
    System.out.println(funcionario2);

    funcionario1.aumentoSalario();
    funcionario2.aumentoSalario();

    System.out.println();
    System.out.println("AUMENTO SALÁRIAL DE 10% ");
    System.out.println(funcionario1);
    System.out.println(funcionario2);
  }
}
