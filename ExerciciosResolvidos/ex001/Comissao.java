/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

*************************************************************************/

import java.util.*;
public class Comissao{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vendedor: ");
        String vendedor = sc.nextLine();

        System.out.println("Codigo da peça: ");
        int codPeca = sc.nextInt();

        System.out.println("Preço unitário da peça: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade da peça: ");
        int qtd = sc.nextInt();

        double valor = qtd * preco;
        double comissao = valor * 0.05;
        System.out.printf("Valor total R$: %.2f", valor);

        System.out.println("\n======================");
        System.out.println("Comissão de 5% sobre a venda R$: " + comissao + "\nVendedor: "+ vendedor);


    }
}