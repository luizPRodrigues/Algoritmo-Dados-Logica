package Logica.estrutura_for;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Divisao Impossivel====================");

        System.out.println("\n====================Quantos Casos Voce Vai Digitar?====================");
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Entre com o numerador: ");
            double numerador = entrada.nextDouble();

            System.out.println("Entre com o numerador: ");
            double denominador = entrada.nextDouble();

            if (denominador != 0) {

                double div = numerador / denominador;

                System.out.println("DIVISAO = " + String.format("%.2f", div));
            } else {
                System.out.println("DIVISAO IMPOSSIVEL");
            }
        }

        entrada.close();
    }
}
