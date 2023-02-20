//Desenvolva um programa que leia uma distância em metros e mostre os
//valores relativos em outras medidas. Ex: Digite uma distância em metros: 185.72
//A distância de 185.72m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm

package date0217.ex_sequenciais;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em metros: "));
		double Km = distancia / 1000;
		double Hm = distancia / 100;
		double Dam = distancia / 10;
		double dm = distancia * 10;
		double cm = distancia * 100;
		JOptionPane.showMessageDialog(null, "A distância de " + distancia + "m" + " corresponde a: \n" + Km + "km \n"
				+ Hm + "Hm \n" + Dam + "Dam \n" + dm + "dm \n" + cm + "cm");

	}

}
