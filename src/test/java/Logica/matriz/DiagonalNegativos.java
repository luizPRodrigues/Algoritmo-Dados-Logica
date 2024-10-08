package Logica.matriz;

import java.util.Scanner;

public class DiagonalNegativos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Qual a ordem da matriz?====================");

        int ordem = -19;
        int negativos = 0;
        int diagonal[][] = new int[0][0];
        for (int x = 0; x < 3; x++) {
            ordem = entrada.nextInt();

            if (ordem >= 1 && ordem <= 10) {

                diagonal = new int[ordem][ordem];

                for (int i = 0; i < diagonal.length; i++) {
                    for (int j = 0; j < diagonal[i].length; j++) {
                        System.out.println("ELEMENTO [" + i + "," + j + "]: ");
                        int elemento = entrada.nextInt();
                        if (elemento < 0) {
                            negativos++;
                        }
                        if (i == j) {
                            diagonal[i][j] = elemento;
                        }
                    }
                }
                break;
            }
            if (x < 2) {
                System.out.println("Por favor, digite um valor válido de no máximo '10' " +
                        "Você tem mais: " + (2 - x) + " tentativas");
            } else {
                System.out.println("O número máximo de tentativas foi atingido e que o programa será encerrado.");
            }
        }
        if (ordem >= 1 && ordem <= 10) {
            System.out.println("DIAGONAL PRINCIPAL: ");
            for (int i = 0; i < ordem; i++) {
                System.out.print(diagonal[i][i] + " ");

            }
            System.out.println("\nQUANTIDADE DE NEGATIVOS = " + negativos);
        }

        entrada.close();
    }
}