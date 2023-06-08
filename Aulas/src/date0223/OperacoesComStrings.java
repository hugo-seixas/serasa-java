package date0223;

import javax.swing.JOptionPane;

public class OperacoesComStrings {

	public static void main(String[] args) {
		
		String senha;
		
		do {
			senha = JOptionPane.showInputDialog("Digite sua senha: ");
		}while(senha.length() < 8);
		
		
	}

}
