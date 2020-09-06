package exercicio5;

public class NotaGrauB extends Nota {

    public NotaGrauB() {
        super();
    }

    public NotaGrauB(double notaExercicios, double notaTrabalhos, double notaTestes, double notaProvas) {
        super(notaExercicios, notaTrabalhos, notaTestes, notaProvas);
    }

    public NotaGrauB(double[] notaExercicios, double[] notaTrabalhos, double[] notaTestes, double[] notaProvas) {
        super(notaExercicios, notaTrabalhos, notaTestes, notaProvas);
    }

    @Override
    public void setNotaExercicios(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            try {
                super.setExercicios(super.getExercicios() + notas[i]);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro!");
            }
        }
    }

    @Override
    public void setNotaTrabalhos(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            try {
                super.setTrabalhos(super.getTrabalhos() + notas[i]);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro!");
            }
        }
    }

    @Override
    public void setNotaTeste(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            try {
                super.setTestes(super.getTestes() + notas[i]);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro!");
            }
        }
    }

    @Override
    public void setNotaProva(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            try {
                super.setProvas(super.getProvas() + notas[i]);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro!");
            }
        }
    }
    
}
