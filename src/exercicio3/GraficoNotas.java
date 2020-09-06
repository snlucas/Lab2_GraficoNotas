package exercicio3;

public class GraficoNotas {
    private double[] notas0A9;
    private double[] notas10A19;
    private double[] notas20A29;
    private double[] notas30A39;
    private double[] notas40A49;
    private double[] notas50A59;
    private double[] notas60A69;
    private double[] notas70A79;
    private double[] notas80A89;
    private double[] notas90A99;
    private double[] notas100;
    
    public GraficoNotas(Notas notas) {
        int qtdAlunos = notas.getValores().length;

        notas0A9   = new double[qtdAlunos];
        notas10A19 = new double[qtdAlunos];
        notas20A29 = new double[qtdAlunos];
        notas30A39 = new double[qtdAlunos];
        notas40A49 = new double[qtdAlunos];
        notas50A59 = new double[qtdAlunos];
        notas60A69 = new double[qtdAlunos];
        notas70A79 = new double[qtdAlunos];
        notas80A89 = new double[qtdAlunos];
        notas90A99 = new double[qtdAlunos];
        notas100   = new double[qtdAlunos];

        // "reseta" indices dos arrays, para q nao iniciem com "0"
        for (int i = 0; i < qtdAlunos; i++) {
            notas0A9[i]   = -1;
            notas10A19[i] = -1;
            notas20A29[i] = -1;
            notas30A39[i] = -1;
            notas40A49[i] = -1;
            notas50A59[i] = -1;
            notas60A69[i] = -1;
            notas70A79[i] = -1;
            notas80A89[i] = -1;
            notas90A99[i] = -1;
            notas100[i]   = -1;
        }

        // Separa valores em arrays individuais
        organizaArrayNotas(notas.getValores());
    }

    public void desenhaGraficoHorizontal() {
        System.out.println("\n\n====== Grafico de notas ======");
        System.out.println("\tFormato horizontal");
        System.out.print("\n00-09: " + desenhaPontos(notas0A9));
        System.out.print("\n10-19: " + desenhaPontos(notas10A19));
        System.out.print("\n20-29: " + desenhaPontos(notas20A29));
        System.out.print("\n30-39: " + desenhaPontos(notas30A39));
        System.out.print("\n40-49: " + desenhaPontos(notas40A49));
        System.out.print("\n50-59: " + desenhaPontos(notas50A59));
        System.out.print("\n60-69: " + desenhaPontos(notas60A69));
        System.out.print("\n70-79: " + desenhaPontos(notas70A79));
        System.out.print("\n80-89: " + desenhaPontos(notas80A89));
        System.out.print("\n90-99: " + desenhaPontos(notas90A99));
        System.out.print("\n  100: " + desenhaPontos(notas100));
        System.out.println("\n");
    }

    public String desenhaPontos(double[] array) {
        String pontos = "";

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                pontos += "*";
            }
        }

        return pontos;
    }

    public void organizaArrayNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] < 10)
                addItem(array[i], notas0A9);
            else if (array[i] >= 10 && array[i] < 20)
                addItem(array[i], notas10A19);
            else if (array[i] >= 20 && array[i] < 30)
                addItem(array[i], notas20A29);
            else if (array[i] >= 30 && array[i] < 40)
                addItem(array[i], notas30A39);
            else if (array[i] >= 40 && array[i] < 50)
                addItem(array[i], notas40A49);
            else if (array[i] >= 50 && array[i] < 60)
                addItem(array[i], notas50A59);
            else if (array[i] >= 60 && array[i] < 70)
                addItem(array[i], notas60A69);
            else if (array[i] >= 70 && array[i] < 80)
                addItem(array[i], notas70A79);
            else if (array[i] >= 80 && array[i] < 90)
                addItem(array[i], notas80A89);
            else if (array[i] >= 90 && array[i] < 100)
                addItem(array[i], notas90A99);
            else
                addItem(array[i], notas100);
        }
    }

    public void addItem(double item, double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                array[i] = item;
                break;
            }
        }
    }
}
