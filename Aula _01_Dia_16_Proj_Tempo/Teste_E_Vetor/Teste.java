package Teste_E_Vetor;

public class Teste {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        try {
            vetor.adiciona("elemento 1 ");
            vetor.adiciona("elemento 2 ");
            vetor.adiciona("elemento 3 ");
            vetor.adiciona("elemento 4 ");
            vetor.adiciona("elemento 5 ");
            vetor.adiciona("elemento 6 ");
            vetor.adiciona("elemento 7 ");
        }catch (Exception e ) {
            e.printStackTrace();

        }


        System.out.println("Quantidade de Elementos         = "+"[ " + vetor.adicionaInicio(0, 0+"elementos 0")+" ] ");
        System.out.println("Quantidade Elementos Preenchido = [ "+vetor.tamanho()+" ] ");
        


        System.out.println("Quantidade Elementos Removido   = "+"[ " + vetor.remove(2)+" ] " +" = " + vetor.tamanho()+" Posição Vetor Removido ");
        System.out.println("Quantidade Elementos Vazios     = " +vetor.toString());
        System.out.println("Quantidade Elementos na Busca   = [ "+vetor.busca(1)+" ] ");
        System.out.println("Quantidade Elementos em Buscar  = [ "+vetor.busca1("elemento 1"+0) +" ] ");
    }
}
