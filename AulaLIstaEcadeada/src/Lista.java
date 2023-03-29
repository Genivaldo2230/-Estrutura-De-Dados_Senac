public class Lista {

    private static boolean remover = true;

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da Lista  = " + lista.getTamanho());

        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        lista.remover("Camilia");
        lista.remover("Miguel");
        lista.remover("Claudio");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = "+ lista.getTamanho());
        System.out.println("Inicio da Lista = "+ lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim(). getElemento());
        System.out.println(remover);


    }

}
