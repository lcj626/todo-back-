package com.ohgiraffers.todolist.service;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoEntity> getTodos(){
        return todoRepository.findAll();
    }

    public TodoEntity updateTodo(TodoEntity todoEntity){
        return todoRepository.save(todoEntity);
    }
}
