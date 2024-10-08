package Logica.estrutura_condicional;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Multiplos====================");

        System.out.println("Digite dois numeros: ");

        String iterar = entrada.nextLine();
        String[] values = iterar.split(" ");

        int convercao1 = Integer.parseInt(values[0]);
        int convercao2 = Integer.parseInt(values[1]);

        if (convercao1 % convercao2 == 0) {
            System.out.println("O multiplo entre os dois valores é: " + convercao1);
        } else if (convercao2 % convercao1 == 0) {
            System.out.println("O multiplo entre os dois valores é: " + convercao2);
        } else {
            System.out.println("Nenhum dos valores informados sao multiplos");
        }

        entrada.close();
    }
}