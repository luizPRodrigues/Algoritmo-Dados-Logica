package Logica.matriz;

import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Quantas linhas vai ter a matriz?====================");
        int linhas = entrada.nextInt();

        System.out.println("\n====================Quantas colunas vai ter a matriz?====================");
        int colunas = entrada.nextInt();

        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("ELEMENTO [" + i + "," + j + "]: ");
                int elemento = entrada.nextInt();
                matriz[i][j] = elemento;
            }
        }

        //percorre e imprime linhas x colunas
        System.out.println("MATRIZ DIGITADA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
