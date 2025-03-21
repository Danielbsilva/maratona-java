package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //O programa só irá executar o print se a condicão for verdadeira (true)
        if (true) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        //Exemplo
        if (false) {
            System.out.println("Estou dentro do if?");
        }

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a compra de bebidas alcoólica");
        }else{
            System.out.println("Não autorizado a comprar bebidas alcoólicas");
        }
        //! NOT pode ser usado para negar algo, igual a este código abaixo
        //if (isAutorizadoComprarBebida == false)
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebidas alcoólicas");
        }
    }
}
