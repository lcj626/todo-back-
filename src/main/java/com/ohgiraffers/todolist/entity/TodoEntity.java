package com.ohgiraffers.todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_todo")
public class TodoEntity {

    @Id
    @Column(name = "todo_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "todo_contents")
    private String contents;

    @Column(name = "status")
    private String status;

    public TodoEntity() {
    }

    public TodoEntity(Long id, String contents, String status) {
        this.id = id;
        this.contents = contents;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
