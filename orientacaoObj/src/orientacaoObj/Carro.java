package orientacaoObj;

public class Carro {
	
	String modelo;
	String fabricante;
	String cor;

	int qtdPortas;
	int potenciaCavalos;
	int qtdmarchas;

	double velocidadeMaxima;
	
	boolean temArCondicionado;
	boolean estaLigado = false;
	
	public void liga (boolean estaLigado) {
		if(estaLigado == false) {
			this.estaLigado = true;
		}
	}
	
	public void desliga (boolean estaLigado) {
		if(estaLigado) {
			this.estaLigado = false;
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", fabricante=" + fabricante + ", cor=" + cor + ", qtdPortas=" + qtdPortas
				+ ", potenciaCavalos=" + potenciaCavalos + ", qtdmarchas=" + qtdmarchas + ", velocidadeMaxima="
				+ velocidadeMaxima + ", temArCondicionado=" + temArCondicionado + ", estaLigado=" + estaLigado + "]";
	}
	
	
	
	
	
}
