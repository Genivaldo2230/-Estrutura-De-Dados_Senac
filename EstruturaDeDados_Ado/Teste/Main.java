package Teste;

public class Main {

    public static void main(String[] args) throws Exception {

        int menor = 0, posMenor = 0;

        int[] vetor = {1, 2, 3, 4, 5, -6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(" Vetor De Nº = " + " [ " + vetor[i] + " ] " + " Indice Valor = " + i);
        }
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                menor = vetor[i];
                posMenor = i;
            } else if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posMenor);

     }

}

