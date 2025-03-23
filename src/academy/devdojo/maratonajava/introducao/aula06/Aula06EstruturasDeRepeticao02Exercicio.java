package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1.000.000
        //int par = i % 2;
        for (int i = 0; i <= 1000000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
