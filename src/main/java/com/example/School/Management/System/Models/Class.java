package com.example.School.Management.System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
Long id;
    Integer classNumber;
    @ManyToOne
    @JoinColumn(name = "Student_id",referencedColumnName = "id")
    Student student;

}
