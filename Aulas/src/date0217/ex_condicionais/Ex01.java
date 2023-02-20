//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
//exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.



package date0217.ex_condicionais;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

		double velocidadeDoVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Entre com a velocidade do veículo: "));
		
		if (velocidadeDoVeiculo > 80) {
			double valorDaMulta = (velocidadeDoVeiculo - 80) * 5;
			JOptionPane.showMessageDialog(null, "Você foi multado em: R$ " + valorDaMulta);
		}
	}

}
