package ExerciciosOO.POOEx8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainEx8 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 8");
    System.out.println("Escreva uma classe Data cuja instância (objeto)\n" +
            "represente uma data. Esta classe deverá dispor dos seguintes métodos:\n" +
            "a. Construtor: define a data que determinado objeto (através de parâmetro),\n" +
            "   este método verifica se a data está correta, caso não esteja\n" +
            "   a data é configurada como 01/01/0001\n" +
            "b. Compara: recebe como parâmetro um outro objeto da Classe data,\n" +
            "   compare com a data corrente e retorne:\n" +
            "     i. 0 se as datas forem iguais;\n" +
            "     ii. 1 se a data corrente for maior que a do parâmetro;\n" +
            "     iii. -1 se a data do parâmetro for maior que a corrente.\n" +
            "c. GetDia: retorna o dia da data\n" +
            "d. GetMes: retorna o mês da data\n" +
            "e. GetMesExtenso: retorna o mês da data corrente por extenso\n" +
            "f. GetAno: retorna o ano da data\n" +
            "g. IsBissexto: retorna verdadeiro se o ano da data corrente\n" +
            "   for bissexto e falso caso contrário\n" +
            "h. Clone: o objeto clona a si próprio, para isto, ele cria\n" +
            "   um novo objeto da classe Data com os mesmos valores de atributos\n" +
            "e retorna sua referência pelo método");

    Scanner sc = new Scanner(System.in);

    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    Date dataDeAgora = new Date();

    System.out.println();
    System.out.print("Digite o dia da data 1: ");
    int dia1 = sc.nextInt();

    System.out.print("Digite o mês da data 1: ");
    int mes1 = sc.nextInt();

    System.out.print("Digite o ano da data 1: ");
    int ano1 = sc.nextInt();

    DataEx8 data1 = new DataEx8(dia1, mes1, ano1);

    System.out.println();
    System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());

    System.out.println("Mês por extenso da data 1: " + data1.mesExtenso(mes1));

    System.out.println("Ano da data 1 é bissexto? " + data1.isBissexto(ano1));

    System.out.println("Data 1 clonada: " + data1.clone(dia1, mes1, ano1));

    System.out.println();
    System.out.println("---------------------------------");

    System.out.println();
    System.out.print("Digite o dia da data 2: ");
    int dia2 = sc.nextInt();

    System.out.print("Digite o mês da data 2: ");
    int mes2 = sc.nextInt();

    System.out.print("Digite o ano da data 2: ");
    int ano2 = sc.nextInt();

    DataEx8 data2 = new DataEx8(dia2, mes2, ano2);

    System.out.println();
    System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

    System.out.println("Mês por extenso: " + data2.mesExtenso(mes2));

    System.out.println("Ano é bissexto: " + data2.isBissexto(ano2));

    System.out.println("Data 2 clonada: " + data2.clone(dia2, mes2, ano2));


    System.out.println();
    System.out.println("---------------------------------");

    String dataRecente = "";

    int comparaData = data1.compara(data1,data2);

    if(comparaData == 1){
      dataRecente = "A data data 1 é a mais recente.";
    } else if(comparaData == -1){
      dataRecente = "A data data 2 é a mais recente.";
    } else {
      dataRecente = "As duas são da mesma data";
    }

    System.out.println(dataRecente);

  }
}
