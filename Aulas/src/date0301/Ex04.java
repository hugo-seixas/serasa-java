package date0301;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas vezes deseja repetir o nome: "));
			
			String nome = JOptionPane.showInputDialog("Digite seu nome: ");
			
			for (int i = 0; i < num; i++) {
				System.out.println("Nome: " + nome);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor inválido. Digite números por favor ");
		}
	}

}
