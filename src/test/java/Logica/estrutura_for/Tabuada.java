package Logica.estrutura_for;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Tabuada====================");

        System.out.println("Deseja a tabuada para qual valor?");
        int n = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int m = n * i;

            System.out.println(n + " x " + i + " = " + m);
        }

        entrada.close();
    }
}
