package Logica.estrutura_sequencial;

public class SaidaDados {

    public static void main(String[] args) {

        String produto1 = "Computador ";
        Double preco1 = 2100.5;
        String produto2 = "TV ";
        Double preco2 = 1830.0;

        int idade = 30;
        int codigo = 5291;
        String genero = "F";

        System.out.println("Produtos: " + "\nO produto " + produto1 + "custa R$ "
                + String.format("%.2f", preco1)
                + "\nO produto " + produto2 + "custa R$ " + String.format("%.2f", preco2)
                + "\n\nCodigo = " + codigo
                + "\n\nDados da pessoa: " + "genero " + genero + " e idade " + idade);
    }
}
