package com.book.task.entity;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.annotation.*;



import lombok.Data;
import lombok.RequiredArgsConstructor;


import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @NotNull(message = "{NotNull.Task.name}")
    private String name;

    @Column
    @NotNull(message = "{NotNull.Task.description}")
    private String description;

}
