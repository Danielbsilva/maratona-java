package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //no metodo, você não utiliza o sinal de igual para dar um valor
        //aqui, você coloca o ponto '.', informa o nome do método e finaliza com ();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
    }
}
