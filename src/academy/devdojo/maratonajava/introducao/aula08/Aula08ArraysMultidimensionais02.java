package academy.devdojo.maratonajava.introducao.aula08;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][0];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("arrayInt2");
        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("-------");
            for (int num : arrayBase2) {
                System.out.print(num + " ");
            }
        }
    }
}



