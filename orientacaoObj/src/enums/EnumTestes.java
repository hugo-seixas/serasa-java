package enums;

import enums.entidade.Endereco;
import enums.entidade.Pessoa;

public class EnumTestes {

	public static void main(String[] args) {

//		Turno turno = Turno.TARDE;
//
//		System.out.println("Turno: " + Turno.values());
//
//		for (Turno t : Turno.values()) {
//			System.out.println("Turno: " + t.getDescricao());
//		}
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("José");
		pessoa.setSobreNome("da Silva");
		pessoa.setIdade(45);
		pessoa.setRg("123456");
		pessoa.setCpf("123456789-99");
		pessoa.setSexo(Sexo.MASCULINO);
		pessoa.setCorPele(CorPele.NAO_DECLARADO);
		pessoa.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		Endereco endereco = new Endereco();
		endereco.setTipo(TipoLogradouro.RUA);
		endereco.setLogradouro("do Passeio");
		endereco.setComplemento(" - ");
		endereco.setNumero("38");
		endereco.setBairro("Cinelandia");
		endereco.setCidade("Rio de Janeiro");
		
		pessoa.setEndereco(endereco);
		
		System.out.println("Pessoa: " + pessoa);
		
		
		
		
		
		
		
	}

}
