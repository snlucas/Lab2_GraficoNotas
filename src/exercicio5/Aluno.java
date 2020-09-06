package exercicio5;

public class Aluno {
    private String nome;
    private NotaGrauA notasGrauA;
    private NotaGrauB notasGrauB;

    public Aluno(String nome) {
        this.nome = nome;
        this.notasGrauA = new NotaGrauA();
        this.notasGrauB = new NotaGrauB();
    }

    public Aluno(String nome, NotaGrauA nga, NotaGrauB ngb) {
        this.nome = nome;
        this.notasGrauA = nga;
        this.notasGrauB = ngb;
    }

    public String getNome() {
        return nome;
    }

    public NotaGrauA getNotasGrauA() {
        return notasGrauA;
    }

    public void setNotasGrauA(NotaGrauA notasGrauA) {
        this.notasGrauA = notasGrauA;
    }

    public NotaGrauB getNotasGrauB() {
        return notasGrauB;
    }

    public void setNotasGrauB(NotaGrauB notasGrauB) {
        this.notasGrauB = notasGrauB;
    }
}
