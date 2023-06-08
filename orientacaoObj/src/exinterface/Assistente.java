package exinterface;

public class Assistente extends Funcionario implements IFuncionario{

	@Override
	public double calculaSalario() {
		return getSalarioBase();
	}

}
