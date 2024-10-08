package Logica.vetores;

import java.util.Scanner;

public class Comerciante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n==========================COMERCIANTE==========================");

        System.out.println("\n====================Serao digitados dados de quantos produtos?====================");
        int qtd = entrada.nextInt();

        double totalVenda = 0;
        double totalCompra = 0;
        double lucro[] = new double[qtd];
        double listaTotalCompra[] = new double[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Produto " + (i + 1) + ": ");
            System.out.print("Nome: ");
            entrada.nextLine();
            entrada.nextLine();

            System.out.print("Preco de Compra: ");
            double precoCompra = entrada.nextDouble();

            System.out.print("Preco de Venda: ");
            double precoVenda = entrada.nextDouble();

            totalCompra += precoCompra;

            if (precoVenda > precoCompra) {
                totalVenda += precoVenda;
                lucro[i] = precoVenda - precoCompra;
                listaTotalCompra[i] = precoCompra;
            }
        }

        int abaixoDez = 0;
        int entreDezEVinte = 0;
        int acimaDeVinte = 0;
        for (int i = 0; i < qtd; i++) {
            if (lucro[i] / listaTotalCompra[i] < 0.10) {
                abaixoDez++;
            }
            if (lucro[i] / listaTotalCompra[i] >= 0.10 && lucro[i] / listaTotalCompra[i] <= 0.20) {
                entreDezEVinte++;
            }
            if (lucro[i] / listaTotalCompra[i] > 0.20) {
                acimaDeVinte++;
            }
        }
        double lucroTotal = totalVenda - totalCompra;

        System.out.println("\nRELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + abaixoDez);
        System.out.println("Lucro entre 10% e 20%: " + entreDezEVinte);
        System.out.println("Lucro acima de 20%: " + acimaDeVinte);
        System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
        System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
        System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));
        entrada.close();
    }
}