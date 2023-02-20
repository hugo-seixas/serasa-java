//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre
//em quantos anos faltam para o alistamento. - Se já tiver depois dos 18 anos, mostre
//quantos anos já se passaram do alistamento.


package date0217.ex_condicionais;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		int anoAtual = data.get(Calendar.YEAR);

		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano de Nascimento: "));

		int idade = anoAtual - anoNascimento;

		if (idade == 18) {
			JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.\nAliste-se já!");
		}
		if (idade > 18) {
			int idadeMaior = idade - 18;
			JOptionPane.showMessageDialog(null,
					"Você tem " + idade + " anos.\nPassou " + idadeMaior + " anos do seu Alistamento!");
		}
		if (idade < 18) {
			int idadeMenor = 18 - idade;
			JOptionPane.showMessageDialog(null,
					"Você tem " + idade + " anos.\nSó pode se Alistar daqui a " + idadeMenor + " ano(s) ");
		}

	}

}
