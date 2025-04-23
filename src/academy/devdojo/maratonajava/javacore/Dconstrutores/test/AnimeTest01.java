package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //adicionado o construtor na classe Anime, agora meu objeto necessita de um nome
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Pierrot");
        //anime.init("Akudama Drive", "TV", 12, "Ação");

        //Agora consigo criar um novo objeto após a sobrecarga dos construtores
        //Anime anime2 = new Anime();
        anime.imprime();
    }
}
