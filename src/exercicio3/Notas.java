package exercicio3;

import java.util.Scanner;

public class Notas {
    private final int ARRAY_CAPACIDADE_MAX = 300;
    private double[] valores;
    
    public Notas(int capacidade) {
        this.valores = new double[capacidade];

        // "reseta" indices dos arrays, para q nao iniciem com "0"
        for (int i = 0; i < capacidade; i++)
            this.valores[i] = -1;
    }

    public Notas() {
        this.valores = new double[ARRAY_CAPACIDADE_MAX];

        // "reseta" indices dos arrays, para q nao iniciem com "0"
        for (int i = 0; i < ARRAY_CAPACIDADE_MAX; i++)
            this.valores[i] = -1;
    }

    public void addValor(double valor) {
        if (isValorValido(valor)) {
            for (int i = 0; i < this.getValores().length; i++) {
                if (this.valores[i] == -1) {
                    this.valores[i] = valor;
                    break;
                }
            }
        } else {
            while(valor < 0 || valor > 100) {
                System.out.println("Digite um valor entre 0 e 100!");
                Scanner scan = new Scanner(System.in);
                valor = scan.nextDouble();
            }

            for (int i = 0; i < this.getValores().length; i++) {
                if (this.valores[i] == -1) {
                    this.valores[i] = valor;
                    break;
                }
            }
        }
    }

    public double[] getValores() {
        return this.valores;
    }

    public boolean isValorValido(double valor) {
        return valor >= 0 && valor <= 100; 
    }
}
