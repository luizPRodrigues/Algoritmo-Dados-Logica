package Logica.estrutura_condicional;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Temperatura====================");

        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?: ");
        String escala = entrada.next();

        if (escala.equalsIgnoreCase("C")) {
            System.out.println("Agora voce precisa digitar a temperatura em Celsius: ");
            double temperatura = entrada.nextDouble();
            double f = (temperatura * 9 / 5) + 32;
            System.out.println("Voce escolheu C e o valor da conversao em Fahrenheit é de: " + String.format("%.2f", f));
        } else if (escala.equalsIgnoreCase("F")) {
            System.out.println("Agora voce precisa digitar a temperatura em Fahrenheit: ");
            double temperatura = entrada.nextDouble();
            double c = (temperatura - 32) * 5 / 9;
            System.out.println("Voce escolheu F e o valor da conversao em Celsius é de: " + String.format("%.2f", c));
        } else {
            System.out.println("Verifique o valor informado!");
        }

        entrada.close();
    }
}