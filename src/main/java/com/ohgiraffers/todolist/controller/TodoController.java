package com.ohgiraffers.todolist.controller;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;



    @GetMapping
    public List<TodoEntity> getAll(){
        return todoService.getAll();
    }

    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todoEntity){
        return todoService.updateTodo(todoEntity);
    }
}
