package Logica.estrutura_for;

import java.util.Scanner;

public class SomaPares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Soma Pares====================");

        System.out.println("Digite o primeiro numero: ");
        int x = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int y = entrada.nextInt();

        int maior;
        int menor;

        if (x >= y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("SOMA DOS IMPARES = " + soma);

        entrada.close();
    }
}
