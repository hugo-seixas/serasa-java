package br.com.serasa.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.serasa.projetofinal.model.entity.Task;
import br.com.serasa.projetofinal.model.enums.TaskStatus;
import br.com.serasa.projetofinal.repository.TaskRepository;

@Controller
public class HomeController {

	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/home")
	public String home(Model model) {
		List<Task> tasks = taskRepository.findAll();

		model.addAttribute("tasks", tasks);
		return "home";
	}

	@GetMapping
	public String status(@RequestParam String status, Model model) {
		TaskStatus taskStatus = TaskStatus.valueOf(status.toUpperCase());
		List<Task> tasks = taskRepository.findByStatus(taskStatus);

		model.addAttribute("tasks", tasks);
		return "home";
	}

}
