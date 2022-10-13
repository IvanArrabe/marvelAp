package com.example.marvelapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;
    private String firstLastName;
    private String secondLastName;



    @Override
    public String toString(){
        return "Id: " + id + ": " + name;
    }
}
