package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        //pessoa.idade = 70;
        pessoa.setIdade(-1);
        pessoa.imprimeDados();
    }
}
