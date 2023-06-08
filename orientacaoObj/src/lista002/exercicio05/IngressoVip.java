package lista002.exercicio05;

public class IngressoVip extends Ingresso{
	
	private float valorAdicional;
	
	public IngressoVip() {
	}

	public IngressoVip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "IngressoVip [valor do ingresso = " + (getValor() + valorAdicional) + "]";
	}
	

}
