package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        //Dado um determinado salário, eu quero saber qual o valor que eu tenho que pagar em taxas
        //0 ~ 34.712 - 9.70%
        //34.713 ~ 68.507 - 37.35%
        //68.508 - 49.50%

        double salarioAnual = 15682;
        double taxaPrimaria = 9.70 / 100; // A porcentagem também pode ser calculada desta forma 9.70 / 100
        double taxaSecundaria = 37.35 / 100; // A porcentagem também pode ser calculada desta forma 37.35 / 100
        double taxaFinal = 49.50 / 100; // A porcentagem também pode ser calculada desta forma 49.50 / 100
        double valorImposto;


        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * taxaPrimaria;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * taxaSecundaria;
        } else {
            valorImposto = salarioAnual * taxaFinal;
        }
        System.out.println("O valor de imposto a ser pago sobre o seu salário anual é de R$" + valorImposto);




    }
}
