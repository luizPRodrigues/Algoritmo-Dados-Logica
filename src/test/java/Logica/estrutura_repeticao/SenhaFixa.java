package Logica.estrutura_repeticao;

import java.util.Scanner;

public class SenhaFixa {
    private static final int senhaCorreta = 2002;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Senha Fixa====================");

        System.out.println("Digite a senha: ");
        int input = entrada.nextInt();

        while (input != senhaCorreta) {
            System.out.println("Senha Invalida! Tente novamente: ");
            input = entrada.nextInt();
        }
        System.out.println("Acesso permitido!");
        entrada.close();
    }
}