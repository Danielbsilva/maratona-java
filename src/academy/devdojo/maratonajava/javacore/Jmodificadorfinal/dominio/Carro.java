package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;


//aula79
//Quando você deseja que uma determinada classe não seja extendida (usada como herança)
//Você pode utilizar o modificador final nela
//Uma classe final não pode ser extendida
//Dentro do próprio Java há um exemplo de classe final, e essa classe é a String
//Se você não consegue extender a classe, você não tem acesso a sobreescrita dos métodos
//então se você utiliza o modificar final na classe, não há necessidade de utilizar novamente
//em nenhum método desta classe.


public class Carro {
    private String nome;
    //aula 77
    //atributos constantes são aqueles em que uma vez criados eles vão permanecer daquele jeito enquanto o código estiver funcionando.
    //constantes no java tem uma convenção própria
    //1- tudo em UPPERCASE ou CAPSLOCK
    //2- se o atributo tem 2 ou mais palavras, ele é separado por underscore ou underline ex.: VELOCIDADE_LIMITE
    public final static double VELOCIDADE_LIMITE = 250;
    //aula 78
    //a referência que você tem para este objeto, nunca poderá ser alterada
    //variáveis do tipo reference quando são 'finais' o que você não pode alterar é a referência para o objeto
    //quando é util: quando você precisa de apenas um único objeto para realizar uma determinada ação sem a necessidade
    //da criação de outros objetos
    public final Comprador COMPRADOR = new Comprador();
    //aula 79
    //modificador final pra classes e métodos lida diretamente com Heranças

    //aula 79
    //o mesmo funciona para métodos, se você deseja que um método não possa ser sobreescrito
    //você utiliza o modificador final nele
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
