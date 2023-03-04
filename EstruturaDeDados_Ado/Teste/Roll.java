package Teste;

import java.util.Random;

public class Roll {
    public static void main(String[] args) {

        Random randomNumbrs = new Random(); // gerador de Numeros Aleatorios..

        int[] frequency = new int[7]; // vetor criado com 7 Posição a ser usadas

        //Lança dados 6000 vezes ; utilizando o valor do dados como indice de frequencyacriando laço de leitura do vetor
        for (int roll = 1; roll <= 6000; roll++) {
            ++frequency[1 + randomNumbrs.nextInt(6)];

            System.out.printf("%s%10s\n", "face ", "Frequency");
        }
        for (int face = 1; face <= frequency.length; face++) {
            System.out.printf(" %4d%10d\n", face, frequency[face]);
        }


    }
}
