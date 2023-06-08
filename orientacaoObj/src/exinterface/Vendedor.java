package exinterface;

public class Vendedor extends Funcionario implements IFuncionario {

	private double comissao;
	
	public Vendedor(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public double calculaSalario() {
		return getSalarioBase() + this.comissao;
	}

}
