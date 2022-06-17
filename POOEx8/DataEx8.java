package ExerciciosOO.POOEx8;

import javax.xml.crypto.Data;

public class DataEx8 {

  // ATRIBUTOS
  private int dia;
  private int mes;
  private int ano;

  private int hora;

  private int minuto;
  private String mesExtenso;

  // CONSTRUTOR
  public DataEx8(int dia, int mes, int ano) {

    boolean conferirDia = (dia >= 1) && (dia <= 31);
    boolean conferirMes = (mes >= 1) && (mes <= 12);

    if(conferirDia && conferirMes){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      this.dia = 01;
      this.mes = 01;
      this.ano = 0001;
    }

  }

  public DataEx8(){};
  public DataEx8(int dia, int mes, int ano, int hora, int minuto) {

    boolean conferirDia = (dia >= 1) && (dia <= 31);
    boolean conferirMes = (mes >= 1) && (mes <= 12);
    boolean conferirHora = (hora >= 0) && (hora <= 23);
    boolean conferirMinuto = (minuto >= 0) && (minuto <= 60);


    if(conferirDia && conferirMes){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      this.dia = 01;
      this.mes = 01;
      this.ano = 0001;
    }

    if(conferirHora && conferirMinuto){
      this.hora = hora;
      this.minuto = minuto;
    } else {
      this.hora = 00;
      this.minuto = 00;
    }

  }

  // GETTERS E SETTERS

  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  // TO STRING

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto;
  }

  // METODOS

  public String mesExtenso(int mes){
    switch(mes){
      case 1:
        return mesExtenso = "Janeiro";
      case 2:
        return mesExtenso = "Fevereiro";
      case 3:
        return mesExtenso = "Março";
      case 4:
        return mesExtenso = "Abril";
      case 5:
        return mesExtenso = "Maio";
      case 6:
        return mesExtenso = "Junho";
      case 7:
        return mesExtenso = "Julho";
      case 8:
        return mesExtenso = "Agosto";
      case 9:
        return mesExtenso = "Setembro";
      case 10:
        return mesExtenso = "Outubro";
      case 11:
        return mesExtenso = "Novembro";
      case 12:
        return mesExtenso = "Dezembro";
      default:
        return mesExtenso = "Mês inexistente";
    }
  }

  public int dataEmDias(int dia, int mes, int ano){
    return dia + ((mes - 1) * 30) + (ano * 365);
  }

  public int compara(DataEx8 comparaData1, DataEx8 comparaData2){
    int diasComparacao1 = comparaData1.dataEmDias(comparaData1.dia, comparaData1.mes, comparaData1.ano);
    int diasComparacao2 = comparaData2.dataEmDias(comparaData2.dia, comparaData2.mes, comparaData2.ano);

    if (diasComparacao1 > diasComparacao2){
      return 1;
    } else if (diasComparacao1 < diasComparacao2){
      return -1;
    } else {
      return 0;
    }
  }

  public String isBissexto(int ano){
    if(((ano % 4) == 0) && ((ano % 100) != 0) || (ano % 400 == 0)){
      return "Ano é BISSEXTO";
    } else {
      return "Ano NÃO é bissexto.";
    }
  }

  public DataEx8 clone(int dia, int mes, int ano){
    DataEx8 dataClonada = new DataEx8(dia, mes, ano);
    return dataClonada;
  };


}
