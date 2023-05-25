package com.example.School.Management.System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    Integer grade;

    @ManyToOne
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    Course course;

}
