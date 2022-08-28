package com.homework.restapi.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="Messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String msgText;
    private Timestamp msgCreated;

    @ManyToOne
    private User user;

}
