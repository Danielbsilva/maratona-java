package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //Em qualquer lugar da classe, mas geralmente se coloca no começo
    //antes dos construtores e depois dos atributos
    //você abre e fecha as chaves {}
    //exemplo de bloco de inicialização ou "instância"
    //como o nome diz, esse bloco SEMPRE vai ser executado quando o cógido
    //for iniciado
    //1 - Alocado espaço em memória para o objeto
    //2 -Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

