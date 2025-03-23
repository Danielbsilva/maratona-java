package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Estruturas de repetição
        // while, do while, for
        //Igual ao IF, a sintaxe necessita ser um valor booleano
        int count = 5;
        while (count < 10) {
            System.out.println("Dentro da estrutura de repetição while");
            System.out.println(count); //Também pode ser feito assim (count++)
            //Enquanto executando o while, precisamos mudar o 'corpo' dentro do escopo
            //Da forma que esta agora, ele ira executar eternamente o código, já que 0 sempre será menor que 10
          count += 1;
          //count++;
        }
        //Enquanto count1 for menor que 10, o programa irá imprimri "Dentro da estrutura de repetição do-while"
        int count1 = 8;
        do {
            System.out.println("Dentro da estrutura de repetição do-while");
        } while (count1++ < 10);

        //Primeiro você declara a variável int i = 0;
        // Segundo você informa até onde o laço de repetição vai ser executado i < 10;
        // Terceiro como você vai alterar o status da variável i++;
        for(int i=0; i < 10; i++) { //para i começando de zero; até o i ser menor do que 10; incrementando de 1 em 1, faça
            System.out.println("Dentro da estrutura de repetição do for " + i);
        }
    }
}

