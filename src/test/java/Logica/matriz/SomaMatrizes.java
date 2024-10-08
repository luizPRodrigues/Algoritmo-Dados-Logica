package Logica.matriz;

import java.util.Scanner;

public class SomaMatrizes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Quantas linhas vai ter cada matriz?====================");
        int linhas = entrada.nextInt();

        System.out.println("\n====================Quantas colunas vai ter cada matriz?====================");
        int colunas = entrada.nextInt();

        int somaAB[][] = new int[linhas][colunas];
        int matrizA[][] = new int[linhas][colunas];
        int matrizB[][] = new int[linhas][colunas];
        if (linhas >= 1 && linhas <= 10 && colunas >= 1 && colunas <= 10) {
            System.out.println("Digite os valores da matriz A: ");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Elemento [" + i + "," + j + "]: ");
                    int elemento = entrada.nextInt();
                    matrizA[i][j] = elemento;
                }
            }

            System.out.println("Digite os valores da matriz B: ");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Elemento [" + i + "," + j + "]: ");
                    int elemento = entrada.nextInt();
                    matrizB[i][j] = elemento;
                }
            }

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    somaAB[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

            System.out.print("MATRIZ SOMA: ");
            for (int i = 0; i < linhas; i++) {
                System.out.println();
                for (int j = 0; j < colunas; j++) {
                    System.out.print(somaAB[i][j] + " ");
                }
            }

        } else {
            System.out.println("O valor digitado é fora do permitido, o programa será encerrado!");
        }
        entrada.close();
    }
}