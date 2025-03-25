package academy.devdojo.maratonajava.introducao.aula08;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //primeiro array 1, 2, 3, 4, 5 Meses
        //segundo array 31, 28, 31, 30 dias

        //um array multidimensional pode ter varias posicoes, não apenas duas
        //exemplo int [][][][] dias = new int [1][][][]
        int[][] dias = new int [3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 30;

        /*      i[0]                   i[1]                   i[2]
         j[0]   j[1]   j[2]  |  j[0]   j[1]   j[2]  |  j[0]   j[1]   j[2]
          31     28     30       31     28     30       31     28     30
         */
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------------------------------");
        for (int[] arrayBase : dias) {
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
