package CalcularConbustivel;
/*Desenvolver uma aplicação utilizando a linguagem JAVA e os conceitos da
 Aula 02 e Aula 03, sobre Array e manipulação de dados.
Descrever a situação e/ou problema (tema livre);
Criar uma Classe Vetor com todos os métodos para manipular os dados;
Criar uma Classe para testar a aplicação, possibilitando a interação com o usuário, para manipular os dados;*/
public class CalcularConsumo {

    private int kilometragem;
    private  int litros = 0;
    private int kmRodado;

    public CalcularConsumo() {   }

    public CalcularConsumo(int kilometragem, int litros, int kmRodado) {
        this.kilometragem = kilometragem;
        litros = litros;
        this.kmRodado = kmRodado;
    }


    public int getKilometragem() {
        this.kilometragem = kilometragem;
        return kilometragem;
    }

    public int getLitros(int i) {
        this.litros = litros;
        return this.litros;
    }
    public int getKmRodado() {
        this.kmRodado = kmRodado;
        return kmRodado;
    }




}
