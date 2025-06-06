package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

//na interface não utilizamos 'extends' para herdar de outra classe
//em interface, usamos 'implements' que serve para implementar a interface na classe
//diferente das classes, na interface podemos implementar mais de uma interface por vez


//um modificador de acesso nunca pode ser mais restritivo do que o que esta na superclasse
//exemplo, na interface DataLoader, o método load tem o modificador public, se eu sobreescrever
//o método nesta classe, ele precisa ser public, pq não tem nenhum modificador mais liberal que o public
//modificadores de acesso do mais restritivo para o mais liberal
//private -> default -> protected -> public
public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }

    public void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }

}
