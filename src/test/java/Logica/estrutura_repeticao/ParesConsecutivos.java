package Logica.estrutura_repeticao;

import java.util.Scanner;

public class ParesConsecutivos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Pares Consecutivos====================");

        System.out.println("Digite um numero inteiro: ");
        int input = entrada.nextInt();

        int soma = 0;
        int contador = 0;
        while (input != 0) {

            if (input % 2 != 0) {
                input = input + 1;
            }

            if (input % 2 == 0 && contador < 5) {
                soma = soma + input;

                input = input + 2;
                contador++;
            }
            if (contador == 5) {
                System.out.println("SOMA = " + soma);

                soma = 0;
                contador = 0;
                System.out.println("Digite um numero inteiro: ");
                input = entrada.nextInt();
            }

        }

        entrada.close();
    }
}