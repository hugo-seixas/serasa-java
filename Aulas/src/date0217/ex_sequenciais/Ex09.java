//Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
//(em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		double reais = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais você tem: "));
		double dolar = reais / 3.45;
		JOptionPane.showMessageDialog(null, "Você tem R$ " + reais + " e pode comprar US$" + dolar);
	}

}
