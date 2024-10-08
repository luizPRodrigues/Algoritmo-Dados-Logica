package Logica.estrutura_condicional;

import java.util.Scanner;

public class TrocoVerificado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n====================Troco Verificado====================");

        System.out.println("Digite o valor da unidade do produto: ");
        double valorProduto = entrada.nextDouble();

        System.out.println("Digite a quantidade comprada: ");
        double quantidadeComprada = entrada.nextDouble();

        System.out.println("Valor Pago: ");
        double valorPago = entrada.nextDouble();

        double valorTotal = valorProduto * quantidadeComprada;
        double troco = valorPago - valorTotal;
        double valorFaltante = valorTotal - valorPago;

        if (valorPago > valorTotal){
            System.out.println("Seu troco é de: R$ " + troco + " aqui está seu comprovante!");
        } else if (valorPago < valorTotal) {
            System.out.println("O valor pago nao é o suficiente, o restante faltante é de: R$ " + valorFaltante + "\nQual será a segunda forma de pagamento?");
        }else{
            System.out.println("Compra efetuada com sucesso aqui está seu comprovante!");
        }

        entrada.close();
    }
}
