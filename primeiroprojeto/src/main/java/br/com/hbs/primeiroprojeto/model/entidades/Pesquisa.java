package br.com.hbs.primeiroprojeto.model.entidades;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class Pesquisa {
	
	@EqualsAndHashCode.Include
	@Getter
	private Integer id;
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private String sexo;
	
	@Getter
	@Setter
	private String estadoCivil;
	
	

}
