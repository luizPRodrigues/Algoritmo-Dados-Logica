package Logica.estrutura_condicional;

import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Coeficientes- Equacao Segundo Grau====================");

        System.out.println("Digite o coeficiente A: ");
        double coeA = entrada.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        double coeB = entrada.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        double coeC = entrada.nextDouble();

        double delta = Math.pow(coeB, 2) - 4 * coeA * coeC;

        if (coeA == 0) {
            System.out.println("Esta não é uma equação do segundo grau, pois o coeficiente 'a' é igual a zero.");
        } else if (delta < 0) {
            System.out.println("Essa equacao nao possui raizes reais");
        } else {
            double x1 = (-coeB + Math.sqrt(delta)) / (2 * coeA);
            double x2 = (-coeB - Math.sqrt(delta)) / (2 * coeA);
            System.out.println("O valor de x1 é: " + String.format("%.4f", x1) + " \nO valor de x2 é: " + String.format("%.4f", x2));
        }

        entrada.close();
    }
}
