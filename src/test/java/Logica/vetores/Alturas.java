package Logica.vetores;

import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================ALTURAS====================");

        System.out.println("\n====================Quantas pessoas serao Digitadas?====================");
        int qtd = entrada.nextInt();
        entrada.nextLine();

        int idade;
        double totalAlturas = 0;
        String nomes[] = new String[qtd];
        double alturas[] = new double[qtd];
        double contadorMenoresDezesseis = 0;
        StringBuilder menor = new StringBuilder();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            nomes[i] = nome;

            System.out.println("Idade: ");
            idade = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Altura: ");
            double altura = entrada.nextDouble();
            alturas[i] = altura;
            totalAlturas += altura;

            entrada.nextLine();

            if (idade < 16) {
                contadorMenoresDezesseis++;
                menor.append(nomes[i] + "\n");
            }
        }

        double media = totalAlturas / qtd;

        double menosDezesseis = (contadorMenoresDezesseis / qtd) * 100;

        System.out.println("\nAltura média: " + String.format("%.2f", media));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", menosDezesseis) + "%");
        System.out.println(menor);

        entrada.close();
    }
}