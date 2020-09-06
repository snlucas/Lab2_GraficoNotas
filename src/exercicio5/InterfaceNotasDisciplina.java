package exercicio5;

public interface InterfaceNotasDisciplina {
    public abstract double mediaAritmeticaAluno(Aluno aluno);
    public abstract double mediaAritmeticaTurma(Aluno[] alunos);
    public abstract double menorNotaTurma(Aluno[] alunos);
    public abstract double maiorNotaTurma(Aluno[] alunos);
    public abstract double menorMediaTurma(Aluno[] alunos);
    public abstract double maiorMediaTurma(Aluno[] alunos);
}
