package Logica.vetores;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=================================MAIS VELHO=================================");

        System.out.println("\n====================Quantas Pessoas Voce Vai Digitar?====================");
        int qtd = entrada.nextInt();
        entrada.nextLine();

        int maiorIdade = 0;
        String pessoaMaisVelha = null;
        String vetorN[] = new String[qtd];
        int vetorI[] = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            vetorN[i] = nome;

            System.out.println("Idade: ");
            int idade = entrada.nextInt();
            vetorI[i] = idade;

            entrada.nextLine();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                pessoaMaisVelha = nome;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        entrada.close();
    }
}