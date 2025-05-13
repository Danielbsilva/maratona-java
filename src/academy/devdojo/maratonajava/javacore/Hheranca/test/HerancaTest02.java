package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //Herança pt05
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático é executado quando a JVM carregar classe filha
    // 2 - Alocado espaço em memória para o objeto
    // 3 - Cada atributo da classe pai é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    // 5 - Construtor da super classe é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 5 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
