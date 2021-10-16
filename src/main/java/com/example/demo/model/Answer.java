package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String answer;

    @ManyToOne(cascade = CascadeType.ALL)
    Question question;




}
