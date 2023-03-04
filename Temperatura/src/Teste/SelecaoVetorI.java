package Teste;

public class SelecaoVetorI {
    public static void main(String[] args) {

        double[] A = new double[100];

        for (int i = 0; i < 100; i++) {
             A[i] = i;
           // System.out.println("Valor do vetor = [" +A[i]+ " ] =" + " Indice Valor = " + i);
        }
        for (int x = 0; x <= 99; x++) {
            if (A[x] <= 10.0)
            System.out.println("Indice Valor [" + x + " ] = " + A[x]);
        }
    }
}
