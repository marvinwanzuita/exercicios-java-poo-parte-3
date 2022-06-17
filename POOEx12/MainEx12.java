package ExerciciosOO.POOEx12;

import java.util.Scanner;

public class MainEx12 {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 12");
    System.out.println("Crie uma classe Agenda que pode armazenar 10 pessoas\n" +
            "e que seja capaz de realizar as seguintes operações:\n" +
            "a. void armazenarPessoa(String nome, int idade, float altura);\n" +
            "   //armazena a pessoa em um array\n" +
            "b. void removerPessoa(String nome); //remove a pessoa do array\n" +
            "c. int buscarPessoa(String nome); //\n" +
            "   informa em que posição da agenda está a pessoa\n" +
            "d. void imprimirAgenda(); \n" +
            "   // imprime os dados de todas as pessoas da agenda\n" +
            "e. void imprimirPessoa(int index); \n" +
            "   // imprime os dados da pessoa que está na posição “i” da agenda.");

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    AgendaEx12 agenda = new AgendaEx12();

    int respostaMenu;

    do {
      System.out.println();
      System.out.println("----- MENU -----\n" +
              "O que deseja fazer na agenda? \n" +
              "1 = Armazenar nova pessoa;\n" +
              "2 = Remover pessoa;\n" +
              "3 = Buscar pessoa pelo nome;\n" +
              "4 = Buscar pessoa pela posicao;\n" +
              "5 = Mostrar agenda inteira;\n" +
              "6 = Sair agenda.");
      respostaMenu = sc.nextInt();

      switch (respostaMenu){
        case 1:
          PessoaEx12 pessoaAgenda = new PessoaEx12();
          System.out.println();
          System.out.println("--- ADICIONAR PESSOA ---");
          System.out.print("  Nome: ");
          sc.nextLine();
          pessoaAgenda.setNomeAgenda(sc.nextLine());
          System.out.print(" Idade: ");
          pessoaAgenda.setIdadeAgenda(sc.nextInt());
          System.out.print("Altura: ");
          pessoaAgenda.setAlturaAgenda(sc.nextDouble());
          System.out.println();
          System.out.println(agenda.armazenarPessoa(pessoaAgenda));
          break;
        case 2:
          System.out.println();
          agenda.imprimirAgenda();
          System.out.println();
          System.out.print("Digite a posição da pessoa que queira remover: ");
          agenda.removerPessoa(sc.nextInt());
          System.out.println();
          System.out.println("Pessoa removida.");
          break;
        case 3:
          System.out.println();
          agenda.imprimirAgenda();
          System.out.println();
          System.out.print("Digite o nome da pessoa que queira buscar: ");
          System.out.println();
          agenda.buscarPessoa(sc2.nextLine());
          System.out.println();
          break;
        case 4:
          System.out.println();
          agenda.imprimirAgenda();
          System.out.println();
          System.out.print("Digite a posição da pessoa que queria mostrar: ");
          System.out.println();
          agenda.imprimirPessoa(sc.nextInt());
          break;
        case 5:
          System.out.println();
          agenda.imprimirAgenda();
          System.out.println();
          break;
        case 6:
          System.out.println("Fechando agenda.");
          break;
      }

    } while (respostaMenu != 6);



  }
}
