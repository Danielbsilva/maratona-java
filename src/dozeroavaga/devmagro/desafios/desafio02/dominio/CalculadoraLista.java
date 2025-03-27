package dozeroavaga.devmagro.desafios.desafio02.dominio;

public class CalculadoraLista {
    // Criar uma calculadora que recebe uma lista/array e retorna a lista
    // com seus valores multiplicados por 2
    public int listaNumeros(int num1, int num2, int num3) {

        int [] numeros = new int [3];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i] * 2);
        }
        return 0;
    }
}

