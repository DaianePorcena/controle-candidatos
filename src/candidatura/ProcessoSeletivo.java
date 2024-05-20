package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo - Candidatura de Emprego");
    imprimirSelecionados();
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de número " + (indice + 1) + " é: " + candidatos[indice]);
    }

    System.out.println("Forma abreviada de interação for-each");

    for (String candidato : candidatos) {
      System.out.println("O candidatoselecionado foi: " + candidato);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

      if (salarioBase > salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
}