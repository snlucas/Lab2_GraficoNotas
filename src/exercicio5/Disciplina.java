package exercicio5;

public class Disciplina {
    private final int CAPACIDADE_MAX_ALUNOS = 70;
    private Aluno[] alunos;
    private String nomeDisciplina;
    CalculoNotas calculoNotas = new CalculoNotas();

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = new Aluno[CAPACIDADE_MAX_ALUNOS];
    }

    public Disciplina(String nomeDisciplina, Aluno[] alunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
    }

    public String desenhaMediaAlunos() {
        String matrixMedia = "Estudante\tA\tB\tMédia\n";

        for (Aluno aluno : this.alunos)
            matrixMedia += aluno.getNome() + "\t" + aluno.getNotasGrauA().getSomaTotal() + "\t" + aluno.getNotasGrauB().getSomaTotal() + "\t" + calculoNotas.mediaAritmeticaAluno(aluno) + "\n";
        
        return matrixMedia;
    }

    public String desenhaMediasTurma() {
        String listaMedias = "MEDIAS\n";

        listaMedias += "Media geral: " + calculoNotas.mediaAritmeticaTurma(this.alunos) + "\n";
        listaMedias += "Menor media: " + calculoNotas.menorMediaTurma(this.alunos) + "\n";
        listaMedias += "Maior media: " + calculoNotas.maiorMediaTurma(this.alunos) + "\n";
        listaMedias += "\nMenor nota: " + calculoNotas.menorNotaTurma(this.alunos) + "\n";
        listaMedias += "Maior nota: " + calculoNotas.maiorNotaTurma(this.alunos);

        return listaMedias;
    }

    @Override
    public String toString() {
        return this.desenhaMediaAlunos() + "\n\n" + desenhaMediasTurma() + "\n\n";
    }
}
