package com.ohgiraffers.todolist.controller;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.service.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;



    @GetMapping
    public String getAll(HttpServletRequest request){

        String date = request.getParameter("date");

        System.out.println(date);

        return date;
    }


//    @GetMapping("/{selectedDate}")
//    public List<TodoEntity> getTododsByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime selectedDate){
//            return todoService.getTodosByDate(selectedDate);
//    }

    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todoEntity){
        todoEntity.setRegistDate(LocalDateTime.now());
        todoEntity.setCompleted(false);
        return todoService.updateTodo(todoEntity);
    }




}
