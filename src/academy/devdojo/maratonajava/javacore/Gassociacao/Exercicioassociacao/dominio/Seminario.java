package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio;

import sun.invoke.empty.Empty;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    //private Professor professor;

    public Seminario (String titulo){
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.print("Título: ");
        System.out.println(this.titulo);

        if (local == null) return;
        System.out.print("Local: ");
        System.out.println(local.getEndereço());

        if (alunos == null) {
            return;
        }
        System.out.println("-- Participantes --");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome() + ", " + aluno.getIdade() + " anos");
        }

        //if (professor == null) return;
        //System.out.print("Palestrante: ");
        //System.out.println(professor.getNome() + " | " + "Especialização: " + professor.getEspecialidade());

    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos (Aluno[] alunos) {
        this.alunos = alunos;
    }

    //public Professor getProfessor(){
        //return professor;
    //}

    //public void setProfessor(Professor professor){
        //this.professor = professor;
    //}


}
