package com.ohgiraffers.todolist.controller;

import com.ohgiraffers.todolist.entity.TodoEntity;
import com.ohgiraffers.todolist.service.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }



//    @GetMapping
//    public String getAll(HttpServletRequest request){
//
//        String date = request.getParameter("date");
//
//        System.out.println(date);
//
//        return date;
//    }

    // 특정 날짜에 등록된 Todo를 조회하는 API 엔드포인트
    @GetMapping
    public ResponseEntity<List<TodoEntity>> getTodosByDate(@RequestParam("date") String dateString) {
        LocalDate localDate = LocalDate.parse(dateString);
        Date date = Date.valueOf(localDate); // LocalDate를 Date로 변환

        List<TodoEntity> todos = todoService.findTodosByDate(date);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

//    @GetMapping
//    public List<TodoEntity> getAllTodos(@RequestParam("date") String dateString) {
//        LocalDateTime dates = LocalDateTime.parse(dateString);
//        return todoService.getTodosByDate(dates);
//    }

//    @GetMapping("/find")
//    public List<TodoEntity> getTodosByDate(@RequestParam("date") String date){
//        return todoService.getTodosByDate(date);
//    }


//    @GetMapping("/{selectedDate}")
//    public List<TodoEntity> getTododsByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime selectedDate){
//            return todoService.getTodosByDate(selectedDate);
//    }

//    @PostMapping
//    public TodoEntity addTodo(@RequestBody TodoEntity todoEntity){
//        LocalDate localDate = LocalDate.now();
//        Date currentDate = Date.valueOf(localDate); // LocalDate를 Date로 변환
//        todoEntity.setRegistDate(currentDate);
//        todoEntity.setCompleted(false);
//        return todoService.updateTodo(todoEntity);
//    }


//    @GetMapping
//    public ResponseEntity<List<TodoEntity>> getTodosByDate(@RequestParam("date") LocalDate date) {
//        List<TodoEntity> todos = todoService.getTodosByDate(date);
//        return new ResponseEntity<>(todos, HttpStatus.OK);
//    }


    @PostMapping
    public ResponseEntity<TodoEntity> addTodo(@RequestBody TodoEntity todo) {
        TodoEntity addedTodo = todoService.addTodo(todo);
        return new ResponseEntity<>(addedTodo, HttpStatus.CREATED);
    }




}
