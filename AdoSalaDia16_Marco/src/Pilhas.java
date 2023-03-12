public class Pilhas extends Estrutura {

        private int[] elementos;
        private int topo;     

        public Pilhas() {
            int tamanho = 0;
            this.elementos = new int[tamanho];
            this.topo = -1;
        }

        public void empilhar(int elemento) {
            if (this.topo < this.elementos.length - 1) {
                this.topo++;
                this.elementos[this.topo] = elemento;
            }
        }

        public int desempilhar() {
            if (this.topo >= 0) {
                int elemento = this.elementos[this.topo];
                this.topo--;
                return elemento;
            }
            return -1;
        }

        public boolean estaVazia() {
            return this.topo == -1;
        }
    }

