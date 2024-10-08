package Logica.estrutura_for;

import java.util.Scanner;

public class MediaPonderada {

    public static final int p1 = 2;
    public static final int p2 = 3;
    public static final int p3 = 5;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Media Ponderada====================");

        System.out.println("\n====================Quantos Casos Voce Vai Digitar?====================");
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Digite o primeiro valor: ");
            double v1 = entrada.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double v2 = entrada.nextDouble();

            System.out.println("Digite o terceiro valor: ");
            double v3 = entrada.nextDouble();

            double media_p = ((v1 * p1) + (v2 * p2) + (v3 * p3)) / (p1 + p2 + p3);

            System.out.println("MEDIA= " + String.format("%.1f", media_p));
        }

        entrada.close();
    }
}
