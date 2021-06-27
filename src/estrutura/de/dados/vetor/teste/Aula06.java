package estrutura.de.dados.vetor.teste;

import estrutura.de.dados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(05);
        try {
            vetor.adiciona("Casa");
            vetor.adiciona("Teste");
            vetor.adiciona("Pedro");
            vetor.adiciona("Cachorro");
            vetor.adiciona("Cenoura");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.elementoExiste("Gato"));
    }
}
