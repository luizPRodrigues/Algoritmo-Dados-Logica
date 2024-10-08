package Logica.estrutura_repeticao;

import java.util.Scanner;

public class MediaIdades {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Media Idades====================");

        int idades = 0;
        double somaIdades = 0;
        double qtdIdades = 0;
        double media;
        while (idades >= 0) {

            System.out.println("Digite as idades: \n");
            idades = entrada.nextInt();

            if (idades >= 0) {
                qtdIdades++;

                somaIdades += idades;

            }
        }

        if (qtdIdades == 0) {
            System.out.println("IMPOSSIVEL CALCULAR!");
        } else {

            media = somaIdades / qtdIdades;

            System.out.println("MEDIA: " + String.format("%.2f", media));

        }
        entrada.close();
    }
}
