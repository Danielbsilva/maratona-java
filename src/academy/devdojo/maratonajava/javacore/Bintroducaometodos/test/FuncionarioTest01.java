package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1452.31, 1620.53, 1910.60});

        funcionario.imprimeDados();

        funcionario.imprimeMediaSalarial();
    }
}
