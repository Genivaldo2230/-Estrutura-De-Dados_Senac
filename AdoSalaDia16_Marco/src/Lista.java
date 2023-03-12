

public class Lista<T> extends Estrutura<T> {
    // método Construtor com parâmetros o super proque está herdando ...
    public Lista(int capacidade) {

        super(capacidade);
    }
    // método Contrutor sem Parâmetros
    public Lista() {
        super();
    }

    public boolean adiciona(T elemento){

        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){

        return super.adiciona(posicao, elemento);
    }

}

