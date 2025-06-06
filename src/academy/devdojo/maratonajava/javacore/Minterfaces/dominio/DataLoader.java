package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

//ao criar uma interface, não usamos mais 'public class' e sim 'public interface'
public interface DataLoader {

    //regra padrão de interfaces no java
    //dentro da interface no java, por padrão o metodo ele vem como 'public abstract'
    //então você pode adicionar ao código, mas não é necessário.

    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    //default permite transformar este método de algo abstrato para algo concreto.
    //normalmente, ao criarmos um método abstrato, por regra, este método precisa ser implementado nas outras classes/interfaces
    //que estão utilizando o implement, porém, utilizando default, essa regra não mais é obrigatória
    //permitindo que possamos implementar ele em interfaces/classes separadas.
    public default void checkPermission(){
        System.out.println("Fazendo chegagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface DataLoader");
    }
}
