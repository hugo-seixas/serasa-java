package lista002.exercicio04;

public class PaisApp {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais("13360-1", "It�lia", 12345645.4564);
		
		pais1.setPopulacao(59000000);
		
		pais1.getPaisesFronteiricos().add("Fran�a");
		pais1.getPaisesFronteiricos().add("Su��a");
		pais1.getPaisesFronteiricos().add("Austria");
		pais1.getPaisesFronteiricos().add("Eslov�nia");

		Pais pais2 = new Pais("13361-2", "Fran�a", 12346847.4564);
		
		pais2.setPopulacao(68000000);
		
		pais2.getPaisesFronteiricos().add("Espanha");
		pais2.getPaisesFronteiricos().add("It�lia");
		pais2.getPaisesFronteiricos().add("Su��a");
		pais2.getPaisesFronteiricos().add("Alemanha");
		pais2.getPaisesFronteiricos().add("B�lgica");
		pais2.getPaisesFronteiricos().add("Inglaterra");
		
		System.out.println("Densidade populacional " + pais1.getNome() + ": " + pais1.getDensidadePopulacional());
		System.out.println("Densidade populacional " + pais2.getNome() + ": " + pais2.getDensidadePopulacional());
		
		System.out.println("� lim�trofe? " + pais1.isLimitrofe("Alemanha")); 
		System.out.println("� lim�trofe? " + pais1.isLimitrofe("Eslov�nia")); 

		System.out.println("� lim�trofe? " + pais2.isLimitrofe("Brasil")); 
		System.out.println("� lim�trofe? " + pais2.isLimitrofe("Inglaterra")); 

	}

}
