package Logica.vetores;

import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================DADOS PESSOAIS==========================");

        System.out.println("\n====================Quantas pessoas serao digitadas?====================");
        int qtd = entrada.nextInt();
        entrada.nextLine();

        double menorAltura = 0;
        double maiorAltura = 0;
        double alturaMulheres = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Altura da " + (i + 1) + "º pessoa: ");
            double altura = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("Genero da " + (i + 1) + "º pessoa: ");
            String genero = entrada.nextLine();

            if (i == 0) {
                menorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (genero.equalsIgnoreCase("F")) {
                alturaMulheres += altura;
                numeroMulheres++;
            } else if (genero.equalsIgnoreCase("M")) {
                numeroHomens++;
            }
        }

        double mediaAltura = (alturaMulheres) / numeroMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAltura));
        System.out.println("Numero de homens = " + numeroHomens);

        entrada.close();
    }
}