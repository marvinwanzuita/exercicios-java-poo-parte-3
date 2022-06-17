package ExerciciosOO.POOEx09;

import ExerciciosOO.POOEx8.DataEx8;
import java.util.Random;


public class VooEx9 {

  // ATRIBUTOS
  private int numeroVoo;
  private DataEx8 dataVoo;

  private boolean[] assentosVoo = new boolean[10];

  private int passageirosVoo;

  Random aleatorio = new Random();

  // CONSTRUTORES

  public VooEx9(){}

  public VooEx9( DataEx8 dataVoo ){
    this.numeroVoo = aleatorio.nextInt(1000);
    this.dataVoo = dataVoo;
  }

  // GETTERS E SETTERS

  public int getNumeroVoo() {
    return numeroVoo;
  }

  public void setNumeroVoo(int numeroVoo) {
    this.numeroVoo = numeroVoo;
  }

  public DataEx8 getDataVoo() {
    return dataVoo;
  }

  public void setDataVoo(DataEx8 dataVoo) {
    this.dataVoo = dataVoo;
  }

  public boolean[] getAssentosVoo() {
    return assentosVoo;
  }

  public void setAssentosVoo(boolean[] assentosVoo) {
    this.assentosVoo = assentosVoo;
  }

  public int getPassageirosVoo() {
    return passageirosVoo;
  }

  public void setPassageirosVoo(int passageirosVoo) {
    this.passageirosVoo = passageirosVoo;
  }

  // METODOS
  public boolean[] preencherAssentosVoo(){
    for (int i = 0; i < assentosVoo.length; i++){
      assentosVoo[i] = aleatorio.nextBoolean();
    }
    return assentosVoo;
  }

  public int proximoLivre(boolean[] assentosVoo){
    int proximoAssentoLivre = 1;
    for (int i = 0; i < assentosVoo.length; i++){
      if (assentosVoo[i] == false){
        proximoAssentoLivre = i;
        break;
      }
    }
    return proximoAssentoLivre;
  }

  public String verifica(int numeroAssento){
    String vericacao = "";
    for (int i = 0; i < assentosVoo.length; i++){
      if (numeroAssento == i){
        if (assentosVoo[i] == true){
          vericacao = "Assento está ocupado.";
        } else {
          vericacao = "Assento está livre.";
        }
      }
    }
    return vericacao;
  }

  public void ocupa(int ocuparAssento){
    for (int i = 0; i < assentosVoo.length; i++){
      if (i == ocuparAssento){
        assentosVoo[i] = true;
      }
    }
  }

  public int vagas(){
    int lugaresVazios = 0;
    for (int i = 0; i < assentosVoo.length; i++){
      if (!assentosVoo[i]){
        lugaresVazios++;
      }
    }
    return lugaresVazios;
  }

}
