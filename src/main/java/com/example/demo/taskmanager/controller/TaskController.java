package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // �^�X�N�̈ꗗ�\��
    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "task_list";  // task_list.html��\��
    }

    // �V�����^�X�N�ǉ��̃t�H�[���\��
    @GetMapping("/new")
    public String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "task_form";  // task_form.html��\��
    }

    // �^�X�N�̒ǉ�����
    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";  // �^�X�N�ꗗ�y�[�W�փ��_�C���N�g
    }

    // �^�X�N�̏ڍו\��
    @GetMapping("/{id}")
    public String showTaskDetails(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "task_detail";  // task_detail.html��\��
    }
}
