import java.util.ArrayList;
import java.util.Scanner;
/*
Utilidade lista de mercado onde vc ja escolher oque vc vai compra coisa do dia a dia
/*
Autor:Genivaldo Alves dos Anjos
 */

public class ListMercado {

    public static void main(String[] args) {
        // Criar um vetor para armazenar os itens da lista de mercado
        ArrayList<String> list = new ArrayList<String>();

        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner keyboard = new Scanner(System.in);

        // Pedir ao usuário para digitar os itens da lista de mercado
        System.out.println("Digite os itens da sua lista de mercado. Digite 'sair' quando terminar.");

        // Criar uma variável String para armazenar o item digitado pelo usuário
        String item = "";

        // Usar um loop while para adicionar itens ao vetor até que o usuário digite "sair"
        while (!item.equalsIgnoreCase("sair")) {
            // Ler o item digitado pelo usuário
            item = keyboard.nextLine();

            // Se o item não for "sair", adicionar ao vetor
            if (!item.equalsIgnoreCase("sair")) {
                list.add(item);
            }
        }

        // Fechar o objeto Scanner
        keyboard.close();

        // Exibir os itens do vetor na tela usando um loop for-each
        System.out.println("Sua lista de mercado contém:");

        for (String s : list) {
            System.out.println(s);
        }
    }
}