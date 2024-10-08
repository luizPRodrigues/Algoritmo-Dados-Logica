package Logica.estrutura_condicional;

import java.util.Scanner;

public class TempoJogo {

    private static final int VINTEQUATROHORAS = 24;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("\n====================Tempo de Jogo====================");

        System.out.println("HoraInicial: ");
        int horaInicial = entrada.nextInt();

        System.out.println("HoraFinal: ");
        int horaFinal = entrada.nextInt();

        if (horaFinal > horaInicial) {
            int duracao = horaFinal - horaInicial; //subtrair o final com o inicial chega no falor que durou
            System.out.println("O jogo durou: " + duracao + " horas e terminou no mesmo dia!");
        } else if (horaFinal < horaInicial) {
            int tempoAteMeiaNoite = (VINTEQUATROHORAS % horaInicial) + horaFinal; //(O resto calcula o tempo que falta até 00:00 depois soma + com a hora termino)
            System.out.println("O jogo durou: " + tempoAteMeiaNoite + " horas e terminou no dia seguinte!");
        } else {
            System.out.println("O jogo durou 24 horas");
        }

        entrada.close();
    }
}
