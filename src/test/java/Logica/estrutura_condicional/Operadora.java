package Logica.estrutura_condicional;

import java.util.Scanner;

public class Operadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Operadora====================");
        double planoBasico = 50.0;
        int minutosDisponíveis = 100;
        double excedente = 2.0;

        System.out.println("Digite a quantidade de minutos utilizado no período: ");
        double minutosUtilizados = entrada.nextDouble();

        //deixando o codigo aqui ele sera exectado independentemente de cair na condicao else-if ou nao
        double minutosExcedentes = minutosUtilizados - minutosDisponíveis;
        double valorTotal = planoBasico + minutosExcedentes * excedente;

        if (minutosUtilizados <= minutosDisponíveis) {
            System.out.println("A fatura do mes vigente não consta excedente, o valor a pagar é de: R$ " + planoBasico);
        } else if (minutosUtilizados > minutosDisponíveis) {
            System.out.println("A fatura do mes vigente excede o plano basico e o total a pagar é de: R$ "
                    + String.format("%.2f", valorTotal));
        }

        entrada.close();
    }
}
