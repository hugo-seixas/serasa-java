package exinterface;

public class Gerente extends Funcionario implements IFuncionario {

	@Override
	public double calculaSalario() {
		return getSalarioBase() * 2;
	}

}
