public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento)throws Exception{
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            Object elementos = this.elementos[this.tamanho];
            elemento = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio, "
                    + "não é possível adiconar novos elementos");
        }
    }

    public int tamanho() {
        return this.tamanho;

    }

    public void adiciona(int posicao, Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor ja Estar cheio," +
                    "não é possivel adicionar novos elementos");
        }

    }

    /**
     * @Override. É uma anotação marcadora que deve ser usada apenas
     * com métodos. Serve para indicar que o método anotado está sobrescrevendo
     * <p>
     * um método da superclasse.
     **/
    @Override
    public String toString() {
        /** A classe StringBuilder faz parte do pacote java.Essa classe permite criar e manipular dados de Strings
         * dinamicamente, ou seja,podem criar variáveis de String modificáveis **/
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("] ");//O método append serve para adicionar maisconteúdo ao final de um StringBuffer.

        return s.toString();
    }

    public int busca1(Object elemento) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1; //na pag 53 o return -1 nao esta correto ficando return 0;
    }

    public Object busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else {
            throw new Exception("Posição Invalida ");
        }
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i > posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elementos;
            this.tamanho++;
        } else {
            throw new Exception("Posição Inválida ");
        }
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public void remove(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i > this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição Inválida ");
        }
    }
}