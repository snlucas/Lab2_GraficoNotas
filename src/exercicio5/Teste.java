package exercicio5;

public class Teste {
    public static void main(String[] args) {
        Aluno[] teste = new Aluno[2];
        NotaGrauA ga = new NotaGrauA(4, 5, 6, 7);
        NotaGrauB gb = new NotaGrauB(8, 9, 1, 0);
        teste[0] = new Aluno("teste0", ga, gb);
        teste[1] = new Aluno("teste1", ga, gb);
        
        Disciplina d = new Disciplina("Disciplina Teste", teste);
        System.out.println(d.toString());
        
    }   
}
