package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Calculo de processo de pagamento====================");

        System.out.println("Informe o preco unitário do produto: ");
        double produto = entrada.nextDouble();

        System.out.println("Informe a quantidade desejada: ");
        int quantidade = entrada.nextInt();

        System.out.println("Informe o valor recebido para pagamento: ");
        double valorPago = entrada.nextDouble();

        double troco = valorPago % (produto * quantidade);

        System.out.println("\nO troco é de: " + String.format("%.2f", troco));

        entrada.close();
    }
}
