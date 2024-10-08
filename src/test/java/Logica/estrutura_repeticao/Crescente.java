package Logica.estrutura_repeticao;

import java.util.Arrays;
import java.util.Scanner;

public class Crescente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Crescente====================");

        int x = 1;
        int y = 0;
        while (x != y) {
            System.out.println("Digite dois numeros: ");
            x = entrada.nextInt();

            System.out.println("Digite outros dois numeros: ");
            y = entrada.nextInt();

            int[] arr = {x, y};

            if (x < y) {
                System.out.println("CRESCENTE");
            } else
                System.out.println("DECRESCENTE");

            System.out.println("Os numeros digitados foram: " + Arrays.toString(arr));
        }
        entrada.close();
    }
}
