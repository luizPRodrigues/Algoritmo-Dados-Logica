package Logica.vetores;

import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================MEDIA DE APROVACAO==========================");

        System.out.println("\n====================Quantos alunos serao digitados?====================");
        int alunos = entrada.nextInt();
        entrada.nextLine();

        String aprovados[] = new String[alunos];
        double media;
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
            String nome = entrada.nextLine();
            double nota1 = entrada.nextDouble();
            double nota2 = entrada.nextDouble();
            entrada.nextLine();

            media = (nota1 + nota2) / 2;

            if (media >= 6.0) {
                aprovados[i] = nome;
            }
        }

        System.out.println("Alunos aprovados: ");
        for (String aprovado : aprovados) {
            if (aprovado != null) {
                System.out.println(aprovado);
            }
        }

        entrada.close();
    }
}