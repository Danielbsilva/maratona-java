package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
//aula 49 - parametros tipo referencia
public class impressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
