package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    //metodos são parecidos com atributos, mas sua funcionalidade é completamente diferente
    //a primeira parte de um método sempre vai ser um modificador de acesso
    //a segunda parte é o retorno (retorna ou não alguma coisa)
    //exemplo: te dou uma maça e você corta em dois pedaços. O ato de cortar a maçã é o metodo e ao devolver os 2 pedaços
    //ele retorna algo para você, ou pode não devolver os dois pedaços da maçã, de toda forma, o método foi executado.

    //modificador de acesso = public
    //void = vazio | significa que este método não vai retornar nada.
    //alterando de void para int para resumo após vídeo 02 do dev magro "desafio do zero a vaga

    //IMPORTANTE!!! se o objeto for estático "public static", ele não pode ser instanciado, ou seja
    //não posso criar um objeto, exemplo: Calculadora calculadora = new Calculadora();
    //Ao instanciar um objeto, você cria uma cópia dele, ao usar o objeto original (usando static), você não cria uma cópia
    //usamos o método e funçao original. De acordo com o devmagro, seu uso é raro, usado em casos de que você precisa
    //chamar uma determinada função apenas 1 vez
    public static int somaDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraiDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    //aula 45 - passagem de parametros
    //boas práticas: não deixar o método ter mais do que 3 argumentos
    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    //aula 46 - metodos com retorno
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    //aula 47 - metodos com retorno parte 2
    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            //esse tipo de uso do return só pode ser feito quando o método é vazio (void), ele acaba servindo como
            //um "break" improvisado.
            //lembrando que else tbm funciona no lugar do return.
            return;
        }
        System.out.println(num1 / num2); //Sem o else a lógica 'funciona', mas mesmo que num == 0, o código continua
    }

    //aula 48 - parâmetros tipo primitivo
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("-----------------------------------------");
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
}

