package academy.devdojo.maratonajava.introducao.aula07;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //padrão de inicialização dos arrays
        //byte, short, int, long, float e double o valor é 0
        //char 'u0000' ' '
        //boolean false
        //string null

        //O tamanho do array não pode ser mudado dinamicamente.
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < 3; i++){
            System.out.println(nomes[i]);
        }
    }
}
