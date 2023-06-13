package org.shchavan.learn.newConcepts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "dept")
@Data
public class Department {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    /*@OneToMany(mappedBy = "department")
    private List<Employee> emps;*/
}
