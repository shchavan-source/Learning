package org.shchavan.learn.newConcepts.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "emp")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
}
