package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

/* Herança pt01
 * Quando falamos sobre herança, falamos sobre a extensão da funcionalidade das classes
 * Quando estudamos associação, a gente pensa que aquele objeto TEM algo, usando como exemplo
 * o exercicio de associação, o ALUNO, ele TEM um NOME, TEM um seminário
 * Já no caso da Herança, a forma de pensar muda, citando como exemplo a classe Funcionario
 * Funcionario ele É uma pessoa que TEM um nome, ou seja, Funcionario é TUDO que uma Pessoa(classe) é
 * mais alguma coisa, como ter um salário, por exemplo.
 * Mas como passamos isso para o Java? utilizando o extends
 * extends significa que você esta expandindo/extendendo uma classe a partir de outra
 * usando esta classe como exemplo, Funcionario extendo a classe Pessoa, só que com mais funcionalidade
 * Ao usaar extends, informamos que Funcionario agora tem TODOS os ATRIBUTOS e METODOS que Pessoa tem
 */

// Herança pt03
//Não se pode extender multiplas classes
public class Funcionario extends Pessoa {
    private double salario;

    //Heranca pt05
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    //Herança pt04
    //Se eu adiciono um construtor na classe Pessoa, informando que precido que Pessoa tenha um nome
    //obrigatoriamente, Funcionario também É uma pessoa (herança), então eu preciso que Funcionario
    //também tenha os requisitos para criar o objeto da super classe (um construtor como abaixo)
    //resumo: Todas as vezes em que você adiciona um construtor na sua classe mãe e esse construtor agora
    //tem argumento, obrigatoriamente você precisa alterar em todas as classes filhas
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime(){
        //herança pt02
        //super vai buscar tudo que esta dentro do método imprime() da classe mais genérica
        //que neste caso vai ser a classe Pessoa
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
