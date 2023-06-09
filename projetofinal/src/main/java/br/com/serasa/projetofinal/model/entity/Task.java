package br.com.serasa.projetofinal.model.entity;

import java.time.LocalDate;

import br.com.serasa.projetofinal.model.enums.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String descricao;
	private LocalDate dataConclusao;

	@Enumerated(EnumType.STRING)
	private TaskStatus status;

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

}
