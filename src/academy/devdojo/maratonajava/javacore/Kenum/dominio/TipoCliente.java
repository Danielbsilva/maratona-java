package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    //Tipo especial de classe
    //Onde todos os atributos que são criados são constantes
    //E que representação esta enumeração e não podem ser alterados
    //Aqui a classe esta separada, mas é possível criar uma enumeração dentro de outra classe
    //   nome                                  tipo
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public int valor;
    public String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        //método para retornar algo baseado no atributo que desejar
        /*
            Essa busca por atributos esta mais relacionado com boas práticas do que qualquer outra coisa.
            Se o banco de dados não conter o nome "PESSOA_FISICA" OU "PESSOA_PUBLICA", você pode utilizar esse método para verificar qual é.
            Isso serve também para mensagens no console, gerar uma string "essa é uma pessoa física" para se comunicar com o usuário, etc. 
            É somente uma forma de encontrar o que o ID (identificador) daquele ENUM se refere.
         */
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
