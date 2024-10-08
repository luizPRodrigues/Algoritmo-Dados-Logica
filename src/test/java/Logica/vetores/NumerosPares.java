package Logica.vetores;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================NUMEROS PARES====================");

        System.out.println("\n====================Quantos Numeros Voce Vai Digitar?====================");
        int qtd = entrada.nextInt();

        int numerosPares[] = new int[qtd];
        int paresQtd = 0;
        int indicePares = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();

            if (num % 2 == 0) {
                numerosPares[indicePares] = num;
                indicePares++;
                paresQtd++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < indicePares; i++) {
            System.out.print(numerosPares[i] + " ");
        }

        System.out.println("\nQUANTIDADE DE PARES = " + paresQtd);

        entrada.close();
    }
}