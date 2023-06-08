package orientacaoObj;

import javax.swing.JOptionPane;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.modelo = "Corolla 2000 XEI";
		carro.fabricante = "Toyota";
		carro.cor = "Prata";
		carro.potenciaCavalos = 142;
		carro.qtdmarchas = 4;
		carro.qtdPortas = 4;
		carro.temArCondicionado = true;
		
		System.out.println("Está ligado? " + carro.estaLigado);
		
		carro.liga(carro.estaLigado);
		System.out.println("Está ligado? " + carro.estaLigado);
		
		JOptionPane.showMessageDialog(null, carro.toString());
		System.out.println(carro.toString());

	}

}
