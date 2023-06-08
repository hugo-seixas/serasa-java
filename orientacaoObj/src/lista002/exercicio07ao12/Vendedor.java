package lista002.exercicio07ao12;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor() {
	}

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + getComissao();
	}
	
	public double getComissao() {
		return this.valorVendas * this.comissao / 100;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
