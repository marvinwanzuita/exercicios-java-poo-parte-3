package ExerciciosOO.POOEx12;

public class PessoaEx12 {

  private String nomeAgenda;
  private int idadeAgenda;
  private double alturaAgenda;

  public PessoaEx12(){}

  public String getNomeAgenda() {
    return nomeAgenda;
  }

  public void setNomeAgenda(String nomeAgenda) {
    this.nomeAgenda = nomeAgenda;
  }

  public int getIdadeAgenda() {
    return idadeAgenda;
  }

  public void setIdadeAgenda(int idadeAgenda) {
    this.idadeAgenda = idadeAgenda;
  }

  public double getAlturaAgenda() {
    return alturaAgenda;
  }

  public void setAlturaAgenda(double alturaAgenda) {
    this.alturaAgenda = alturaAgenda;
  }

  @Override
  public String toString() {
    return "Nome: " + nomeAgenda + " | " +
           "Idade: " + idadeAgenda + " | " +
           "Altura: " + alturaAgenda;
  }


}
