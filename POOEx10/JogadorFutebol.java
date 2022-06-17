package ExerciciosOO.POOEx10;

import ExerciciosOO.POOEx8.DataEx8;

public class JogadorFutebol {

  private String nomeJogador;
  private int posicaoJogador;
  private DataEx8 dataNascimentoJogador;
  private String nacionalidadeJogador;
  private double alturaJogador;
  private double pesoJogador;

  private int idadeJogador;

  public JogadorFutebol(){};



  public String getNomeJogador() {
    return nomeJogador;
  }

  public void setNomeJogador(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }

  public int getPosicaoJogador() {
    return posicaoJogador;
  }

  public void setPosicaoJogador(int posicaoJogador) {
    this.posicaoJogador = posicaoJogador;
  }

  public DataEx8 getDataNascimentoJogador() {
    return dataNascimentoJogador;
  }

  public void setDataNascimentoJogador(DataEx8 dataNascimentoJogador) {
    this.dataNascimentoJogador = dataNascimentoJogador;
  }

  public String getNacionalidadeJogador() {
    return nacionalidadeJogador;
  }

  public void setNacionalidadeJogador(String nacionalidadeJogador) {
    this.nacionalidadeJogador = nacionalidadeJogador;
  }

  public double getAlturaJogador() {
    return alturaJogador;
  }

  public void setAlturaJogador(double alturaJogador) {
    this.alturaJogador = alturaJogador;
  }

  public double getPesoJogador() {
    return pesoJogador;
  }

  public void setPesoJogador(double pesoJogador) {
    this.pesoJogador = pesoJogador;
  }

  @Override
  public String toString() {
    return "          ----- FICHA TECNICA DO JOGADOR -----\n" +
            "                    Nome: " + nomeJogador +
            "\n               Posição: " + posicaoJogador(posicaoJogador) +
            "\n          Naturalidade: " + nacionalidadeJogador +
            "\n                Altura: " + alturaJogador + " m" +
            "\n                  Peso: " + pesoJogador + " kg" +
            "\n    Data de Nascimento: " + dataNascimentoJogador.getDia() + "/"
                                     + dataNascimentoJogador.getMes() + "/"
                                     + dataNascimentoJogador.getAno() +
            "\n                 Idade: " + calcularIdadeJogador() +
            "\nAnos para se aposentar: " + calcularAposentadoria(idadeJogador);
  }

  public String posicaoJogador(int posicaoJogador){
    String posicao = "";
    switch (posicaoJogador){
      case 1:
        posicao = "Atacante";
        break;
      case 2:
        posicao = "Meio-campo";
        break;
      case 3:
        posicao = "Zagueiro";
        break;
    }
    return posicao;
  }

  public int calcularIdadeJogador(){
  int anoNascimento = dataNascimentoJogador.getAno();
  idadeJogador = 2022 - anoNascimento;
  return idadeJogador;
}
  public int calcularAposentadoria(int idadeJogador){
      int faltaAnosAposentadoria = 0;
      switch (posicaoJogador){
        case 1:
          faltaAnosAposentadoria = 35 - idadeJogador;
          break;
        case 2:
          faltaAnosAposentadoria = 38 - idadeJogador;
          break;
        case 3:
          faltaAnosAposentadoria = 40 - idadeJogador;
          break;
      }
      return faltaAnosAposentadoria;
  }

}
