package Logica.estrutura_condicional;

import java.util.Scanner;

public class Dardo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Arremesso de Dardo====================");

        System.out.println("Digite as tres distancias: ");

            String iteracao = entrada.nextLine(); //itera 1x sobre a linha fornecida em 'entrada'
            String[] distancias = iteracao.split(" "); //divide a String em substrings usando espaco como delimitador
            double conversao0 = Double.parseDouble(distancias[0]); //converte cada elemento do array em double
            double conversao1 = Double.parseDouble(distancias[1]);
            double conversao2 = Double.parseDouble(distancias[2]);

            if (conversao0 > conversao1 && conversao0 > conversao2) {
                System.out.println("A distancia vencedora é: " + conversao0);
            } else if (conversao1 > conversao0 && conversao1 > conversao2) {
                System.out.println("A distancia vencedora é: " + conversao1);
            } else {
                System.out.println("A distancia vencedora é: " + conversao2);
            }

        entrada.close();
    }
}