package Logica.estrutura_condicional;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Verificacao condicional====================");

        double notaAnual = 60.00;
        double notaMaxima = 100;

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double total = nota1 + nota2;

        if(total >= notaAnual && total < notaMaxima) {
            System.out.println("==================== Aprovado com a nota: " + total + " ====================");
        }else if(total >= notaMaxima){
            System.out.println("==================== GABARITOU A PROVA com a nota: " + total + " ====================");
        }else{
            System.out.println("==================== Reprovado  com a nota: " + total + " ====================");
        }

        entrada.close();
    }
}
