package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome? ");

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário? "));

		JOptionPane.showMessageDialog(null, "O funcionário " + nome 
										+ "\n tem um salário de R$ " + salario + " em Junho");
	}

}
