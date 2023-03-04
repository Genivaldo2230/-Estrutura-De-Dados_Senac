package Projeto_Temperatura;

import java.util.Scanner;

public class Temperatura {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double soma = 0;
      double[] temperatura = new double[7];
      for(int i=0; i<7; i++){
         System.out.println("Digite a temperatura do " + (i+1) + " dia");
         temperatura[i]= sc.nextDouble();
         soma += temperatura[i];
      }
      soma = soma/7;
         System.out.println("A media das temperaturas :" + soma);
      }

}