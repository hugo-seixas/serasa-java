//Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.


package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano: "));


		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			JOptionPane.showMessageDialog(null, ano + " = é bissexto");
		}

		else {
			JOptionPane.showMessageDialog(null, ano + " = Não é bissexto");
		}

	}

}
