package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;



    //construtor ele não tem nenhum tipo de retorno, absolutamente nada.
    //sintaxe para o construtor, exemplo
    //modificador de acesso(public) seguido do nome da classe(Anime)
    //construtores te obrigam a seguir determinadas regras(somente se for passado parametros, por exemplo
    //se eu quiser que a classe Anime só seja inicializada se ela tiver um nome, posso adicionar
    //esta regra ao meu construtor
    //o construtor ele é executado antes de qualquer método
    //Obs.: Não confundir construtor com método
    //o método para ser inicializado, ele precisa informar se vai ou não retornar algo
    //ou seja, você precisa dizer se ele é do tipo void(não retorna nada)
    //ou se ele tem um atributo (public 'INT' exemplo(){) com retorno
    public Anime(String nome, String tipo, int episodios, String genero){
        //assim, eu informo que, eu não posso ter a classe Anime estes parametros
        //usamos this para referencia algo dentro do código, mas no caso de usa-lo dentro do construtor
        //só o 'this' já vai estar referenciando o próprio construtor ou a sobrecarga
        //this(); só pode ser usado dentro do corpo do construtor, tentar usar fora dele ocorrerá em erro
        //e ele precisa ser OBRIGATORIAMENTE a primeira linha do construtor
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    //porém, não consigo inicializar um novo objeto com Anime
    //pq o construtor me obriga a passar os mesmos parametros, para isso
    //podemos usar a sobrecarga
    //ao sobrecarregar um construtor sem parametros ou com parametros diferentes
    //o java permite que eu consiga novamente instanciar um novo objeto
    //com os mesmos ou diferentes parametros
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
/*
    //sobrecarga de métodos é quando temos 2 funções com o mesmo nome
    //mas a quantidade ou tipos de parametros diferentes
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
*/
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
