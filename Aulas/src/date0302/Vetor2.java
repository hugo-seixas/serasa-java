package date0302;

public class Vetor2 {

	public static void main(String[] args) {

//		String frutas[] = {"Banana", "Maçã", "Uva", "Maracujá", "Morango"};
		String frutas[] = new String[5];
		String frutas2[] = { "Banana", "Maçã", "Uva", "Maracujá", "Morango" };
		frutas = frutas2;

		System.out.println(frutas[3]);

		// for normal
		for (int i = 0; i < frutas2.length; i++) {
			if (frutas2[i].equals("Banana")) {
				System.out.println("Fruta " + frutas2[i]);
			}
		}

		// foreach

		for (String fruta : frutas2) {
			if (fruta.equals("Banana")) {
				System.out.println("Fruta: " + fruta);
			}

		}

	}

}
