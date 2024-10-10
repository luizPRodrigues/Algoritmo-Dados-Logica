package Logica.matriz;

import java.util.Scanner;

public class CadaLinha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Qual a ordem da matriz?====================");
        int ordem = entrada.nextInt();


        if (ordem >= 1 && ordem <= 10) {
            int linhas[][] = new int[ordem][ordem];
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    System.out.print("Elemento [" + i + "," + j + "]: ");
                    int elemento = entrada.nextInt();
                    linhas[i][j] = elemento;
                }
            }

            int maiorI;
            System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
            for (int i = 0; i < ordem; i++) {
                maiorI = linhas[i][0];
                for (int j = 0; j < ordem; j++) {
                    if (linhas[i][j] > maiorI) {
                        maiorI = linhas[i][j];
                    }
                }
                System.out.println(maiorI);
            }
        } else {
            System.out.println("O valor informado está fora do permitido e o programa será encerrado!");
        }
        entrada.close();
    }
}