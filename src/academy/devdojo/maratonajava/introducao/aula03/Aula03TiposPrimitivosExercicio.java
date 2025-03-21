package academy.devdojo.maratonajava.introducao.aula03;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/


public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Daniel Barbosa Silva";
        String endereco = "Rua Coronel Antônio Basílio, 236";
        double salario = 2435.25;
        String dataRecebimentoSalario = "05/04/2025";
        //Posso adicionar as variáveis todas dentro do System.out.println ou posso colocar em outra variável
        String relatorio = "Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que receci o salario de "
                + salario + "R$" + ", na data " + dataRecebimentoSalario + ".";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que receci o salario de "
        + salario + "R$" + ", na data " + dataRecebimentoSalario + ".");

        System.out.println("Acima com o texto dentro do System.out.print e abaixo dentro de uma variável.");

        System.out.println(relatorio);
    }
}
