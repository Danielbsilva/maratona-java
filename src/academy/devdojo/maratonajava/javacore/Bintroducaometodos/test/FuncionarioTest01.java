package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1452.31, 1620.53, 1910.60};

        funcionario.imprimeDados();

        funcionario.imprimeMediaSalarial();
    }
}
