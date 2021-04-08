package com.example.projektbaza;

import com.example.projektbaza.enums.Priority;
import com.example.projektbaza.enums.Status;
import com.example.projektbaza.enums.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Issue {
    @Id
    @GeneratedValue
    Long id;

    @Enumerated(EnumType.STRING)
    Status status = Status.PENDING;

    @Enumerated(EnumType.STRING)
    Priority priority = Priority.LOW;

    @Enumerated(EnumType.STRING)
    Type type = Type.BIZZARD;

    @Column(unique = false, nullable = false, length = 300)
    String name;
    @OneToOne
    Person creator;
    @OneToOne
    Person assignee;
    Date dateCreated;
    Date lastUpdate;
    @OneToMany
    List<Comment> comments;



}
