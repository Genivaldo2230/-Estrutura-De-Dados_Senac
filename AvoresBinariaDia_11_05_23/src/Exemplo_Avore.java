import java.util.Random;

public class Exemplo_Avore {
    public static void main(String[] args) {
        Random rd = new Random();
        Avore avore = new Avore();

        for(int i = 0; i<10; i++){
            avore.insert(rd.nextInt(100),avore.root);
        }
        System.out.println("\n PRE-ODER:");
        avore.preOrder(avore.root);

        System.out.println("\n IN-ORDER: ");
        avore.inOrder(avore.root);

        System.out.println("\n POST-ORDER: ");
        avore.preOrder(avore.root);
    }
}
