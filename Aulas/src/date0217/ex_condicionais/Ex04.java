//Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.


package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
		if (num % 2 == 0) JOptionPane.showMessageDialog(null, "O número " + num + " é par");
		else JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar");

	}

}
