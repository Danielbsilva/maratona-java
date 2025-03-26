package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
//aula 46 - metodos com retorno
public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultadoDivisao = calculadora.divideDoisNumeros(20, 0);
        System.out.println("Método calculadora.divideDoisNumeros: " + resultadoDivisao);

        //aula 47 - metodos com retorno parte 2
        System.out.println("Método calculadora.divideDoisNumeros2 " + calculadora.divideDoisNumeros2(20, 0));

        System.out.println("Método calculadora.divideDoisNumeros3 " + calculadora.divideDoisNumeros3(20, 2));
        System.out.println("------------------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
