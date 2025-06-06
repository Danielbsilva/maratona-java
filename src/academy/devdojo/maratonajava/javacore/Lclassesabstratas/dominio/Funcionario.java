package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

//Funcionario extends Pessoa (classe abstrata que herda outra classe abstrata)
public abstract class Funcionario extends Pessoa{
    //classe abstrata faz com que esta classe, que sem o abstract pudesse ser instanciada, agora não é mais permitido
    //não é possível mais criar algo concreto com ela
    //metodos não tem corpo
    //classes não podem ser instanciadas
    //metodos abstratos só podem existir dentro de classes abstratas
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    //este método pertence a classe Pessoa e foi herdada por Funcionario
    //ao herdar de Pessoa, sem a declaração deste método, as classes Desenvolvedor e Gerente apresentam erro
    //erro este que ocorreu pq inicialmente Funcionario herdou Pessoa e não declarou o método abstrato
    //Isto se resolve de duas formas, podemos declarar o método dentro de Funcionario, e as classes Gerente e Desenvolvedor herdam tbm o método
    //Ou declaramos dentro das classes Gerente e Desenvolvedor
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();
}
