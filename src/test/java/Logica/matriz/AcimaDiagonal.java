package Logica.matriz;

import java.util.Scanner;

public class AcimaDiagonal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Leitor de Matrizes==========================");

        System.out.println("\n====================Qual a ordem da matriz?====================");
        int ordem = entrada.nextInt();

        int somaDiagonal = 0;
        if (ordem >= 1 && ordem <= 10) {
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    System.out.print("Elemento [" + i + "," + j + "]: ");
                    int elemento = entrada.nextInt();
                    if (j > i) {
                        somaDiagonal += elemento;
                    }
                }
            }
            System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + somaDiagonal);
        } else {
            System.out.println("O valor inserido esta fora do permitido, o programa será encerrado!");
        }

        entrada.close();
    }
}