package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

//aula 48 - parametros tipo primitivo
public class CalculadoraTest04 {
    public static void main(String[] args) {
        /* a = 1 e b = 2 são copiados para numero1 e numero2
         * Dentro do método, você muda s valores de numero1 e numero2 para 99 e 33, mas essas mudanças afetam apenas as cópias
         *  Fora do método, a e b continuam com os valores originais 1 e 2, porque não foram alterados diretamente, só suas cópias
         *  é como se você tivesse duas folhas de papel:
         * Você escreve 1 e 2 nas suas folhas(a e b)
         * Depois, você tira cópias dessas folhas e as dá para o método numero1 e numero2
         * O método rabisca as cópias e escreve 99 e 33
         * MAs as folhas originais (a e b) ainda estão intocadas com 1 e 2
         */
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro do CalculaduraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
