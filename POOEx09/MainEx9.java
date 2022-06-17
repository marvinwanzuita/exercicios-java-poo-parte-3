package ExerciciosOO.POOEx09;

import ExerciciosOO.POOEx8.DataEx8;

import java.util.Scanner;

public class MainEx9 {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 9");
    System.out.println("Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em\n" +
            "determinado horário. Cada vôo possui no máximo 50 passageiros, e a classe permite controlar a\n" +
            "ocupação das vagas. A classe deve ter os seguintes métodos:\n" +
            "a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para\n" +
            "   armazenar a data utilize um objeto da classe Data, criada na questão anterior);\n" +
            "b. ProximoLivre: retorna o número da próxima cadeira livre\n" +
            "c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada\n" +
            "d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna\n" +
            "   verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso\n" +
            "   contrário\n" +
            "e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo\n" +
            "f. GetVoo: retorna o número do vôo");

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("--- DIGITE AS INFORMAÇÕES DA DATA ---");
    System.out.print("    Dia: ");
    int diaVoo = sc.nextInt();
    System.out.print("    Mês: ");
    int mesVoo = sc.nextInt();
    System.out.print("    Ano: ");
    int anoVoo = sc.nextInt();
    System.out.print("   Hora: ");
    int horaVoo = sc.nextInt();
    System.out.print("Minutos: ");
    int minutoVoo = sc.nextInt();

    DataEx8 dataVoo = new DataEx8(diaVoo, mesVoo, anoVoo, horaVoo, minutoVoo);

    VooEx9 voo = new VooEx9(dataVoo);

    System.out.println("----------------------------");
    System.out.println("Vôo " + voo.getNumeroVoo() + " marcado para: " + dataVoo);
    System.out.println("----------------------------");


    System.out.println();
    boolean listaAssentos[] = voo.preencherAssentosVoo();
    String escolherAssento;
    int assentoEscolhido = -1;
    int respostaMenu;
    do {
      System.out.println();
      System.out.println("---------- MENU --------------");
      System.out.println("Digite a opção que deseja: \n" +
                       "1 = Verificar lista de assentos; \n" +
                       "2 = Escolher assento; \n" +
                       "3 = Verificar se assento está ocupado; \n" +
                       "4 = Verificar o próximo assento livre; \n" +
                       "5 = Verificar o total de assentos livres; \n" +
                       "6 = Sair do programa.");
      System.out.println("------------------------------");
      respostaMenu = sc.nextInt();

      switch (respostaMenu){
        case 1:
          System.out.println();
          System.out.println("--- LISTA DE ASSENTOS ---");
          int assentos = 0;
          for (boolean assentoVoo: listaAssentos) {
            System.out.println(assentos + " : " + voo.verifica(assentos));
            assentos++;
          }
          System.out.println("-------------------------");
          break;
        case 2:
          System.out.println();
          System.out.println("Qual assento deseja escolher? ");
          assentoEscolhido = sc.nextInt();
          escolherAssento = voo.verifica(assentoEscolhido);
          if (escolherAssento == "Assento está ocupado."){
            System.out.println(escolherAssento);
            System.out.println("Voltando ao menu.");
          } else {
            System.out.println("Assento selecionado.");
            voo.ocupa(assentoEscolhido);
          }
          break;
        case 3:
          System.out.println();
          System.out.println("Qual assento deseja verificar se está ocupado? ");
          System.out.println(voo.verifica(sc.nextInt()));
          break;
        case 4:
          System.out.println();
          System.out.println("Próximo assento livre: " +
                             voo.proximoLivre(voo.getAssentosVoo()));
          break;
        case 5:
          System.out.println();
          System.out.println("Restante de lugares livres: " + voo.vagas());
          break;
        case 6:
          System.out.println();
          System.out.println("Saindo do sistema. Boa viagem.");
          break;
        default:
          System.out.println("Seleção inválida. Acessando o menu novamente.");
      }

    } while (respostaMenu != 6);


  }
}
