package Logica.estrutura_for;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================FATORIAL====================");

        System.out.println("\n====================Digite o valor de 'N'====================");
        int fatorial = entrada.nextInt();

        int produto = 1;
        if (fatorial >= 0 && fatorial < 15) {
            for (int i = fatorial; i > 1; i--) {
                produto *= i;
            }
            System.out.println("FATORIAL = " + produto);
        } else {
            System.out.println("Valor fora do permitido");
        }
        entrada.close();
    }
}