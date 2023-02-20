/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. */
package date0216;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double valorProduto, porcentagemDesconto, valorDesconto;

		System.out.print("Informe o valor do produto: ");
		valorProduto = scanner.nextDouble();

		System.out.print("Informe a porcentagem de desconto: ");
		porcentagemDesconto = scanner.nextDouble();

		valorDesconto = valorProduto * porcentagemDesconto / 100;

		System.out.println("******************************************************************");
		System.out.println("Valor do Produto: R$ " + valorProduto);
		System.out.println("Porcentagem de desconto: " + porcentagemDesconto + " %");
		System.out.println("Valor do desconto: R$ " + valorDesconto);
		System.out.println("Valor do produto com desconto: R$ " + (valorProduto - valorDesconto));
		System.out.println("******************************************************************");

		scanner.close();
	}

}