package Logica.estrutura_repeticao;

import java.util.Scanner;

public class RepetirAteX {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Repeticao====================");

        System.out.println("Digite o primeiro número: ");
        double input0 = entrada.nextDouble(); // digitou a primeira vez

        double soma = input0;
        while (soma != 12) {

            System.out.println("Agora digite o próximo número: ");
            double input1 = entrada.nextDouble(); // digitou a segunda vez
            soma = soma + input1;

            System.out.println("A soma de ambos agora é de: " + String.format("%.0f", soma) + "\n");
        }
    }
}
