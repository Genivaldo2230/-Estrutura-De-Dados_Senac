package Projeto_Temperatura;

import javax.swing.*;

public class Projeto_TemperaturaPag18 {

    public static void main(String[] args) {

        double[] temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixos;
        soma = 0;
        for (contador = 0; contador < 7; contador++) {
            temperatura[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (contador + 1) + "temperatura: "));
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
        JOptionPane.showInputDialog(null, "A média da temperatura é " + media);
        JOptionPane.showInputDialog(null, "A quantidade de dias Acima da media é " + dias_acima);
        JOptionPane.showInputDialog(null, "A quantidade de dias Abaixo da media é " + dias_abaixos);


        {

        }
    }
}
