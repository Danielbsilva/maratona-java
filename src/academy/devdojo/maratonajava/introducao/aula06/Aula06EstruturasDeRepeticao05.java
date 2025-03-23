package academy.devdojo.maratonajava.introducao.aula06;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Uso do continue;
        double valorCarro = 30000;
        //O for normalmente não aceita esse formado de declaracao de variável, então nestes casos, precisamos forçar
        //utilizando um case
        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela-- ) {
            double valorParcela = valorCarro / parcela;
            //A estrutura acima vai pegar a variável valorCarro (30000) e dividir trinta mil vezes até chegar em 1,
            //ao usarmos o print, o computador processa todas as divisões, aumentando o processamento.
            if(valorParcela < 1000){
                continue;
            //Por isso este if foi criado, aqui, informamos ao programa que, de todas as divisões que ele for fazer, se
            //o valor delas for menor que mil, o código volta a executar a divisão, e isto só ocorre devido ao 'continue;'
            //o código só vai imprimir valores, quando a divisão entre o valorCarro e a parcela for acima ou igual a 1000
            }
            System.out.println("O carro pode ser dividido em até " + parcela + "x no valor de R$" + valorParcela + ".");

        }
    }
}
