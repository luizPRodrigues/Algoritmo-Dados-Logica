package Logica.estrutura_repeticao;

import java.util.Scanner;

public class Combustivel {
    private static int alcool = 0;
    private static int gasolina = 0;
    private static int diesel = 0;
    private static final int fim = 4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Verificacao Preferencia====================");

        System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int cod = entrada.nextInt();

        while (cod != 4) {
            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            cod = entrada.nextInt();

            if (cod == 1) {
                alcool++;
            } else if (cod == 2) {
                gasolina++;
            } else if (cod == 3) {
                diesel++;
            }
        }
        System.out.println("MUITO OBRIGADO \n" + "Alcool: " + alcool + " \nGasolina: " + gasolina + " \nDiesel: " + diesel);
        entrada.close();
    }
}