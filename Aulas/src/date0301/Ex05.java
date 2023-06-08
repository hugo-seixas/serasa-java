package date0301;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {

		int soma = 0;
		try {
			for (int i = 0; i < 10; i++) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				soma += num;
				System.out.println("Soma agora: " + soma);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você precisa digitar um número inteiro");
		}
		System.out.println("Soma total: " + soma);
	}

}
