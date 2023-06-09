package br.com.serasa.projetofinal.model.enums;

public enum TaskStatus {
	
	PENDENTE("pendente"), PROGRESSO("progresso"), CONCLUIDA("concluida");

	private String value;

	private TaskStatus(String value) {
		this.value = value;
	}

	public String getStatus() {
		return value;
	}
	
}
