public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedroca");
        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Engenharia de Software");
        Curso curso3 = new Curso("Ciência da Computação");

        aluno.adicionarCurso(curso1);
        aluno.adicionarCurso(curso2);
        aluno.adicionarCurso(curso3);

        aluno.listarCursos();
    }
}