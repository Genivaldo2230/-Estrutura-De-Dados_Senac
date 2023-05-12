public class Avore {
    No root = null;  //No pai ou Raiz

    public void insert(int info,No place){ //algoritimos para inserir uma informação
        if(place == null) {  //Se o local esta vazio entao a avore esta vazia
            root = new No(info); //eo root vai receber o novo Nó
            System.out.println(" " + info); //imprimir inofrmação inserida
        }else if(info < place.info) { //senao, se informaçãoe menor do que a do local
            if ( place.left == null ) {
                place.left = new No(info);
                System.out.println(" " + info);
            } else {
                insert(info,place.left);
            }
        }else if(info > place.info){
            if(place.right == null) {
                place.right = new No(info);
                System.out.println(" " + info);
            }else{
                insert(info,place.right);
            }
        }

    }
    public void preOrder(No place){
        System.out.println(" " + place.info);
        if(place.left != null){
            preOrder(place.left);
        }
    }
    public void inOrder(No place){
        if(place.left != null){
            inOrder(place.left);
        }
        System.out.println(" " + place.info);
        if(place.right != null){
            inOrder(place.right);
        }
    }



}
