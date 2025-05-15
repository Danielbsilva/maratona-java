package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;


    //@Override aqui é usado para ter certeza absoluta que estamos
    //sobreescrevendo o método toString()
    //2 regras precisam ser seguidas
    // 1 - O nome precisa ser o mesmo e a quantidade de parâmetros também
    // 2 - o tipo de retorno tem que ser a classe ou alguma subclasse(se chama covariância de retorno)
    // e o modificador de acesso nunca pode ser mais restritivo (exemplo: trocar o public pelo protected)
    // isso acarretaria um erro
    @Override
    public String toString(){
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
