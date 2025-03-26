package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import static academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora.somaDoisNumeros;
import static academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora.subtraiDoisNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();

        //no metodo, você não utiliza o sinal de igual para dar um valor
        //aqui, você coloca o ponto '.', informa o nome do método e finaliza com ();
        int resultadoSoma = somaDoisNumeros(10, 20);
        System.out.println("Resultado da soma: " + resultadoSoma);
        //calculadora.somaDoisNumeros(10, 20);

        int resultadoSubtracao = subtraiDoisNumeros(30, 15);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        //calculadora.subtraiDoisNumeros(30, 15);
    }
}
