public class Construtor {
    public static class Aluno {
        private String nome;
        private int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }

    public static class CircularLinkedList {
        private Node head;
        private int size;

        private class Node {
            private Aluno aluno;
            private Node next;

            public Node(Aluno aluno) {
                this.aluno = aluno;
            }
        }

        public CircularLinkedList() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int getSize() {
            return size;
        }

        public void addNode(Aluno aluno) {
            Node newNode = new Node(aluno);
            if (isEmpty()) {
                head = newNode;
                newNode.next = head;
            } else {
                Node current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.next = head;
            }
            size++;
        }

        public void displayList() {
            if (isEmpty()) {
                System.out.println("Lista vazia");
            } else {
                Node current = head;
                do {
                    System.out.print(current.aluno.getNome() + " ");
                    current = current.next;
                } while (current != head);
                System.out.println();
            }
        }

        public void removeNode(Aluno aluno) {
            if (isEmpty()) {
                System.out.println("Lista vazia");
            } else {
                Node current = head;
                Node previous = null;
                while (current.next != head) {
                    if (current.aluno.equals(aluno)) {
                        break;
                    }
                    previous = current;
                    current = current.next;
                }
                if (current == head && current.aluno.equals(aluno)) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else if (current != head && current.aluno.equals(aluno)) {
                    previous.next = current.next;
                } else {
                    System.out.println("Aluno não encontrado");
                }
                size--;
            }
        }
    }



}
