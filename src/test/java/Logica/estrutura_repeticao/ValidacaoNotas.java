package Logica.estrutura_repeticao;

import java.util.Scanner;

public class ValidacaoNotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Verificacao Notas====================");

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Valor invalido! Tente novamente: ");
            nota1 = entrada.nextDouble();
        }

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Valor invalido! Tente novamente: ");
            nota2 = entrada.nextDouble();
        }

        double MEDIA = (nota1 + nota2) / 2;

        System.out.println("MEDIA: " + MEDIA);

    }
}