package exercicio3;

public class Teste {
    public static void main(String[] args) {
        double[] n = new double[30];

        for (int i = 0; i < n.length; i++) {
            n[i] = i + 8;
        }

        Notas notas = new Notas(n);
        GraficoNotas gn = new GraficoNotas(notas);
    }
}
