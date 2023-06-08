package cafeteira;

public class Test {

	public static void main(String[] args) {
		
		Cafeteira cafeteira = new Cafeteira();
		cafeteira.setMarca("Arno");
		cafeteira.setModelo("A1");
		cafeteira.setTipo("Capsula");

		Cafeteira cafeteira2 = new Cafeteira();
		cafeteira2.setMarca("Philco");
		cafeteira2.setModelo("Ph1");
		cafeteira2.setTipo("Filtro");
		
		System.out.println("Cafeteira 1: " + cafeteira.toString());
		System.out.println("Cafeteira 2: " + cafeteira2.toString());
		
		System.out.println("PI = " + Math.PI);		
	}

}
