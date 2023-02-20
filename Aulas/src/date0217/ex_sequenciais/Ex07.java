//Crie um algoritmo que leia um número real e mostre na tela o seu dobro
//e a sua terça parte. Ex: Digite um número: 3.5 O dobro de 3.5 é 7.0 A terça parte de 3.5 é
//1.16666

package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		JOptionPane.showMessageDialog(null, "O dobro de " + num + " é " + (num*2) 
										+ "\nA terça parte de " + num + " é " + (num/3)); 
		
	}

}
