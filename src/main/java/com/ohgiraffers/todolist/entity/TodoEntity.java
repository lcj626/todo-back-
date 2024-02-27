package com.ohgiraffers.todolist.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tbl_todo")
public class TodoEntity {

    @Id
    @Column(name = "todo_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "todo_contents")
    private String contents;

    @Column(name = "regist_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registDate;

    @Column(name = "todo_complete")
    private Boolean isCompleted;

    public TodoEntity() {
    }

    public TodoEntity(Long id, String contents, LocalDateTime registDate, Boolean isCompleted) {
        this.id = id;
        this.contents = contents;
        this.registDate = registDate;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime getRegistDate() {
        return registDate;
    }

    public void setRegistDate(LocalDateTime registDate) {
        this.registDate = registDate;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", registDate=" + registDate +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
