//Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para
//todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e
//o valor das compras do cliente e calcule o preço com desconto.
//Sabendo que: - Homens ganham 5% de desconto - Mulheres ganham 13% de
//desconto

package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String[] args) {
		
		Object[] opcoes = {"Masculino", "Feminino"};
		
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		String sexo = (String) JOptionPane.showInputDialog(
						null,
						"Selecione o sexo:\n",
						"Pesquisa",
						JOptionPane.PLAIN_MESSAGE,
						null,
						opcoes,
						"Masculino");
		
		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra"));
		
		if (sexo == "Feminino") {
			double valorDescontoF = valorCompra - valorCompra * 13/100; 
			JOptionPane.showMessageDialog(null, "Valor da compra com desconto: " + valorDescontoF);
		}
		else {
			double valorDescontoM = valorCompra - valorCompra * 5/100; 
			JOptionPane.showMessageDialog(null, "Valor da compra com desconto: " + valorDescontoM);
			
		}
	}
	

}
