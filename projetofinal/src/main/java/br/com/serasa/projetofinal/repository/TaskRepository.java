package br.com.serasa.projetofinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serasa.projetofinal.model.entity.Task;
import br.com.serasa.projetofinal.model.enums.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByStatus(TaskStatus taskStatus);

}
