//Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não
//um bom aproveitamento (se ficou acima da média 7.0).

package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));

		double media = (nota1 + nota2) / 2;

		if (media > 7.0) {
			JOptionPane.showMessageDialog(null, "A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
			JOptionPane.showMessageDialog(null, "Aluno aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
			JOptionPane.showMessageDialog(null, "Aluno reprovado");

		}

	}

}
