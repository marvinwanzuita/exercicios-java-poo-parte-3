package ExerciciosOO.POOEx12;

import java.util.Arrays;

public class AgendaEx12 {

  PessoaEx12 agenda[] = new PessoaEx12[10];


  public String armazenarPessoa(PessoaEx12 pessoa){
    String avisoAdicionarAgenda = "";
    for (int i = 0; i < agenda.length; i++){
      if(agenda[i] == null){
        agenda[i] = pessoa;
        avisoAdicionarAgenda = "Pessoa armazenada.";
        break;
      } else {
        avisoAdicionarAgenda = "Agenda cheia.";
      }
    }
    return avisoAdicionarAgenda;
  }

  public void imprimirAgenda(){
    System.out.println("----- LISTA AGENDA -----");
    for (int i = 0; i < agenda.length; i++){
      if (agenda[i] != null){
        System.out.println(i + " - " + agenda[i]);
      } else {
        System.out.println(i + " - vazio");
      }
    }
  }

  public void removerPessoa(int posicaoAgenda){
    for (int i = 0; i < agenda.length; i++){
      if(posicaoAgenda == i){
        agenda[i] = null;
      }
    }
  }

  public void imprimirPessoa(int posicaoAgenda){
    for (int i = 0; i < agenda.length; i++){
      if(posicaoAgenda == i){
        System.out.println(i + " - " + agenda[i]);
        break;
      }
    }
  }

  public void buscarPessoa(String buscarNome){

    for (int i = 0; i < agenda.length; i++){
      if (buscarNome.equals(agenda[i].getNomeAgenda())){
        System.out.println(i + " - " + agenda[i]);
        break;
      }
    }
  }


}
