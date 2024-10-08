package Logica.vetores;

import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==============================MEDIA PARES==============================");

        System.out.println("\n====================Quantos Elementos Vai ter o Vetor?====================");
        int ele = entrada.nextInt();

        int soma = -0;
        int count = -0;
        int vetor[] = new int[ele];
        for (int i = 0; i < ele; i++) {
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();
            vetor[i] = num;
            if (num % 2 == 0) {
                soma += vetor[i];
                count++;
            }
        }

        if (count != 0) {
            int mediaAritmetica = soma / count;
            System.out.println("MEDIA DOS PARES = " + mediaAritmetica);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        entrada.close();
    }
}