package br.com.serasa.projetofinal.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskStatus {
	
	PENDENTE("Pendente"), PROGRESSO("Em Progresso"), CANCELADA("Cancelada"), CONCLUIDA("Concluída");

	private String status;

}
