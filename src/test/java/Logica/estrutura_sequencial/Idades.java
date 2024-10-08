package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================Dados da primeira pessoa====================");

        System.out.println("Digite o nome: ");
        String nome1 = entrada.nextLine();

        System.out.println("\nDigite a idade: ");
        double idade1 = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("\n====================Dados da segunda pessoa====================");

        System.out.println("Digite o nome: ");
        String nome2 = entrada.nextLine();

        System.out.println("\nDigite a idade: ");
        double idade2 = entrada.nextDouble();

        double media = (idade1 + idade2) / 2;
        System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + media + " anos.");

        entrada.close();
    }
}
