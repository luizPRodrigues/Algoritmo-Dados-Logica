package Logica.vetores;

import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==============================ABAIXO DA MEDIA==============================");

        System.out.println("\n====================Quantos Elementos Vai ter o Vetor?====================");
        int ele = entrada.nextInt();

        double soma = 0;
        double num[] = new double[ele];
        for (int i = 0; i < ele; i++) {
            System.out.println("Digite um numero: ");
            double numero = entrada.nextDouble();
            num[i] = numero;
            soma += num[i];

        }

        double mediaAritmetica = soma / ele;

        System.out.println("MEDIA DO VETOR = " + String.format("%.3f", mediaAritmetica));

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double vetor : num) {
            if (vetor < mediaAritmetica) {
                System.out.println(String.format("%.1f", vetor));
            }
        }

        entrada.close();
    }
}