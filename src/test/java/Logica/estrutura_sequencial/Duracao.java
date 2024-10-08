package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Impressao de Duracao H:M:S====================");

        System.out.println("Digite a duracao em segundos: ");
        int duracao = entrada.nextInt();
        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        System.out.println("A duracao de tempo em segundos para o valor digitado é de: " + horas + ":" + minutos + ":" + segundos);

        entrada.close();
    }
}
