package com.example.projektbaza;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false, unique = true, length = 100)
    private String login;
    @Column(nullable = false, length = 20)
    private String password;
    @Column(unique = false, length = 100)
    private String userRealName;
    @Column(nullable = false)
    private Date dateCreated;

    @ManyToMany
    @JoinTable (name = "person_authorities",
                joinColumns = @JoinColumn(name = "person_id"),
                inverseJoinColumns = @JoinColumn (name = "authority_id"))
    Set <Authority> authorities;

    protected Person() {
    }

    public Person (String login, String password, String userRealName) {
        this.login = login;
        this.password = password;
        this.userRealName = userRealName;
        this.dateCreated = new Date();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public String getlogin() {
        return login;
    }






}
