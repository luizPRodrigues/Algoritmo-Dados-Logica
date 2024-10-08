package Logica.matriz;

import java.util.Scanner;

public class MatrizGeral {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================Matriz Geral==========================");

        System.out.println("\n====================Qual a ordem da matriz?====================");
        int ordem = entrada.nextInt();

        double diagonal[][];
        double somaElemento = 0;
        double[][] elementoNegativo = new double[ordem][ordem];
        if (ordem >= 1 && ordem <= 10) {

            diagonal = new double[ordem][ordem];

            for (int i = 0; i < diagonal.length; i++) {
                for (int j = 0; j < diagonal[i].length; j++) {
                    System.out.print("ELEMENTO [" + i + "," + j + "]: ");
                    double elemento = entrada.nextDouble();
                    diagonal[i][j] = elemento;
                    if (elemento > 0) {
                        somaElemento += elemento;
                    } else if (elemento < 0) {
                        elementoNegativo[i][j] = Math.pow(elemento, 2);
                    }
                }
            }

            System.out.print("\nSOMA DOS POSITIVOS: " + String.format("%.1f", somaElemento));

            //logica para impressao da linha conforme a escolha do usuario

            System.out.print("\n\nEscolha uma linha: ");
            int linha = entrada.nextInt();

            double[] linhaEscolhida = new double[diagonal[linha].length];
            for (int j = 0; j < diagonal[linha].length; j++) {
                linhaEscolhida[j] = diagonal[linha][j];
            }
            System.out.print("LINHA ESCOLHIDA: ");
            for (double l : linhaEscolhida) {
                System.out.print(l + " ");
            }

            //logica para impressao da coluna conforme a escolha do usuario

            System.out.print("\n\nEscolha uma coluna: ");
            int coluna = entrada.nextInt();

            double[] colunaEscolhida = new double[diagonal.length];
            for (int i = 0; i < diagonal[coluna].length; i++) {
                colunaEscolhida[i] = diagonal[i][coluna];
            }
            System.out.print("COLUNA ESCOLHIDA: ");
            for (double c : colunaEscolhida) {
                System.out.print(c + " ");
            }

            //logica para impressao da diagonal principal

            double[] diagonalPrincipal = new double[diagonal[linha].length];
            for (int i = 0; i < diagonal.length; i++) {
                diagonalPrincipal[i] = diagonal[i][i];
            }
            System.out.print("\n\nDIAGONAL PRINCIPAL: ");
            for (double d : diagonalPrincipal) {
                System.out.print(d + " ");
            }

            //logica para impressao da matriz principal verificando valores negativos elevados ao quadrado

            System.out.println("\n\nMATRIZ ALTERADA: ");
            for (int i = 0; i < diagonal.length; i++) {
                System.out.println();
                for (int j = 0; j < diagonal.length; j++) {
                    if (diagonal[i][j] > 0) {
                        System.out.print(diagonal[i][j] + " ");
                    }
                    if (diagonal[i][j] < 0) {
                        System.out.print(elementoNegativo[i][j] + " ");
                    }
                }
            }

        } else {
            System.out.println("O máximo de valores permitidos é de até '10'");
        }

        entrada.close();
    }
}