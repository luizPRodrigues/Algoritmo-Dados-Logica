package Logica.vetores;

import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================NEGATIVOS====================");

        System.out.println("\n====================Quantos Numeros Voce Vai Digitar?====================");
        int qtd = entrada.nextInt();//determina a quantidade de número a serem digitados e armazena na variavel 'num'

        int numeros[] = new int[qtd];
        for (int i = 0; i < qtd; i++) {//‘loop’ para percorrer a quantidade determinada pela var 'num'
            System.out.println("\nDigite um numero: ");
            int num = entrada.nextInt();
            numeros[i] = num;
        }
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println("NUMEROS NEGATIVOS: " + numero);
            }
        }
        entrada.close();
    }
}