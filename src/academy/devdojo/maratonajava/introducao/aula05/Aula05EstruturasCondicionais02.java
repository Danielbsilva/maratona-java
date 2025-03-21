package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 17;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
        //Uma outra forma de realizar as condições deixando o código mais limpo

        int idade2 = 17;

        /**
         * Essa string sempre tem que ser inicializada. Se o compilador perceber com ela não vai ser iniciada
         * ele vai acusar um erro. Para isso não acontecer, é preciso "adicionar" um valor vazio ao string
         * exemplo String categoria = ""; dessa forma o compilador entende que caso a variável não seja iniciada
         * o valor dela é "vazio" ou "nada".
        */
        String categoria;
        if (idade2 < 15) {
            categoria = "Categoria Infantil";
        } else if (idade2 >= 15 && idade2 < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
    }
}
