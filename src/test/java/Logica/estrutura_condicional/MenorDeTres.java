package Logica.estrutura_condicional;

import java.util.Scanner;

public class MenorDeTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Verificacao Condicional- Menor de 3====================");

        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = entrada.nextInt();

        if (valor1 == valor2 && valor1 == valor3) {
            System.out.println("Os 3 valores sao iguais");
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            System.out.println("O valor menor é: " + valor2);
        } else if (valor3 <= valor2 && valor3 <= valor1) {
            System.out.println("O valor menor é: " + valor3);
        } else if (valor1 <= valor2 && valor1 <= valor3) {
            System.out.println("O valor menor é: " + valor1);
        }

        entrada.close();
    }
}
