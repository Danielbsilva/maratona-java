package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        /* Crie uma classe carro com os seguintes atributos
         * nome
         * modelo
         * ano
         *
         * Em seguida, crie dois objetos distintos e imprima seus valores.
         */
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Yaris";
        carro1.ano = 2021;
        carro1.modelo = "XL";

        carro2.nome = "Agile";
        carro2.ano = 2012;
        carro2.modelo = "LTZ";

        //Referenciando um objeto em outro objeto
        carro1 = carro2;

        System.out.println("\nPrimeiro carro:");
        System.out.println("Carro: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano:" + carro1.ano);
        System.out.println("\nSegundo carro: ");
        System.out.println("Carro: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano:" + carro2.ano);

    }
}
