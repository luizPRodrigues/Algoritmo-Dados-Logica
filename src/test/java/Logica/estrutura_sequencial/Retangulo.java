package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ensira a base do retangulo: ");
        double base = entrada.nextDouble();

        System.out.println("Insira a altura do retangulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        System.out.println("A area do retangulo é: " + String.format("%.4f", area));

        double perimetro = 2 * (base + altura);
        System.out.println("\nO perimetro é: " + String.format("%.4f", perimetro));

        double diagonal = Math.pow(base, 2) + Math.pow(altura, 2);
        double diag = Math.sqrt(diagonal);
        System.out.println("\nA diagonal é: " + String.format("%.4f", diag));

        entrada.close();
    }
}
