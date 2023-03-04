package AulaN03_Dia23_02;
import java.util.Arrays;
public class Testes {
    public static void main(String[] args) throws Exception {
        VetorObject vetor = new VetorObject(5);

        Contato c1 = new Contato("Genivaldo", "1196092-0552", "gda_anjos@hotmail.com");
        Contato c2 = new Contato("Genivaldo", "1196092-0552", "gda_anjos@hotmail.com");
        Contato c3 = new Contato("Genivaldo", "1196092-0552", "gda_anjos@hotmail.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println(vetor);


    }
}
