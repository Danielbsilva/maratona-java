package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição é que o valor da parcela tem que ser maior ou igual a mil.

        double valorCarro = 50000;
        for (int parcela = 1; parcela <= valorCarro; parcela++ ) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("O carro pode ser dividido em até " + parcela + "x no valor de R$" + valorParcela + ".");
        }
    }
}
