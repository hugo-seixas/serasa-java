package empregados;

public class Secretario {
	
	String nome;
	
	public void enviarEmail(String emailDestinatario, String cc, String assunto, String conteudo) {
		String fullEmail = 
				"Assunto: " + assunto
				+"\nConteúdo: " + conteudo
				+"\nDestinatário: " + emailDestinatario
				+"\nCC: " + cc;
		
		System.out.println(fullEmail);
	}

}
