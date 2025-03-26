package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;
//aula 49 - parametros tipo referencia
public class impressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        //esse objeto esta aqui para demonstrar que, ao rodar este metodo na classe EstudanteTest01
        //ele vai imprimir os valores que estão declarados em .nome (diferente de "gohan" e substituir por "gohan".
        estudante.nome = "Gohan";
    }
}
