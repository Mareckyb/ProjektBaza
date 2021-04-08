package com.example.projektbaza;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue
    Long id;

    @Column(length = 200, nullable = false)
    String name;

    @OneToMany
    Set<Issue> issues;

    Boolean enabled;
    Date dateCreated;

    @Column(length = 100, nullable = false, unique = true)
    String code;

    @Column(length = 500)
    String description;
    @OneToOne
    Person creator;
}
