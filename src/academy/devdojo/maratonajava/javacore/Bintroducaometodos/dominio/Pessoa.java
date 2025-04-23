package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    //Com o atributo privado, não é possível acessa-lo fora da classe, para isso
    //é necessário criar um novo método para permitir o acesso
    private String nome;
    private int idade;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    /* Uma das convenções mais fortes o java e precisa seguir essa regra
     * Toda vez que você esta criando um método para colocar um valor dentro
     * e um atributo, você começa digitando a palavra "set"
     * ao utilizar o set, é necessário declarar um argumento no método sem retorno, então é void
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }
    /* Ao usar o get, o método obrigatoriamente precisa retornar algo, então ele
     * deixa de ser um void e passa a ser um método com atributo
     */
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
