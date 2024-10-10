package logica_intermediaria.collections;

import javax.swing.*;

public class Array {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Quantas notas: ");
        int quantidadeNotas = Integer.parseInt(input);

        double[] nota = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++) {
            String entradaNotas = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ": ");
            double notaAluno = Double.parseDouble(entradaNotas);
            nota[i] = notaAluno;
        }

        double notaFinal = 0;
        for (double n : nota) {
            notaFinal += n;
        }

        double mediaFinal = notaFinal / quantidadeNotas;
        System.out.println("A media do aluno foi de: " + String.format("%.1f", mediaFinal));
    }
}