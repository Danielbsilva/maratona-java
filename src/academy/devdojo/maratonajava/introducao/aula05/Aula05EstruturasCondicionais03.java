package academy.devdojo.maratonajava.introducao.aula05;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //Operador Ternário
        // String resultado = (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        //Para diminuir o código e deixar mais limpo, também pode ser feito desta forma
        String resultado2 = salario > 5000 ? "Eu vou doar 5000 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        //Dessa forma, eliminamos 2 variáveis (mensagemDoar e mensagemNaoDoar)

        System.out.println(resultado2);
    }
}
