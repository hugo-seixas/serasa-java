package br.com.serasa.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.serasa.projetofinal.model.entity.Task;
import br.com.serasa.projetofinal.repository.TaskRepository;
import jakarta.validation.Valid;

@Controller
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	// Acessa o formulario
	@GetMapping("/form")
	public String taskForm(Task task) {

		return "addTasksForm";
	}

	// Adiciona nova task
	@PostMapping("/add")
	public String novo(@Valid Task task, BindingResult result) {

		if (result.hasFieldErrors()) {
			return "redirect:/form";
		}

		taskRepository.save(task);

		return "redirect:/home";
	}

	// Acessa o formulario de edição
	@GetMapping("form/{id}")
	public String editTask(Model model, @PathVariable(name = "id") Long id) {

		Task task = taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid task Id:" + id));

		model.addAttribute("task", task);
		return "atualizaForm";
	}

	// Atualiza task
	@PostMapping("update/{id}")
	public String updateTask(@Valid Task task, BindingResult result, @PathVariable Long id) {

		if (result.hasErrors()) {
			return "redirect:/form";
		}

		taskRepository.save(task);
		return "redirect:/home";
	}

	@GetMapping("delete/{id}")
	@CacheEvict(value = "task", allEntries = true)
	public String deleteTask(@PathVariable(name = "id") Long id, Model model) {

		Task task = taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

		taskRepository.delete(task);
		return "redirect:/home";
	}

}
