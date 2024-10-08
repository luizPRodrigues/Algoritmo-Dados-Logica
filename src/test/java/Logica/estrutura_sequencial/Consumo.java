package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\n====================Calculo de distancia====================");

        System.out.println("Insira a distancia percorrida: ");
        double distanciaTotal = entrada.nextDouble();

        System.out.println("Insira o total de combustivel gasto: ");
        double combustivelGasto = entrada.nextDouble();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.println("O consumo medio do trajeto percorrido é de: " + String.format("%.3f" ,consumoMedio));
        entrada.close();
    }
}
