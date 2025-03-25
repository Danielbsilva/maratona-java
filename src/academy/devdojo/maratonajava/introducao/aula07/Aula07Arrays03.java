package academy.devdojo.maratonajava.introducao.aula07;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //diferentes formas de declaração
        int [] numeros = new int[3];
        int [] numeros2 = {1, 2, 3, 4, 5};
        int [] numeros3 = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros3.length ; i++) {
            System.out.println(numeros3[i]);
        }
        //int num: é uma variavel local, pode ser declarada novamente
        //depois das chaves
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
