package Projeto_Temperatura;

import java.util.Scanner;

public class Projeto_TemperaturaPag19 {
    public static void main(String[] args) {

        double[] temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixos;
        soma = 0;
        Scanner sc = new Scanner(System.in);
        for (contador = 0; contador < 7; contador++) {
            System.out.println("Digite a " + (contador + 1) + "TEMPERATURA : ");
            temperatura[contador] = sc.nextDouble();
            soma = soma + temperatura[contador];
        }
        media = soma / 7;
        dias_acima = 0;
        dias_abaixos = 0;
        for (contador = 0; contador < 7; contador++) {
            if (temperatura[contador] > media) {
                dias_acima = dias_acima + 1;
            }
            if (temperatura[contador] < media) {
                dias_abaixos = dias_abaixos + 1;
            }
        }
        System.out.println("A média da temperatura é " + media);
        System.out.println("A quantidade de Dias Acima da media é = " + dias_acima);
        System.out.println("A quantidade de Dias Abaixo da media é = " + dias_abaixos);


        {

        }
    }
}
