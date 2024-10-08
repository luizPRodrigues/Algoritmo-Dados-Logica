package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Calculo de medidas====================");

        System.out.println("Digite a medida A: ");
        double medidaA = entrada.nextDouble();

        double quadrado = Math.pow(medidaA, 2);
        System.out.println("A area do quadrado é de: " + String.format("%.4f", quadrado));

        System.out.println("Digite a medida B: ");
        double medidaB = entrada.nextDouble();

        double areaTriangulo = medidaA * medidaB / 2;
        System.out.println("A area do triangulo é de: " + String.format("%.4f", areaTriangulo));

        System.out.println("Digite a medida C: ");
        double medidaC = entrada.nextDouble();

        double trapezio = (medidaA + medidaB) * medidaC / 2;

        System.out.println("A area do trapezio é de: " + String.format("%.4f", trapezio));

        entrada.close();
    }
}
