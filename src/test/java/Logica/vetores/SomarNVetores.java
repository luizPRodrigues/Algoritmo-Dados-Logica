package Logica.vetores;

import java.util.Scanner;

public class SomarNVetores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================SOMA N VETORES====================");

        System.out.println("\n====================Quantos valores vai ter cada vetor?====================");
        int qtd = entrada.nextInt();

        int v_a[] = new int[qtd];
        int v_b[] = new int[qtd];
        int v_r[] = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite os valores do vetor A: ");
            int a = entrada.nextInt();
            v_a[i] = a;
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite os valores do vetor B: ");
            int b = entrada.nextInt();
            v_b[i] = b;
        }

        for (int i = 0; i < qtd; i++) {
            v_r[i] = v_a[i] + v_b[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i : v_r) {
            System.out.println(i);
        }

        entrada.close();
    }
}