// Faça um programa que leia um número inteiro e mostre o seu antecessor
//e seu sucessor.
//Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é 10


package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é " + (num-1) 
										+ "\nO sucessor de " + num + " é " + (num+1)); 
		
	}

}
