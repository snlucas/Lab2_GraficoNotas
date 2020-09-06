package exercicio5;

import java.util.Scanner;

public abstract class Nota {
    private double exercicios;
    private double trabalhos;
    private double testes;
    private double provas;

    public Nota() {
        this.setExercicios(0);
        this.setTrabalhos(0);
        this.setTestes(0);
        this.setProvas(0);
    }

    public Nota(double notaExercicios, double notaTrabalhos, double notaTestes, double notaProvas) {
        this.setExercicios(notaExercicios);
        this.setTrabalhos(notaTrabalhos);
        this.setTestes(notaTestes);
        this.setProvas(notaProvas);
    }

    public Nota(double[] notaExercicios, double[] notaTrabalhos, double[] notaTestes, double[] notaProvas) {
        try {
            for (int i = 0; i < notaExercicios.length; i++)
                this.setExercicios(this.getExercicios() + notaExercicios[i]);

            for (int i = 0; i < notaTrabalhos.length; i++)
                this.setTrabalhos(this.getTrabalhos() + notaTrabalhos[i]);

            for (int i = 0; i < notaTestes.length; i++)
                this.setTestes(this.getTestes() + notaTestes[i]);

            for (int i = 0; i < notaProvas.length; i++)
                this.setProvas(this.getProvas() + notaProvas[i]);
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro!");
        }
    }

    public abstract void setNotaExercicios(double[] notas);
    public abstract void setNotaTrabalhos(double[] notas);
    public abstract void setNotaTeste(double[] notas);
    public abstract void setNotaProva(double[] notas);

    public double setNota(int qtdNotas, String tipoNota) {
        double valorNotas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("\n=== Digite a Nota dos %tipoNota; ===\n", tipoNota));

        for (int i = 1; i <= qtdNotas; i++) {
            try {
                while (true) {
                    System.out.print(String.format("\n\tNota %s;: ", i));

                    try {
                        valorNotas += sc.nextDouble();
                    } catch (NumberFormatException e) {
                        System.out.println("É necessário ser digitado um valor apenas numérico!");
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro!");
                    }

                    if (valorNotas >= 0)
                        break;
                    else
                        System.out.println("Digite um valor positivo!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um Erro!");
            }
        }

        return valorNotas;
    }

    public void setNotaExercicios(int qtdExercicios) {
        this.exercicios = setNota(qtdExercicios, "Exercícios");
    }

    public void setNotaTrabalhos(int qtdTrabalhos) {
        this.trabalhos = setNota(qtdTrabalhos, "Trabalhos");
    }

    public void setNotaTeste(int qtdTestes) {
        this.testes = setNota(qtdTestes, "Testes");
    }

    public void setNotaProva(int qtdProvas) {
        this.provas = setNota(qtdProvas, "Provas");
    }

    public double getExercicios() {
        return exercicios;
    }

    public void setExercicios(double exercicios) {
        this.exercicios = exercicios;
    }

    public double getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(double trabalhos) {
        this.trabalhos = trabalhos;
    }

    public double getTestes() {
        return testes;
    }

    public void setTestes(double testes) {
        this.testes = testes;
    }

    public double getProvas() {
        return provas;
    }

    public void setProvas(double provas) {
        this.provas = provas;
    }
}
