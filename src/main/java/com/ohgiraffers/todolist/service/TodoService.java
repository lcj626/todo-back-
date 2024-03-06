package com.ohgiraffers.todolist.service;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

//    public List<TodoEntity> getTodos(){
//        return todoRepository.findAll();
//    }

//    public List<TodoEntity> getTodosByDate(String dateParam){
//        LocalDate date = LocalDate.parse(dateParam);
//
//        return todoRepository.findByDate(date);
//    }


    public List<TodoEntity> findTodosByDate(Date date) {
        return todoRepository.findByRegistDate(date);
    }


//    public List<TodoEntity> getTodosByDate(String date) {
//        LocalDateTime dateTime = LocalDateTime.parse(date);
//        return todoRepository.findByRegistDate(dateTime);
//    }
//
//    public TodoEntity updateTodo(TodoEntity todoEntity){
//        return todoRepository.save(todoEntity);
//    }


//    public List<TodoEntity> getTodosByDate(LocalDate date) {
//        return todoRepository.findByRegistDate(date);
//    }

    public TodoEntity addTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }
}
