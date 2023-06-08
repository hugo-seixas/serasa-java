package lista002.exercicio05;

public class Teste05 {

	public static void main(String[] args) {
		
		Ingresso ingresso = new Ingresso();
		
		ingresso.setValor(25);
		
		IngressoVip ingressoVip = new IngressoVip();
		
		ingressoVip.setValorAdicional(10);
		
		System.out.println(ingresso.toString());
		System.out.println(ingressoVip.toString());

	}

}
