package Logica.estrutura_condicional;

import java.util.Scanner;

public class Aumento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Verificacao aumento====================");

        System.out.println("Digite o salario da pessoa: ");
        double salario = entrada.nextDouble();

        if (salario > 0 && salario <= 1000) {
            double aumento = (salario / 100) * 20;
            double novoSalario = salario + aumento;
            System.out.println("O novo salario passa a ser: R$ " + String.format("%.2f", novoSalario)
                    + " \nHouve um aumento de: R$ " + String.format("%.2f", aumento)
                    + " \nA porcentagem de aumento foi de 20 %");
        } else if (salario > 1000 && salario <= 3000) {
            double aumento = (salario / 100) * 15;
            double novoSalario = salario + aumento;
            System.out.println("O novo salario passa a ser: R$ " + String.format("%.2f", novoSalario)
                    + " \nHouve um aumento de: R$ " + String.format("%.2f", aumento)
                    + " \nA porcentagem de aumento foi de 15 %");
        } else if (salario >= 3000 && salario <= 8000) {
            double aumento = (salario / 100) * 10;
            double novoSalario = salario + aumento;
            System.out.println("O novo salario passa a ser: R$ " + String.format("%.2f", novoSalario)
                    + " \nHouve um aumento de: R$ " + String.format("%.2f", aumento)
                    + " \nA porcentagem de aumento foi de 10 %");
        } else if (salario > 8000) {
            double aumento = (salario / 100) * 5;
            double novoSalario = salario + aumento;
            System.out.println("O novo salario passa a ser: R$ " + String.format("%.2f", novoSalario)
                    + " \nHouve um aumento de: R$ " + String.format("%.2f", aumento)
                    + " \nA porcentagem de aumento foi de 5 %");
        }
        entrada.close();
    }
}
