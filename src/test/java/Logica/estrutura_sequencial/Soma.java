package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================Leitor de Valores====================");

        System.out.println("Digite o valor de X: ");
        double valorX = entrada.nextDouble();

        System.out.println("\nDigite o valor de y: ");
        double valorY = entrada.nextDouble();

        double soma = valorX + valorY;
        System.out.println("A soma dos valores é de " + soma);

        entrada.close();
    }
}
