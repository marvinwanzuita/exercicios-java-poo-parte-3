package POOEx7;

public class FuncionarioEx7 {

  private String primeiroNome;
  private String sobreNome;
  private double salarioMensal;

  public FuncionarioEx7(){}

  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
  }

  public String getSobreNome() {
    return sobreNome;
  }

  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }

  public double getSalarioMensal() {
    return salarioMensal;
  }

  public void setSalarioMensal(double salarioMensal) {
    if (salarioMensal < 0){
      this.salarioMensal = 0;
    } else {
      this.salarioMensal = salarioMensal;
    }
  }

  public void aumentoSalario(){
    salarioMensal += (salarioMensal * 0.1);
  }

  @Override
  public String toString() {
    return "---- DADOS FUNCIONÁRIO ----" +
            "\n      Nome: " + primeiroNome +
            "\n Sobrenome: " + sobreNome +
            "\n   Salário: " + salarioMensal +
            "\n-------------------------";
  }
}
