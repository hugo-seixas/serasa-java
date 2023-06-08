package empregados;

public class Test {

	public static void main(String[] args) {
		
		Secretario secretario = new Secretario();
		Diretor diretor = new Diretor();
		
		diretor.enviarEmail("fulano@email.com", null, "Futebol de sexta", "Bora jogar bola na sexta!!! 22h");

	}

}
