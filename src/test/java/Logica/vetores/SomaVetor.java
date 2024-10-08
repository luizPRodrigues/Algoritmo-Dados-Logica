package Logica.vetores;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================SOMA VETOR====================");

        System.out.println("\n====================Quantos Numeros Voce Vai Digitar?====================");
        int qtd = entrada.nextInt();

        double soma = 0;
        double num[] = new double[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("\nDigite um numero: ");
            double numero = entrada.nextDouble();
            num[i] = numero;
            soma += num[i];
        }

        System.out.print("VALORES = ");
        for (double vetor : num) {
            System.out.print(vetor + " ");
        }
        System.out.println();

        double media = soma / qtd;
        System.out.println("SOMA = " + String.format("%.2f", soma));
        System.out.println("MEDIA = " + String.format("%.2f", media));

        entrada.close();
    }
}