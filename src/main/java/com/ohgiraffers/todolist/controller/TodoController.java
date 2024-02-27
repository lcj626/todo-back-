package com.ohgiraffers.todolist.controller;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;



    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TodoEntity> getAll(){
        return todoService.getTodos();
    }

    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todoEntity){
        todoEntity.setRegistDate(LocalDateTime.now());
        todoEntity.setCompleted(false);
        return todoService.updateTodo(todoEntity);
    }
}
