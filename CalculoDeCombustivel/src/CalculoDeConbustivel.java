public class CalculoDeConbustivel {
    /*Desenvolver uma aplicação utilizando a linguagem JAVA e os conceitos da
       Aula 02 e Aula 03, sobre Array e manipulação de dados.
      Descrever a situação e/ou problema (tema livre);
      Criar uma Classe Vetor com todos os métodos para manipular os dados;
      Criar uma Classe para testar a aplicação, possibilitando a interação com o usuário, para manipular os dados;*/

    private int kilometragem;
    private int litros = 0;
    private int kmRodado;
    private double precoLitro;

    public CalculoDeConbustivel(int kilometragem, int litros, int kmRodado, double precoLitro) {
        this.kilometragem = kilometragem;
        this.litros = litros;
        this.kmRodado = kmRodado;
        this.precoLitro = precoLitro;
    }

    public CalculoDeConbustivel() {
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

