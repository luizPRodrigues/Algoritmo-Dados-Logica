package Logica.estrutura_condicional;

import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Lanchonete====================");
        double cod1 = 5.0;
        double cod2 = 3.5;
        double cod3 = 4.8;
        double cod4 = 8.9;
        double cod5 = 7.32;

        System.out.println("Codigo do produto comprado: ");
        String codPRD = entrada.nextLine();

        System.out.println("Quantidade comprada: ");
        int qtd = entrada.nextInt();

        //é possivel tornar essa logica mais escalavel utilizando collecoes- Map<Double, Runnable> mapa = new HashMap<>();
        switch (codPRD) {
            case "1":
                double c1 = cod1 * qtd;
                System.out.println("Valor a pagar: R$ " + String.format("%.2f", c1));
                break;
            case "2":
                double c2 = cod2 * qtd;
                System.out.println("Valor a pagar: R$ " + String.format("%.2f", c2));
                break;
            case "3":
                double c3 = cod3 * qtd;
                System.out.println("Valor a pagar: R$ " + String.format("%.2f", c3));
                break;
            case "4":
                double c4 = cod4 * qtd;
                System.out.println("Valor a pagar: R$ " + String.format("%.2f", c4));
                break;
            case "5":
                double c5 = cod5 * qtd;
                System.out.println("Valor a pagar: R$ " + String.format("%.2f", c5));
                break;
            default:
                System.out.println("Verifique o valor digitado e tente novamente!");
        }
        entrada.close();
    }
}
