package lista002.exercicio07ao12;

public class Operario extends Empregado {
	
	private double valorProducao;
	private double comissao;

	public Operario() {
	}

	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + getComissao();
	}

	public double getComissao() {
		return this.valorProducao * this.comissao / 100;
	}
	

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	

}
