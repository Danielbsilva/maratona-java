package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.test;
/* Crie um sistema que gerencie seminários
 *
 * O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
 *
 * Um aluno poderá estar em apenas um seminário
 * Um seminário poderá ter nenhum ou vários alunos
 * Um professor poderá ministrar vários seminários
 * Um seminário deve ter um local
 *
 * Campos básicos (excluindo relacionamento)
 * seminário: título
 * aluno: nome e idade
 * professor: nome, especialidade
 * local: endereço
 */

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio.Seminario;

public class ExercicioAssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Centro comunitário de Konoha");

        Seminario seminario1 = new Seminario("Como melhorar seu Ninjutsu");
        Seminario seminario2 = new Seminario("Taijutsu: a porradaria ninja!");
        Seminario seminario3 = new Seminario("A arte ninja da espionagem do banheiro feminino");
        Seminario seminario4 = new Seminario("Ambu: a elite dos ninjas de konoha!");

        Seminario[] seminariosKakashi1 = {seminario1};
        Seminario[] seminariosKakashi2 = {seminario4};
        Seminario[] seminariosGai = {seminario2};
        Seminario[] seminariosJiraya = {seminario3};

        Aluno aluno1 = new Aluno("Naruto Uzumaki", 13);
        Aluno aluno2 = new Aluno("Sasuke Uchiha", 14);
        Aluno aluno3 = new Aluno("Sakura Haruno", 13);
        Aluno aluno4 = new Aluno("Rock Lee", 14);

        Professor professor1 = new Professor("Kakashi Sensei", "Ninjutsu");
        Professor professor2 = new Professor("Gai Sensei", "Taijutsu");
        Professor professor3 = new Professor("Jiraya Sensei", "Ero Jutsu");


        Aluno[] alunosSeminario1 = {aluno1, aluno3};
        Aluno[] alunosSeminario2 = {aluno4};
        Aluno[] alunosSeminario3 = {};
        Aluno[] alunosSeminario4 = {aluno2};

        System.out.println("--- Seminário ---");
        seminario1.setLocal(local);
        professor1.imprime();
        seminario1.setAlunos(alunosSeminario1);
        professor1.setSeminario(seminariosKakashi1);
        seminario1.imprime();

        System.out.println("-----------------");

        seminario2.setLocal(local);
        professor2.imprime();
        seminario2.setAlunos(alunosSeminario2);
        professor2.setSeminario(seminariosGai);
        seminario2.imprime();

        System.out.println("-----------------");

        seminario3.setLocal(local);
        professor3.imprime();
        seminario3.setAlunos(alunosSeminario3);
        professor3.setSeminario(seminariosJiraya);
        seminario3.imprime();

        System.out.println("-----------------");

        seminario4.setLocal(local);
        professor1.imprime();
        seminario4.setAlunos(alunosSeminario4);
        professor1.setSeminario(seminariosKakashi2);
        seminario4.imprime();

    }
}
