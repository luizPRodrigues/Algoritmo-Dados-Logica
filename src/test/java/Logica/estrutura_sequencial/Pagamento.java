package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Calculo de pagamento====================");

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o valor pago por hora: ");
        double valorPorHora = entrada.nextDouble();

        System.out.println("Digite o valor ganho por hora do seu dia trabalho: ");
        double horasTrabalhadas = entrada.nextDouble();

        double calculoSalario = valorPorHora * horasTrabalhadas;

        System.out.println("O pagamento para " + nome + "deve ser " + String.format("%.2f", calculoSalario));

        entrada.close();
    }
}
