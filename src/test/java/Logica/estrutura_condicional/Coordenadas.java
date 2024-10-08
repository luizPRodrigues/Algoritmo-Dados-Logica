package Logica.estrutura_condicional;

import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Checagem de Coordenadas====================");

        System.out.println("Digite o Eixo X: ");
        double eixo_x = entrada.nextDouble();

        System.out.println("Digite o Eixo Y: ");
        double eixo_y = entrada.nextDouble();

        if (eixo_x == 0 && eixo_y == 0) {
            System.out.println("O eixo esta no 'Ponto de Origem'");
        } else if (eixo_x == 0) {
            System.out.println("O ponto esta no eixo 'Y'");
        } else if (eixo_y == 0) {
            System.out.println("O ponto esta no eixo 'X'");
        } else if (eixo_x > 0 && eixo_y > 0) {
            System.out.println("O ponto esta no quadrante 'Q1'");
        } else if (eixo_x < 0 && eixo_y > 0) {
            System.out.println("O ponto esta no Quadrante 'Q2'");
        } else if (eixo_x < 0 && eixo_y < 0) {
            System.out.println("O ponto esta no quadrante 'Q3'");
        } else if (eixo_x > 0 && eixo_y < 0) {
            System.out.println("O ponto esta no esta no Quadrante 'Q4'");
        }
    }
}