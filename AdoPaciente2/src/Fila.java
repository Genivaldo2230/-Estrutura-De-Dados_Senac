/*
genivaldo alves dos anjos
 */

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }
    public void enfileira (T elemento){
        //this.aumentaCapacidade();
        //this.elementos[this.tamanho]=elemento;
        //this.tamanho++;
        //vamos aproveitaro codigo que ja existe
        this.adiciona(elemento);
    }


    public void enfileirar(T elemento) {
    }

    public T desenfileira() {
        return null;
    }
}
