//Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o
//serviço, sabendo que cada litro de tinta pinta uma área de 2metros
//quadrados.

package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da parede: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da parede: "));
		double area = largura * altura;
		double tinta = area / 2;
		JOptionPane.showMessageDialog(null, "A área da sua parede é " + area + "m²" 
									+ "\nVocê precisa de: " + tinta + " litros de tinta");
	}

}
