package Logica.estrutura_sequencial;

import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        Double largura = entrada.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        Double comprimento = entrada.nextDouble();

        //descobrindo a area do terreno= largura * comprimento
        Double areaTerreno = largura * comprimento;
        System.out.println("A area do terreno é: " + String.format("%.2f", areaTerreno));

        System.out.println("\nDigite o valor do metro quadrado: ");
        Double mt = entrada.nextDouble();

        //descobrindo o preco do terreno= area * mt
        Double precoTerreno = areaTerreno * mt;
        System.out.println("O preco do terreno é: " + String.format("%.2f", precoTerreno));

        entrada.close();
    }
}
