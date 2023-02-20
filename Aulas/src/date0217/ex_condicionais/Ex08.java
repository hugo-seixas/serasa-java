//Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em
//Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até
//200Km e R$0.45 para viagens mais longas.

package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		double distancia = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Qual a distâcia que deseja percorrer em Km? "));

		if (distancia <= 200) {
			double precoPassagem = distancia * 0.5;
			JOptionPane.showMessageDialog(null, "Total a Pagar: R$ " + precoPassagem);
		} else {
			double precoPassagem = distancia * 0.45;
			JOptionPane.showMessageDialog(null, "Total a Pagar: R$ " + precoPassagem);
		}

	}

}
