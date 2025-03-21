package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        //int, double, float, char, byte, short, long, boolean
        /** O ato de adicionar (int) a variável é chamada de CAST e é utilizado para forçar
         * um outro tipo de variável dentro de outra.
         * No primeiro exemplo, usamos "L" ao final da varíavel para transformar ela no tipo LONG,
         * porém, ela inicialmente é do tipo INT, então para forçarmos o JAVA a entender,
         * adicionamos um CAST, que neste caso é o (int) no código antes da variável.
         */

        int idade = (int) 1000000000L;
        long numeroGrande = (long)155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";


        System.out.println("A idade é " + idade + " anos");
        System.out.println(false);
        System.out.println(true);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome + "!");
    }
}
