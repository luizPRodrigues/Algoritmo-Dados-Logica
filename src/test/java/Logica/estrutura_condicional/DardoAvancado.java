package Logica.estrutura_condicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DardoAvancado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter(" ");

        System.out.println("\n====================Arremesso de Dardo====================");

        System.out.println("Digite as tres distancias: ");

            String iteracao = entrada.nextLine(); //itera 1x sobre a linha fornecida em 'entrada'
            String[] distancias = iteracao.split(" "); //divide a String em substrings usando espaco como delimitador

            List<Double> distanciaUnificada = new ArrayList<>(); //adicionando o array de distancias para uma lista onde cada
            distanciaUnificada.add(Double.parseDouble(distancias[0])); //indice foi convertido e posteriormente é realizado a
            distanciaUnificada.add(Double.parseDouble(distancias[1])); //utilizacao do metodo max que facilita na busca do maior
            distanciaUnificada.add(Double.parseDouble(distancias[2])); //elemento numa colecao
            System.out.println("A distancia vencedora é: " + String.format("%.2f", Collections.max(distanciaUnificada)));

        entrada.close();
    }
}