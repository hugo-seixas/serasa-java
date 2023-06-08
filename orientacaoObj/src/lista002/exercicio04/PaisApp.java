package lista002.exercicio04;

public class PaisApp {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais("13360-1", "Itália", 12345645.4564);
		
		pais1.setPopulacao(59000000);
		
		pais1.getPaisesFronteiricos().add("França");
		pais1.getPaisesFronteiricos().add("Suíça");
		pais1.getPaisesFronteiricos().add("Austria");
		pais1.getPaisesFronteiricos().add("Eslovênia");

		Pais pais2 = new Pais("13361-2", "França", 12346847.4564);
		
		pais2.setPopulacao(68000000);
		
		pais2.getPaisesFronteiricos().add("Espanha");
		pais2.getPaisesFronteiricos().add("Itália");
		pais2.getPaisesFronteiricos().add("Suíça");
		pais2.getPaisesFronteiricos().add("Alemanha");
		pais2.getPaisesFronteiricos().add("Bélgica");
		pais2.getPaisesFronteiricos().add("Inglaterra");
		
		System.out.println("Densidade populacional " + pais1.getNome() + ": " + pais1.getDensidadePopulacional());
		System.out.println("Densidade populacional " + pais2.getNome() + ": " + pais2.getDensidadePopulacional());
		
		System.out.println("É limítrofe? " + pais1.isLimitrofe("Alemanha")); 
		System.out.println("É limítrofe? " + pais1.isLimitrofe("Eslovênia")); 

		System.out.println("É limítrofe? " + pais2.isLimitrofe("Brasil")); 
		System.out.println("É limítrofe? " + pais2.isLimitrofe("Inglaterra")); 

	}

}
