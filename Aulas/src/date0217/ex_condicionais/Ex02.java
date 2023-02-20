//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.


package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		
		final int ANO_ATUAL = 2023;
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu nascimento? "));
		
		int idade = ANO_ATUAL - anoNascimento;
		
		if (idade <=15) {
			JOptionPane.showMessageDialog(null, "Você não pode votar");
		}
		if ((idade >=16 && idade < 18) || idade >= 70) {
			JOptionPane.showMessageDialog(null, "O voto é facultativo");
			
		}
		if (idade >=18 && idade < 70) {
			JOptionPane.showMessageDialog(null, "Você é obrigado a votar");
			
		}
		
	}


}
