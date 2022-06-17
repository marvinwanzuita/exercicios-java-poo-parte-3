package ExerciciosOO.POOEx11;

import java.util.Scanner;

public class MainEx11 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 11");
    System.out.println("Crie uma classe chamada Ingresso, que possui\n" +
            "um valor em reais e um método imprimirValor. Crie uma classe\n" +
            "IngressoVIP, que herda de Ingresso e possui um valor adicional.\n" +
            "Crie um método que retorne o valor do ingresso VIP\n" +
            "(com o adicional incluído). Crie um programa para criar as instâncias\n" +
            "de Ingresso e IngressoVIP, mostrando a diferença de preços.");

    Scanner sc = new Scanner(System.in);

    IngressoEx11 ingresso = new IngressoEx11();
    IngressoVIPEx11 ingressoVIP = new IngressoVIPEx11();

    System.out.println();
    System.out.print("Digite o valor do ingresso: R$ ");
    ingresso.setValorIngresso(sc.nextDouble());

    System.out.println();
    System.out.println("Valor do ingresso normal: R$ "
            + ingresso.imprimirValor(ingresso.getValorIngresso()));

    System.out.println("Valor do ingresso VIP: R$ " +
            ingressoVIP.imprimirValorVIP(ingresso.getValorIngresso()));


  }

}
