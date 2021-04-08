package com.example.projektbaza;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    //@ManyToOne
    //@JoinColumn(name = "issue_id", nullable = false)
    Long id;
    Date dateCreated;
    @OneToOne
    Person author;
    String content;
}
