package com.example.School.Management.System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
@ManyToOne
    @JoinColumn(name = "Teacher_id",referencedColumnName = "id")
    Teacher teacher;
    @ManyToOne
@JoinColumn(name = "Class_id",referencedColumnName = "id")
  Class Class;
}
