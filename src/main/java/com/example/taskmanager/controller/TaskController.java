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

    // タスクの一覧表示
    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "task_list";  // task_list.htmlを表示
    }

    // 新しいタスク追加のフォーム表示
    @GetMapping("/new")
    public String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "task_form";  // task_form.htmlを表示
    }

    // タスクの追加処理
    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.addTask(task);
        return "redirect:/tasks";  // タスク一覧ページへリダイレクト
    }

    // タスクの詳細表示
    @GetMapping("/{id}")
    public String showTaskDetails(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "task_detail";  // task_detail.htmlを表示
    }
}
