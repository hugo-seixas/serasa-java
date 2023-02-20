//Desenvolva um algoritmo que leia dois números inteiros e mostre o
//somatório entre eles

package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + soma); 

	}

}
