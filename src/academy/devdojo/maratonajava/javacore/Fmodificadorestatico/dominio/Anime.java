package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //bloco de inicialização estático ele é executado apenas 1 vez quando a
    //classe ela é carregada pela JVM antes mesmo do espaço ser alocado em memória pelo objeto
    //isto acontece para todos os atributos e métodos estáticos
    //Pode ter mais 1 método estático e eles serão executados pela ordem do código
    //e relembrando, não podemos acessar atributos de instância dentro de métodos estáticos
    //Também podemos ter blocos de inicialização não estáticos junto com os estáticos, porém,
    //eles serão executados após todos os blocos de inicialização estáticos serem executados
    // de acordo com a quantidade de objetos que foram criados

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
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

