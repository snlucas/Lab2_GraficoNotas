package exercicio5;

public class CalculoNotas implements InterfaceNotasDisciplina {

    @Override
    public double mediaAritmeticaAluno(Aluno aluno) {
        return somaGrauAGrauB(aluno) / 2;
    }

    @Override
    public double mediaAritmeticaTurma(Aluno[] alunos) {
        double somaTotalAlunos = 0;
        double media = 0;

        for (Aluno aluno : alunos)
            somaTotalAlunos += somaGrauAGrauB(aluno);

        try { 
            media = somaTotalAlunos / alunos.length;
        } catch (ArithmeticException e) { 
            System.out.println("Erro de divisão por zero!\nO array de alunos pode estar vazio!"); 
        }

        return media;
    }

    @Override
    public double menorNotaTurma(Aluno[] alunos) {
        double menorNota = somaGrauAGrauB(alunos[0]);

        for (Aluno aluno : alunos)
            if (menorNota > somaGrauAGrauB(aluno))
                menorNota = somaGrauAGrauB(aluno);

        return menorNota;
    }

    @Override
    public double maiorNotaTurma(Aluno[] alunos) {
        double maiorNota = somaGrauAGrauB(alunos[0]);

        for (Aluno aluno : alunos)
            if (maiorNota < somaGrauAGrauB(aluno))
                maiorNota = somaGrauAGrauB(aluno);

        return maiorNota;
    }

    @Override
    public double menorMediaTurma(Aluno[] alunos) {
        double menorMedia = mediaAritmeticaAluno(alunos[0]);

        for (Aluno aluno : alunos)
            if (menorMedia > mediaAritmeticaAluno(aluno))
                menorMedia = mediaAritmeticaAluno(aluno);

        return menorMedia;
    }

    @Override
    public double maiorMediaTurma(Aluno[] alunos) {
        double maiorMedia = mediaAritmeticaAluno(alunos[0]);

        for (Aluno aluno : alunos)
            if (maiorMedia < mediaAritmeticaAluno(aluno))
                maiorMedia = mediaAritmeticaAluno(aluno);

        return maiorMedia;
    }

    public double somaGrauAGrauB(Aluno aluno) {
        return aluno.getNotasGrauA().getSomaTotal() + aluno.getNotasGrauB().getSomaTotal();
    }

}
