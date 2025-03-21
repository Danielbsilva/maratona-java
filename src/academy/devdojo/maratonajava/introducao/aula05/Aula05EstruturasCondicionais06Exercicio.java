package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utiizando switch, faça um programa que dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo - final de semana");
                break;
            case 2:
                System.out.println("Segunda-feira - dia útil");
                break;
            case 3:
                System.out.println("Terça-feira - dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira - dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira - dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira - dia útil");
                break;
            case 7:
                System.out.println("Sábado - final de semana");
                break;
            default:
                System.out.println("Opção Inválida");
        }
        //Também há a possibilidade de ser feito de outra maneira utilizando switch para diminuir o código e tornar mais limpo
        byte dias = 2;
        switch (dias) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
