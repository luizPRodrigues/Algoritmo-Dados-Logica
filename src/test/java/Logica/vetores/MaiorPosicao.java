package Logica.vetores;

import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================MAIOR POSICAO====================");

        System.out.println("\n====================Quantos Numeros Voce Vai Digitar?====================");
        int num = entrada.nextInt();

        double vetor[] = new double[num];
        double maiorValor = -0;
        int posicao = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Digite um numero: ");
            double n = entrada.nextDouble();
            vetor[i] = n; //recebe o valor digitado a cada nova iteracao
            if (vetor[i] > maiorValor) { //verifica se o que foi digitado é maior que o que está armazenado
                maiorValor = vetor[i];   // se for maior, o maior valor recebe o novo valor
                posicao = i;             // obtem a posicao do maior valor
            }

        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        entrada.close();
    }
}