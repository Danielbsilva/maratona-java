package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicioassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor (String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.print("Palestrante: ");
        System.out.println(this.nome);
        System.out.print("Especialidade: ");
        System.out.println(this.especialidade);

        //System.out.println("- Palestras -");
        //if (seminario == null) return;
        //for(Seminario seminarios : seminario){
        //    System.out.println(seminarios.getTitulo());
        //}
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario(){
        return seminario;
    }

    public void setSeminario(Seminario[] seminario){
        this.seminario = seminario;
    }

}
