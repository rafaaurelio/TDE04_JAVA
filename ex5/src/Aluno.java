import java.util.ArrayList;
import java.util.List;

class Curso{
    private String nome;

    public Curso(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

public class Aluno {
    private String nome;
    private List<Curso> cursos;

    public Aluno(String nome){
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }
    public void listarCursos(){
        System.out.println("Cursos de " + nome + ":");
        for(Curso curso : cursos){
            System.out.println("- " + curso.getNome());
        }
    }
}
