package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Calculo de area de um circulo====================");

        System.out.println("Digite o valor da area do circulo: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é: " + String.format("%.3f",area));

        entrada.close();
    }
}
