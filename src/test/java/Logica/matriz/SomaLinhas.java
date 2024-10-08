package Logica.matriz;

import java.util.Scanner;

public class SomaLinhas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Qual a quantidade de linhas da matriz?====================");
        int linhas = entrada.nextInt();

        System.out.println("\n====================Qual a quantidade de colunas da matriz?====================");
        int colunas = entrada.nextInt();

        double somaV1 = 0;
        double somaV2 = 0;
        double primeiraLinha[] = new double[colunas];
        double segundaLinha[] = new double[colunas];
        if (linhas >= 1 && linhas <= 10) {
            System.out.println("Digite os elementos da 1a. linha: ");
            for (int i = 0; i < colunas; i++) {
                double m = entrada.nextDouble();
                primeiraLinha[i] = m;
            }

            System.out.println("Digite os elementos da 2a. linha: ");
            for (int j = 0; j < colunas; j++) {
                double n = entrada.nextDouble();
                segundaLinha[j] = n;
            }

        } else {
            System.out.println("Valores fora do permitido, o programa será encerrado!");
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < primeiraLinha.length; i++) {
            somaV1 += primeiraLinha[i];
        }
        for (int j = 0; j < segundaLinha.length; j++) {
            somaV2 += segundaLinha[j];
        }

        System.out.println(String.format("%.1f", somaV1));
        System.out.println(String.format("%.1f", somaV2));

        entrada.close();
    }
}