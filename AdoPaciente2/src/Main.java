import java.util.Scanner;
import java.util.Stack;
/*
genivaldo alves dos anjos
 */

public class Main {

        public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);

            Fila<Integer> fila = new Fila<>();
            Fila<Integer> pref = new Fila<>();

            int opcao = 0;

            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Senha Padrão");
                System.out.println("2 - Senha Preferencial");
                System.out.println("3 - Remover senha da fila");
                System.out.println("4 - Verificar se a fila está vazia");
                System.out.println("5 - Verificar o tamanho da fila");
                System.out.println("6 - Verificar o primeiro elemento da fila");

                System.out.println("0 - Sair");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite senha a ser adicionado:");
                        int elemento = sc.nextInt();
                        fila.enfileirar(elemento);
                        System.out.println("Senha adicionado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Digite senha preferencia a ser adicionado:");
                        int elementopref = sc.nextInt();
                        fila.enfileirar(elementopref);
                        System.out.println("Senha adicionado com sucesso!");

                        break;
                    case 3:
                        try {
                            int elementoRemovido = fila.desenfileira();
                            System.out.println("Senha " + elementoRemovido + " removido com sucesso!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("A fila está vazia? " + fila.estaVazia());
                        break;
                    case 5:
                        System.out.println("Tamanho da fila: " + fila.tamanho());
                        break;
                    case 6:
                        try {
                            System.out.println("Primeira senha da fila: " + fila.espiar());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } while (opcao != 0);
            sc.close();
        }


    }