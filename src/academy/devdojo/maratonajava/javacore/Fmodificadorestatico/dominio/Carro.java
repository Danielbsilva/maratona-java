package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite;

    //uma propriedade que seja independente do objeto
    //que afete a instância carro em si e os objetos criados a partir dele
    //para isso, precisamos criar um modificador estático

    //não é obrigatório, mas pelas convenções de código do java, o modificador estático vem
    //depois do modificador de acesso e antes do tipo, exemplo:
    //private STATIC double velocidadeLimite;

    //ao utilizar o modificador estático, você informa que o atributo velocidadeLimite,
    //agora pertence a classe Carro em si e não mais ao objeto/instância.

    //O que lembrar sobre modificadores de acesso estático
    //Faz com que o atributo agora pertença a classe
    //e todos os objetos vão compartilhar desse mesmo valor

    //As boas práticas de código indicam que é indicado criar um método estático quando os métodos
    // não acessam uma variável/atributo da instância

    //dentro de métodos estáticos você não pode usar variáveis
    //que não são estáticas mas o contrário é possível
    public Carro (String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        //Devido ao modificador estatico no atributo velocidadeLimite, ele não mais é um atributo de instância
        //agora ele é um atributo que pertence a classe, o que significa que velocidadeLimite não pode ser referenciado
        //por exemplo, não podemos mais utilizar this.velocidadeLimite = velocidadeLimite;

        //obs.: this é um método de referência para instâncias, se um método usa o modificador estático, o java entende
        //que não há certeza de que vá existir uma instância, então não é possível referenciar com this, porém
        //se tomarmos como exemplo o método 'public void imprime(){}', ele não tem o modificador estático, e por causa disso
        //o java entende que há chances de que um objeto seja instânciado, o que permite utilizar o this para referenciar
        //o atributo velocidadeLimite
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
