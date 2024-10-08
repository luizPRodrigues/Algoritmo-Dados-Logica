package Logica.estrutura_condicional;

import java.util.Scanner;

public class Glicose {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Classificacao Glicose====================");

        double normal = 100;
        double elevado = 140;

        System.out.println("Digite a medida da glicose: ");
        double medida = entrada.nextDouble();

        if (medida <= normal){
            System.out.println("Normal");
        } else if (medida > normal && medida <= elevado) {
            System.out.println("Elevado");
        } else if (medida > elevado) {
            System.out.println("Diabetes");
        }

        entrada.close();
    }
}
