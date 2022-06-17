package ExerciciosOO.POOEx10;

import ExerciciosOO.POOEx8.DataEx8;

import java.util.Scanner;

public class MainEx10 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 10");
    System.out.println("Crie uma classe para representar um jogador de futebol, com os atributos: \n" +
            "a. nome;\n" +
            "b. posição;\n" +
            "c. data de nascimento;\n" +
            "d. nacionalidade;\n" +
            "e. altura;\n" +
            "f. peso;");

    Scanner sc = new Scanner(System.in);
    JogadorFutebol jogador = new JogadorFutebol();
    DataEx8 dataNascimento = new DataEx8();

    System.out.println();
    System.out.println("--- DIGITE AS INFORMAÇÕES DO JOGADOR ---");
    System.out.print("Nome: ");
    jogador.setNomeJogador(sc.nextLine());

    int respostaPosicao = 0;
    do{
      System.out.println("Posição: 1 = Atacante | 2 = Meio-Campo | 3 = Zagueiro ");
      int opcaoPosicao = sc.nextInt();
      if ((opcaoPosicao == 1) || (opcaoPosicao == 2) || (opcaoPosicao == 3)){
        jogador.setPosicaoJogador(opcaoPosicao);
        respostaPosicao = 1;
      } else {
        System.out.println("Opção inválida. Apresentando menu novamente.");
      }

    } while (respostaPosicao == 0);

    System.out.print("Nacionalidade: ");
    sc.nextLine();
    jogador.setNacionalidadeJogador(sc.nextLine());

    System.out.print("Altura: ");
    jogador.setAlturaJogador(sc.nextDouble());

    System.out.print("Peso: ");
    jogador.setPesoJogador(sc.nextDouble());

    System.out.println("Data de Nascimento: ");
    System.out.print("Dia: ");
    dataNascimento.setDia(sc.nextInt());
    System.out.print("Mês: ");
    dataNascimento.setMes(sc.nextInt());
    System.out.print("Ano: ");
    dataNascimento.setAno(sc.nextInt());

    jogador.setDataNascimentoJogador(dataNascimento);

    System.out.println(jogador);


  }
}
