package Logica.estrutura_for;

import java.util.Scanner;

public class Experiencias {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double totalCoelhos = 0;
        double totalRatos = 0;
        double totalSapos = 0;
        double percentualCoelhos;
        double percentualRatos;
        double percentualSapos;

        System.out.println("\n====================EXPERIENCIAS COM COBAIAS====================");

        System.out.println("\n====================Quantos casos de teste serao digitados?====================");
        int casos = entrada.nextInt();

        int qtdCobaia = 0;
        for (int i = 0; i < casos; i++) {
            entrada.nextLine();
            System.out.println("Tipo de cobaia: ");
            String tipoCobaia = entrada.nextLine();
            System.out.println("Quantidade de cobaias: ");
            qtdCobaia = entrada.nextInt();

            if (tipoCobaia.equalsIgnoreCase("C")) {
                totalCoelhos += qtdCobaia;
            } else if (tipoCobaia.equalsIgnoreCase("R")) {
                totalRatos += qtdCobaia;
            } else if (tipoCobaia.equalsIgnoreCase("S")) {
                totalSapos += qtdCobaia;
            }
            total += qtdCobaia;
        }

        percentualCoelhos = (totalCoelhos / total) * 100;
        percentualRatos = (totalRatos / total) * 100;
        percentualSapos = (totalSapos / total) * 100;

        System.out.println("\nRELATORIO FINAL: ");
        System.out.println("Total: " + String.format("%.0f", total) + " cobaias");
        System.out.println("Total de coelhos: " + String.format("%.0f", totalCoelhos));
        System.out.println("Total de ratos: " + String.format("%.0f", totalRatos));
        System.out.println("Total de sapos: " + String.format("%.0f", totalSapos));
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelhos));
        System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRatos));
        System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapos));

        entrada.close();
    }
}