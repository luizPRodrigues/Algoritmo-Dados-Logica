package Logica.estrutura_repeticao;

import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Checagem de Quadrante====================");

        double eixo_x = 1;
        double eixo_y = 1;
        while (eixo_x != 0 && eixo_y != 0) {
            System.out.println("Digite os valores das coordenadas X: ");
            eixo_x = entrada.nextDouble();

            System.out.println("Digite os valores das coordenadas Y: ");
            eixo_y = entrada.nextDouble();

            if (eixo_x > 0 && eixo_y > 0) {
                System.out.println("O ponto esta no quadrante 'Q1'");
            } else if (eixo_x < 0 && eixo_y > 0) {
                System.out.println("O ponto esta no Quadrante 'Q2'");
            } else if (eixo_x < 0 && eixo_y < 0) {
                System.out.println("O ponto esta no quadrante 'Q3'");
            } else if (eixo_x > 0 && eixo_y < 0) {
                System.out.println("O ponto esta no esta no Quadrante 'Q4'");
            }
        }
        entrada.close();
    }
}
