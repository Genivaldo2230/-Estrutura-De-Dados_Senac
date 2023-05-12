public class No {

    int info;
    int level;
    No left;
    No right;

    public No(int info) { //Metodo Contrutor para inicializar os atributos da classe
        this.info = info; //inicializa inofrmaçãocom paramentro recebidos
        this.left = null; //inicializar o filho a direitas como vazio
        this.right = null; //inicializar o filho a esquerda como vazio
    }
}

