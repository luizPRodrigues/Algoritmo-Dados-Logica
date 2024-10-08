package Logica.matriz;

import java.util.Scanner;

public class NegativosMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Qual a quantidade de linhas da matriz?====================");
        int linhas = entrada.nextInt();

        System.out.println("\n====================Qual a quantidade de colunas da matriz?====================");
        int colunas = entrada.nextInt();

        if (linhas >= 1 && linhas <= 10 && colunas >= 1 && colunas <= 10) {
            int negativos[][] = new int[linhas][colunas];
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("ELEMENTO [" + i + "," + j + "]: ");
                    int elemento = entrada.nextInt();
                    if (elemento < 0) {
                        negativos[i][j] = elemento;
                    }
                }
            }

            System.out.println("VALORES NEGATIVOS: ");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (negativos[i][j] < 0) {
                        System.out.println(negativos[i][j]);
                    }
                }
            }
        } else {
            System.out.println("Os valores inseridos estão fora do permitido e o programa será encerrado!");
        }

        entrada.close();
    }
}