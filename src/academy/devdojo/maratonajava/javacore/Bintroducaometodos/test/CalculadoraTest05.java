package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //public void somaArray(int[] numeros)
        int [] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        //public void somaVarArgs(int... numeros)
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }

}
