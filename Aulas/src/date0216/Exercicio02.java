/* 2 - Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
 *  O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol.
 *   O segundo valor corresponde à quantidade de pontos do time lanterna. 
 *   Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o 
 *   número de vitórias necessárias para que o time lanterna alcance (ou ultrapasse) o líder. 
 *   Por exemplo, supondo que as quantidades de ponto fornecidas sejam
40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois (40-22) / 3 = 6. */

package date0216;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe os pontos do líder: ");
		double pontosLider = scanner.nextDouble();

		System.out.print("Informe os pontos do lanterna: ");
		double pontosLanterna = scanner.nextDouble();

		double vitoriasNecessarias = (pontosLider - pontosLanterna) / 3;

		System.out.println("Vitórias necessarias: " + vitoriasNecessarias);

		scanner.close();
	}

}