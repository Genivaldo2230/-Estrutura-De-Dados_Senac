package Teste;


import java.util.Scanner;

public class new2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeros = 0;
        numeros = sc.nextInt();

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numeros;
            System.out.println(" Vetor De Nº = " + " [ " +  " ] " + " Indice Valor = " + i);

        }
    }
}