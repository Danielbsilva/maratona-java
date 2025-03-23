package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
        //break: saia do laço quando você chegar em uma condição verdadeira.
        //O break tem que estar dentro de um switch ou loop.
        int maxValor = 50;
        for(int i = 0; i <= maxValor; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
