package dozeroavaga.devmagro.desafios.desafio01.dominio;

public class CalculadoraPrimos {
    // Criar uma calculadora que verifica se um número é primo ou não.
    // retorno: true se for primo, false caso contrário.
    public int verificaNumeroPrimo(int numero1) {

        if (numero1 % 2 == 0) {
            System.out.println("É um número primo.");
            return 0;
        }
        System.out.println("Não é um número primo.");
        return 1;
    }



}
