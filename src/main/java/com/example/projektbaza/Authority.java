package com.example.projektbaza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Authority {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false, unique = true)
    String name;

    protected Authority(){

    }

    public Authority(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
