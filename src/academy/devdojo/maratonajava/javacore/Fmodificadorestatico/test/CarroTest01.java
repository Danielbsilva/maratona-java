package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        //Antes de adicionarmos o modificador estático, a linha de código abaixo altera apenas
        //a instância que ela foi criada, ou seja, Carro c1 = new Carro();
        //porém, ao adicionarmos o modificador estático, qualquer alteração feita nos objetos,
        //vai agora afetar todos os outros objetos
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
