package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*Crie uma classe Funcionário com os seguintes atributos
 * nome
 * idade
 * salario //três salários devem ser guardados
 *
 * crie dois métodos
 *
 * 1. Para imprimir os dados
 * 2. Para tirar a média dos salários e imprimir o resultado
 */

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for(int i = 0; i < salarios.length; i++){
            System.out.print("Salário: " + salarios[i] + " | ");
        }
    }

    public void imprimeMediaSalarial(){
        //Método que eu criei
        //double media = (salarios[0] + salarios[1] + salarios[2]) / 3;
        //System.out.println(media);



        //Método da revisão (for each)
        double media = 0;
        if(salarios == null){
            return;
        }
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);

        /*Meu método pós revisão (for)
        double medias = 0;
        for(int i = 0; i < salarios.length; i++){
            medias += salarios[i];
            System.out.println(medias);
        }
        medias /= salarios.length;
        System.out.println("\nMédia salarial: " + medias);
        */
    }
}


