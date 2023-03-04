package Aula4_Marco_Dia2;

public class Lista<T> extends EstruturaEstatica<T> {
    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
        super();
    }

    public boolean adiciona(T elementos) {
        return super.adiciona(elementos);
    }

    public boolean adiciona(int posicao, T elementos) {
        return super.adiciona(posicao, elementos);
    }
}

