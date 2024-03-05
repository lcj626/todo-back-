package com.ohgiraffers.todolist.repository;

import com.ohgiraffers.todolist.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity,Long> {

//    List<TodoEntity> findByRegistDate(LocalDateTime registDate);

//    List<TodoEntity> findByRegistDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

//    List<TodoEntity> findByDate(LocalDate date);
}
